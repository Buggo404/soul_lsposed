package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/MethodWriter.SCL.lombok */
final class MethodWriter extends org.objectweb.asm.MethodVisitor {
    static final int COMPUTE_NOTHING = 0;
    static final int COMPUTE_MAX_STACK_AND_LOCAL = 1;
    static final int COMPUTE_MAX_STACK_AND_LOCAL_FROM_FRAMES = 2;
    static final int COMPUTE_INSERTED_FRAMES = 3;
    static final int COMPUTE_ALL_FRAMES = 4;

    /* renamed from: NA */
    private static final int f627NA = 0;
    private static final int[] STACK_SIZE_DELTA = null;
    private final org.objectweb.asm.SymbolTable symbolTable;
    private final int accessFlags;
    private final int nameIndex;
    private final java.lang.String name;
    private final int descriptorIndex;
    private final java.lang.String descriptor;
    private int maxStack;
    private int maxLocals;
    private final org.objectweb.asm.ByteVector code;
    private org.objectweb.asm.Handler firstHandler;
    private org.objectweb.asm.Handler lastHandler;
    private int lineNumberTableLength;
    private org.objectweb.asm.ByteVector lineNumberTable;
    private int localVariableTableLength;
    private org.objectweb.asm.ByteVector localVariableTable;
    private int localVariableTypeTableLength;
    private org.objectweb.asm.ByteVector localVariableTypeTable;
    private int stackMapTableNumberOfEntries;
    private org.objectweb.asm.ByteVector stackMapTableEntries;
    private org.objectweb.asm.AnnotationWriter lastCodeRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastCodeRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.Attribute firstCodeAttribute;
    private final int numberOfExceptions;
    private final int[] exceptionIndexTable;
    private final int signatureIndex;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private int visibleAnnotableParameterCount;
    private org.objectweb.asm.AnnotationWriter[] lastRuntimeVisibleParameterAnnotations;
    private int invisibleAnnotableParameterCount;
    private org.objectweb.asm.AnnotationWriter[] lastRuntimeInvisibleParameterAnnotations;
    private org.objectweb.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private org.objectweb.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private org.objectweb.asm.ByteVector defaultValue;
    private int parametersCount;
    private org.objectweb.asm.ByteVector parameters;
    private org.objectweb.asm.Attribute firstAttribute;
    private final int compute;
    private org.objectweb.asm.Label firstBasicBlock;
    private org.objectweb.asm.Label lastBasicBlock;
    private org.objectweb.asm.Label currentBasicBlock;
    private int relativeStackSize;
    private int maxRelativeStackSize;
    private int currentLocals;
    private int previousFrameOffset;
    private int[] previousFrame;
    private int[] currentFrame;
    private boolean hasSubroutines;
    private boolean hasAsmInstructions;
    private int lastBytecodeOffset;
    private int sourceOffset;
    private int sourceLength;

    MethodWriter(org.objectweb.asm.SymbolTable r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String[] r12, int r13) {
            r6 = this;
            r0 = r6
            r1 = 589824(0x90000, float:8.2652E-40)
            r0.<init>(r1)
            r0 = r6
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.code = r1
            r0 = r6
            r1 = r7
            r0.symbolTable = r1
            r0 = r6
            java.lang.String r1 = "<init>"
            r2 = r9
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L27
            r1 = r8
            r2 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r2
            goto L28
        L27:
            r1 = r8
        L28:
            r0.accessFlags = r1
            r0 = r6
            r1 = r7
            r2 = r9
            int r1 = r1.addConstantUtf8(r2)
            r0.nameIndex = r1
            r0 = r6
            r1 = r9
            r0.name = r1
            r0 = r6
            r1 = r7
            r2 = r10
            int r1 = r1.addConstantUtf8(r2)
            r0.descriptorIndex = r1
            r0 = r6
            r1 = r10
            r0.descriptor = r1
            r0 = r6
            r1 = r11
            if (r1 != 0) goto L53
            r1 = 0
            goto L59
        L53:
            r1 = r7
            r2 = r11
            int r1 = r1.addConstantUtf8(r2)
        L59:
            r0.signatureIndex = r1
            r0 = r12
            if (r0 == 0) goto La0
            r0 = r12
            int r0 = r0.length
            if (r0 <= 0) goto La0
            r0 = r6
            r1 = r12
            int r1 = r1.length
            r0.numberOfExceptions = r1
            r0 = r6
            r1 = r6
            int r1 = r1.numberOfExceptions
            int[] r1 = new int[r1]
            r0.exceptionIndexTable = r1
            r0 = 0
            r14 = r0
        L7b:
            r0 = r14
            r1 = r6
            int r1 = r1.numberOfExceptions
            if (r0 >= r1) goto L9d
            r0 = r6
            int[] r0 = r0.exceptionIndexTable
            r1 = r14
            r2 = r7
            r3 = r12
            r4 = r14
            r3 = r3[r4]
            org.objectweb.asm.Symbol r2 = r2.addConstantClass(r3)
            int r2 = r2.index
            r0[r1] = r2
            int r14 = r14 + 1
            goto L7b
        L9d:
            goto Laa
        La0:
            r0 = r6
            r1 = 0
            r0.numberOfExceptions = r1
            r0 = r6
            r1 = 0
            r0.exceptionIndexTable = r1
        Laa:
            r0 = r6
            r1 = r13
            r0.compute = r1
            r0 = r13
            if (r0 == 0) goto Le7
            r0 = r10
            int r0 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r1 = 2
            int r0 = r0 >> r1
            r14 = r0
            r0 = r8
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto Lc8
            int r14 = r14 + (-1)
        Lc8:
            r0 = r6
            r1 = r14
            r0.maxLocals = r1
            r0 = r6
            r1 = r14
            r0.currentLocals = r1
            r0 = r6
            org.objectweb.asm.Label r1 = new org.objectweb.asm.Label
            r2 = r1
            r2.<init>()
            r0.firstBasicBlock = r1
            r0 = r6
            r1 = r6
            org.objectweb.asm.Label r1 = r1.firstBasicBlock
            r0.visitLabel(r1)
        Le7:
            return
    }

    boolean hasFrames() {
            r2 = this;
            r0 = r2
            int r0 = r0.stackMapTableNumberOfEntries
            if (r0 <= 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    boolean hasAsmInstructions() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.hasAsmInstructions
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitParameter(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.parameters
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.parameters = r1
        L12:
            r0 = r4
            r1 = r0
            int r1 = r1.parametersCount
            r2 = 1
            int r1 = r1 + r2
            r0.parametersCount = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.parameters
            r1 = r5
            if (r1 != 0) goto L28
            r1 = 0
            goto L30
        L28:
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            int r1 = r1.addConstantUtf8(r2)
        L30:
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitAnnotationDefault() {
            r7 = this;
            r0 = r7
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.defaultValue = r1
            org.objectweb.asm.AnnotationWriter r0 = new org.objectweb.asm.AnnotationWriter
            r1 = r0
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = 0
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.defaultValue
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
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

    @Override // org.objectweb.asm.MethodVisitor
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
    public org.objectweb.asm.AnnotationVisitor visitParameterAnnotation(int r8, java.lang.String r9, boolean r10) {
            r7 = this;
            r0 = r10
            if (r0 == 0) goto L30
            r0 = r7
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeVisibleParameterAnnotations
            if (r0 != 0) goto L1a
            r0 = r7
            r1 = r7
            java.lang.String r1 = r1.descriptor
            org.objectweb.asm.Type[] r1 = org.objectweb.asm.Type.getArgumentTypes(r1)
            int r1 = r1.length
            org.objectweb.asm.AnnotationWriter[] r1 = new org.objectweb.asm.AnnotationWriter[r1]
            r0.lastRuntimeVisibleParameterAnnotations = r1
        L1a:
            r0 = r7
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeVisibleParameterAnnotations
            r1 = r8
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r9
            r4 = r7
            org.objectweb.asm.AnnotationWriter[] r4 = r4.lastRuntimeVisibleParameterAnnotations
            r5 = r8
            r4 = r4[r5]
            org.objectweb.asm.AnnotationWriter r2 = org.objectweb.asm.AnnotationWriter.create(r2, r3, r4)
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            return r0
        L30:
            r0 = r7
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeInvisibleParameterAnnotations
            if (r0 != 0) goto L46
            r0 = r7
            r1 = r7
            java.lang.String r1 = r1.descriptor
            org.objectweb.asm.Type[] r1 = org.objectweb.asm.Type.getArgumentTypes(r1)
            int r1 = r1.length
            org.objectweb.asm.AnnotationWriter[] r1 = new org.objectweb.asm.AnnotationWriter[r1]
            r0.lastRuntimeInvisibleParameterAnnotations = r1
        L46:
            r0 = r7
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeInvisibleParameterAnnotations
            r1 = r8
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r9
            r4 = r7
            org.objectweb.asm.AnnotationWriter[] r4 = r4.lastRuntimeInvisibleParameterAnnotations
            r5 = r8
            r4 = r4[r5]
            org.objectweb.asm.AnnotationWriter r2 = org.objectweb.asm.AnnotationWriter.create(r2, r3, r4)
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitAttribute(org.objectweb.asm.Attribute r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0.isCodeAttribute()
            if (r0 == 0) goto L17
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.firstCodeAttribute
            r0.nextAttribute = r1
            r0 = r3
            r1 = r4
            r0.firstCodeAttribute = r1
            goto L24
        L17:
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r0.nextAttribute = r1
            r0 = r3
            r1 = r4
            r0.firstAttribute = r1
        L24:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitCode() {
            r1 = this;
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFrame(int r8, int r9, java.lang.Object[] r10, int r11, java.lang.Object[] r12) {
            r7 = this;
            r0 = r7
            int r0 = r0.compute
            r1 = 4
            if (r0 != r1) goto L9
            return
        L9:
            r0 = r7
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L79
            r0 = r7
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            if (r0 != 0) goto L52
            r0 = r7
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.CurrentFrame r1 = new org.objectweb.asm.CurrentFrame
            r2 = r1
            r3 = r7
            org.objectweb.asm.Label r3 = r3.currentBasicBlock
            r2.<init>(r3)
            r0.frame = r1
            r0 = r7
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r2 = r2.accessFlags
            r3 = r7
            java.lang.String r3 = r3.descriptor
            r4 = r9
            r0.setInputFrameFromDescriptor(r1, r2, r3, r4)
            r0 = r7
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r0.accept(r1)
            goto L2bd
        L52:
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L6b
            r0 = r7
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.setInputFrameFromApiFormat(r1, r2, r3, r4, r5)
        L6b:
            r0 = r7
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r0.accept(r1)
            goto L2bd
        L79:
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L11f
            r0 = r7
            int[] r0 = r0.previousFrame
            if (r0 != 0) goto Lb9
            r0 = r7
            java.lang.String r0 = r0.descriptor
            int r0 = org.objectweb.asm.Type.getArgumentsAndReturnSizes(r0)
            r1 = 2
            int r0 = r0 >> r1
            r13 = r0
            org.objectweb.asm.Frame r0 = new org.objectweb.asm.Frame
            r1 = r0
            org.objectweb.asm.Label r2 = new org.objectweb.asm.Label
            r3 = r2
            r3.<init>()
            r1.<init>(r2)
            r14 = r0
            r0 = r14
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r2 = r2.accessFlags
            r3 = r7
            java.lang.String r3 = r3.descriptor
            r4 = r13
            r0.setInputFrameFromDescriptor(r1, r2, r3, r4)
            r0 = r14
            r1 = r7
            r0.accept(r1)
        Lb9:
            r0 = r7
            r1 = r9
            r0.currentLocals = r1
            r0 = r7
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r2 = r9
            r3 = r11
            int r0 = r0.visitFrameStart(r1, r2, r3)
            r13 = r0
            r0 = 0
            r14 = r0
        Ld1:
            r0 = r14
            r1 = r9
            if (r0 >= r1) goto Lf2
            r0 = r7
            int[] r0 = r0.currentFrame
            r1 = r13
            int r13 = r13 + 1
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r10
            r4 = r14
            r3 = r3[r4]
            int r2 = org.objectweb.asm.Frame.getAbstractTypeFromApiFormat(r2, r3)
            r0[r1] = r2
            int r14 = r14 + 1
            goto Ld1
        Lf2:
            r0 = 0
            r14 = r0
        Lf5:
            r0 = r14
            r1 = r11
            if (r0 >= r1) goto L118
            r0 = r7
            int[] r0 = r0.currentFrame
            r1 = r13
            int r13 = r13 + 1
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r12
            r4 = r14
            r3 = r3[r4]
            int r2 = org.objectweb.asm.Frame.getAbstractTypeFromApiFormat(r2, r3)
            r0[r1] = r2
            int r14 = r14 + 1
            goto Lf5
        L118:
            r0 = r7
            r0.visitFrameEnd()
            goto L2bd
        L11f:
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 50
            if (r0 >= r1) goto L136
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Class versions V1_5 or less must use F_NEW frames."
            r1.<init>(r2)
            throw r0
        L136:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            if (r0 != 0) goto L154
            r0 = r7
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.stackMapTableEntries = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            int r0 = r0.length
            r13 = r0
            goto L177
        L154:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            int r0 = r0.length
            r1 = r7
            int r1 = r1.previousFrameOffset
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
            r13 = r0
            r0 = r13
            if (r0 >= 0) goto L177
            r0 = r8
            r1 = 3
            if (r0 != r1) goto L16f
            return
        L16f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L177:
            r0 = r8
            switch(r0) {
                case 0: goto L19c;
                case 1: goto L1f2;
                case 2: goto L228;
                case 3: goto L247;
                case 4: goto L26e;
                default: goto L2a0;
            }
        L19c:
            r0 = r7
            r1 = r9
            r0.currentLocals = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 255(0xff, float:3.57E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r14 = r0
        L1b8:
            r0 = r14
            r1 = r9
            if (r0 >= r1) goto L1cc
            r0 = r7
            r1 = r10
            r2 = r14
            r1 = r1[r2]
            r0.putFrameType(r1)
            int r14 = r14 + 1
            goto L1b8
        L1cc:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = r11
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r14 = r0
        L1d9:
            r0 = r14
            r1 = r11
            if (r0 >= r1) goto L1ef
            r0 = r7
            r1 = r12
            r2 = r14
            r1 = r1[r2]
            r0.putFrameType(r1)
            int r14 = r14 + 1
            goto L1d9
        L1ef:
            goto L2a8
        L1f2:
            r0 = r7
            r1 = r0
            int r1 = r1.currentLocals
            r2 = r9
            int r1 = r1 + r2
            r0.currentLocals = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r9
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r14 = r0
        L211:
            r0 = r14
            r1 = r9
            if (r0 >= r1) goto L225
            r0 = r7
            r1 = r10
            r2 = r14
            r1 = r1[r2]
            r0.putFrameType(r1)
            int r14 = r14 + 1
            goto L211
        L225:
            goto L2a8
        L228:
            r0 = r7
            r1 = r0
            int r1 = r1.currentLocals
            r2 = r9
            int r1 = r1 - r2
            r0.currentLocals = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r9
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L2a8
        L247:
            r0 = r13
            r1 = 64
            if (r0 >= r1) goto L25b
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L2a8
        L25b:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 251(0xfb, float:3.52E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L2a8
        L26e:
            r0 = r13
            r1 = 64
            if (r0 >= r1) goto L285
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 64
            r2 = r13
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L295
        L285:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 247(0xf7, float:3.46E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L295:
            r0 = r7
            r1 = r12
            r2 = 0
            r1 = r1[r2]
            r0.putFrameType(r1)
            goto L2a8
        L2a0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L2a8:
            r0 = r7
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.previousFrameOffset = r1
            r0 = r7
            r1 = r0
            int r1 = r1.stackMapTableNumberOfEntries
            r2 = 1
            int r1 = r1 + r2
            r0.stackMapTableNumberOfEntries = r1
        L2bd:
            r0 = r7
            int r0 = r0.compute
            r1 = 2
            if (r0 != r1) goto L30e
            r0 = r7
            r1 = r11
            r0.relativeStackSize = r1
            r0 = 0
            r13 = r0
        L2ce:
            r0 = r13
            r1 = r11
            if (r0 >= r1) goto L2fb
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.LONG
            if (r0 == r1) goto L2eb
            r0 = r12
            r1 = r13
            r0 = r0[r1]
            java.lang.Integer r1 = org.objectweb.asm.Opcodes.DOUBLE
            if (r0 != r1) goto L2f5
        L2eb:
            r0 = r7
            r1 = r0
            int r1 = r1.relativeStackSize
            r2 = 1
            int r1 = r1 + r2
            r0.relativeStackSize = r1
        L2f5:
            int r13 = r13 + 1
            goto L2ce
        L2fb:
            r0 = r7
            int r0 = r0.relativeStackSize
            r1 = r7
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto L30e
            r0 = r7
            r1 = r7
            int r1 = r1.relativeStackSize
            r0.maxRelativeStackSize = r1
        L30e:
            r0 = r7
            r1 = r7
            int r1 = r1.maxStack
            r2 = r11
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxStack = r1
            r0 = r7
            r1 = r7
            int r1 = r1.maxLocals
            r2 = r7
            int r2 = r2.currentLocals
            int r1 = java.lang.Math.max(r1, r2)
            r0.maxLocals = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInsn(int r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L72
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L2b
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L3c
        L2b:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r2 = 0
            r3 = 0
            r4 = 0
            r0.execute(r1, r2, r3, r4)
            goto L59
        L3c:
            r0 = r6
            int r0 = r0.relativeStackSize
            int[] r1 = org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
            r2 = r7
            r1 = r1[r2]
            int r0 = r0 + r1
            r8 = r0
            r0 = r8
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto L54
            r0 = r6
            r1 = r8
            r0.maxRelativeStackSize = r1
        L54:
            r0 = r6
            r1 = r8
            r0.relativeStackSize = r1
        L59:
            r0 = r7
            r1 = 172(0xac, float:2.41E-43)
            if (r0 < r1) goto L67
            r0 = r7
            r1 = 177(0xb1, float:2.48E-43)
            if (r0 <= r1) goto L6e
        L67:
            r0 = r7
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 != r1) goto L72
        L6e:
            r0 = r6
            r0.endCurrentBasicBlockWithNoSuccessor()
        L72:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIntInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r7
            r1 = 17
            if (r0 != r1) goto L1e
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L28
        L1e:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
        L28:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L70
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L3f
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L50
        L3f:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = 0
            r0.execute(r1, r2, r3, r4)
            goto L70
        L50:
            r0 = r7
            r1 = 188(0xbc, float:2.63E-43)
            if (r0 == r1) goto L70
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto L6b
            r0 = r6
            r1 = r9
            r0.maxRelativeStackSize = r1
        L6b:
            r0 = r6
            r1 = r9
            r0.relativeStackSize = r1
        L70:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitVarInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r8
            r1 = 4
            if (r0 >= r1) goto L44
            r0 = r7
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 == r1) goto L44
            r0 = r7
            r1 = 54
            if (r0 >= r1) goto L2c
            r0 = 26
            r1 = r7
            r2 = 21
            int r1 = r1 - r2
            r2 = 2
            int r1 = r1 << r2
            int r0 = r0 + r1
            r1 = r8
            int r0 = r0 + r1
            r9 = r0
            goto L38
        L2c:
            r0 = 59
            r1 = r7
            r2 = 54
            int r1 = r1 - r2
            r2 = 2
            int r1 = r1 << r2
            int r0 = r0 + r1
            r1 = r8
            int r0 = r0 + r1
            r9 = r0
        L38:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L68
        L44:
            r0 = r8
            r1 = 256(0x100, float:3.59E-43)
            if (r0 < r1) goto L5e
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 196(0xc4, float:2.75E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L68
        L5e:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
        L68:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto Ld6
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L7f
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L90
        L7f:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = 0
            r0.execute(r1, r2, r3, r4)
            goto Ld6
        L90:
            r0 = r7
            r1 = 169(0xa9, float:2.37E-43)
            if (r0 != r1) goto Lb9
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            r1 = r0
            short r1 = r1.flags
            r2 = 64
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            r1 = r6
            int r1 = r1.relativeStackSize
            short r1 = (short) r1
            r0.outputStackSize = r1
            r0 = r6
            r0.endCurrentBasicBlockWithNoSuccessor()
            goto Ld6
        Lb9:
            r0 = r6
            int r0 = r0.relativeStackSize
            int[] r1 = org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
            r2 = r7
            r1 = r1[r2]
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto Ld1
            r0 = r6
            r1 = r9
            r0.maxRelativeStackSize = r1
        Ld1:
            r0 = r6
            r1 = r9
            r0.relativeStackSize = r1
        Ld6:
            r0 = r6
            int r0 = r0.compute
            if (r0 == 0) goto L10d
            r0 = r7
            r1 = 22
            if (r0 == r1) goto Lf5
            r0 = r7
            r1 = 24
            if (r0 == r1) goto Lf5
            r0 = r7
            r1 = 55
            if (r0 == r1) goto Lf5
            r0 = r7
            r1 = 57
            if (r0 != r1) goto Lfc
        Lf5:
            r0 = r8
            r1 = 2
            int r0 = r0 + r1
            r9 = r0
            goto L100
        Lfc:
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
        L100:
            r0 = r9
            r1 = r6
            int r1 = r1.maxLocals
            if (r0 <= r1) goto L10d
            r0 = r6
            r1 = r9
            r0.maxLocals = r1
        L10d:
            r0 = r7
            r1 = 54
            if (r0 < r1) goto L12d
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 != r1) goto L12d
            r0 = r6
            org.objectweb.asm.Handler r0 = r0.firstHandler
            if (r0 == 0) goto L12d
            r0 = r6
            org.objectweb.asm.Label r1 = new org.objectweb.asm.Label
            r2 = r1
            r2.<init>()
            r0.visitLabel(r1)
        L12d:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTypeInsn(int r7, java.lang.String r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r8
            org.objectweb.asm.Symbol r0 = r0.addConstantClass(r1)
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            r2 = r9
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L73
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L38
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L4f
        L38:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r2 = r6
            int r2 = r2.lastBytecodeOffset
            r3 = r9
            r4 = r6
            org.objectweb.asm.SymbolTable r4 = r4.symbolTable
            r0.execute(r1, r2, r3, r4)
            goto L73
        L4f:
            r0 = r7
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L73
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = 1
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto L6d
            r0 = r6
            r1 = r10
            r0.maxRelativeStackSize = r1
        L6d:
            r0 = r6
            r1 = r10
            r0.relativeStackSize = r1
        L73:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitFieldInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r8
            r2 = r9
            r3 = r10
            org.objectweb.asm.Symbol r0 = r0.addConstantFieldref(r1, r2, r3)
            r11 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            r2 = r11
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L101
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L3d
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L52
        L3d:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r2 = 0
            r3 = r11
            r4 = r6
            org.objectweb.asm.SymbolTable r4 = r4.symbolTable
            r0.execute(r1, r2, r3, r4)
            goto L101
        L52:
            r0 = r10
            r1 = 0
            char r0 = r0.charAt(r1)
            r13 = r0
            r0 = r7
            switch(r0) {
                case 178: goto L78;
                case 179: goto L95;
                case 180: goto Lb3;
                case 181: goto Ld0;
                default: goto Ld0;
            }
        L78:
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r13
            r2 = 68
            if (r1 == r2) goto L8a
            r1 = r13
            r2 = 74
            if (r1 != r2) goto L8e
        L8a:
            r1 = 2
            goto L8f
        L8e:
            r1 = 1
        L8f:
            int r0 = r0 + r1
            r12 = r0
            goto Lec
        L95:
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r13
            r2 = 68
            if (r1 == r2) goto La7
            r1 = r13
            r2 = 74
            if (r1 != r2) goto Lac
        La7:
            r1 = -2
            goto Lad
        Lac:
            r1 = -1
        Lad:
            int r0 = r0 + r1
            r12 = r0
            goto Lec
        Lb3:
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r13
            r2 = 68
            if (r1 == r2) goto Lc5
            r1 = r13
            r2 = 74
            if (r1 != r2) goto Lc9
        Lc5:
            r1 = 1
            goto Lca
        Lc9:
            r1 = 0
        Lca:
            int r0 = r0 + r1
            r12 = r0
            goto Lec
        Ld0:
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r13
            r2 = 68
            if (r1 == r2) goto Le2
            r1 = r13
            r2 = 74
            if (r1 != r2) goto Le7
        Le2:
            r1 = -3
            goto Le9
        Le7:
            r1 = -2
        Le9:
            int r0 = r0 + r1
            r12 = r0
        Lec:
            r0 = r12
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto Lfb
            r0 = r6
            r1 = r12
            r0.maxRelativeStackSize = r1
        Lfb:
            r0 = r6
            r1 = r12
            r0.relativeStackSize = r1
        L101:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMethodInsn(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.objectweb.asm.Symbol r0 = r0.addConstantMethodref(r1, r2, r3, r4)
            r12 = r0
            r0 = r7
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L3f
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 185(0xb9, float:2.59E-43)
            r2 = r12
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r1 = r12
            int r1 = r1.getArgumentsAndReturnSizes()
            r2 = 2
            int r1 = r1 >> r2
            r2 = 0
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
            goto L4d
        L3f:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            r2 = r12
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
        L4d:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto Lbe
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L64
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L79
        L64:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r2 = 0
            r3 = r12
            r4 = r6
            org.objectweb.asm.SymbolTable r4 = r4.symbolTable
            r0.execute(r1, r2, r3, r4)
            goto Lbe
        L79:
            r0 = r12
            int r0 = r0.getArgumentsAndReturnSizes()
            r13 = r0
            r0 = r13
            r1 = 3
            r0 = r0 & r1
            r1 = r13
            r2 = 2
            int r1 = r1 >> r2
            int r0 = r0 - r1
            r14 = r0
            r0 = r7
            r1 = 184(0xb8, float:2.58E-43)
            if (r0 != r1) goto La0
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r14
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 + r1
            r15 = r0
            goto La9
        La0:
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r14
            int r0 = r0 + r1
            r15 = r0
        La9:
            r0 = r15
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto Lb8
            r0 = r6
            r1 = r15
            r0.maxRelativeStackSize = r1
        Lb8:
            r0 = r6
            r1 = r15
            r0.relativeStackSize = r1
        Lbe:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitInvokeDynamicInsn(java.lang.String r7, java.lang.String r8, org.objectweb.asm.Handle r9, java.lang.Object... r10) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.objectweb.asm.Symbol r0 = r0.addConstantInvokeDynamic(r1, r2, r3, r4)
            r11 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 186(0xba, float:2.6E-43)
            r2 = r11
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L92
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L49
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L60
        L49:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = 186(0xba, float:2.6E-43)
            r2 = 0
            r3 = r11
            r4 = r6
            org.objectweb.asm.SymbolTable r4 = r4.symbolTable
            r0.execute(r1, r2, r3, r4)
            goto L92
        L60:
            r0 = r11
            int r0 = r0.getArgumentsAndReturnSizes()
            r12 = r0
            r0 = r12
            r1 = 3
            r0 = r0 & r1
            r1 = r12
            r2 = 2
            int r1 = r1 >> r2
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r13 = r0
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r13
            int r0 = r0 + r1
            r14 = r0
            r0 = r14
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto L8c
            r0 = r6
            r1 = r14
            r0.maxRelativeStackSize = r1
        L8c:
            r0 = r6
            r1 = r14
            r0.relativeStackSize = r1
        L92:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitJumpInsn(int r7, org.objectweb.asm.Label r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r7
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L19
            r0 = r7
            r1 = 33
            int r0 = r0 - r1
            goto L1a
        L19:
            r0 = r7
        L1a:
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r8
            short r0 = r0.flags
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto Lb1
            r0 = r8
            int r0 = r0.bytecodeOffset
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            int r0 = r0 - r1
            r1 = -32768(0xffffffffffff8000, float:NaN)
            if (r0 >= r1) goto Lb1
            r0 = r9
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 != r1) goto L4e
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 200(0xc8, float:2.8E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L9c
        L4e:
            r0 = r9
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L63
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 201(0xc9, float:2.82E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L9c
        L63:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r9
            r2 = 198(0xc6, float:2.77E-43)
            if (r1 < r2) goto L74
            r1 = r9
            r2 = 1
            r1 = r1 ^ r2
            goto L7b
        L74:
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            r2 = 1
            r1 = r1 ^ r2
            r2 = 1
            int r1 = r1 - r2
        L7b:
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 220(0xdc, float:3.08E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r6
            r1 = 1
            r0.hasAsmInstructions = r1
            r0 = 1
            r10 = r0
        L9c:
            r0 = r8
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            r2 = r6
            org.objectweb.asm.ByteVector r2 = r2.code
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            r3 = 1
            r0.put(r1, r2, r3)
            goto Lef
        Lb1:
            r0 = r9
            r1 = r7
            if (r0 == r1) goto Ld4
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r8
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            r2 = r6
            org.objectweb.asm.ByteVector r2 = r2.code
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            r3 = 1
            r0.put(r1, r2, r3)
            goto Lef
        Ld4:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r8
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            r2 = r6
            org.objectweb.asm.ByteVector r2 = r2.code
            int r2 = r2.length
            r3 = 1
            int r2 = r2 - r3
            r3 = 0
            r0.put(r1, r2, r3)
        Lef:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L1ee
            r0 = 0
            r11 = r0
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 != r1) goto L136
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
            r0.execute(r1, r2, r3, r4)
            r0 = r8
            org.objectweb.asm.Label r0 = r0.getCanonicalInstance()
            r1 = r0
            short r1 = r1.flags
            r2 = 2
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r6
            r1 = 0
            r2 = r8
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
            r0 = r9
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto L1c7
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r11 = r0
            goto L1c7
        L136:
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L14f
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
            r0.execute(r1, r2, r3, r4)
            goto L1c7
        L14f:
            r0 = r6
            int r0 = r0.compute
            r1 = 2
            if (r0 != r1) goto L168
            r0 = r6
            r1 = r0
            int r1 = r1.relativeStackSize
            int[] r2 = org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
            r3 = r9
            r2 = r2[r3]
            int r1 = r1 + r2
            r0.relativeStackSize = r1
            goto L1c7
        L168:
            r0 = r9
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto L1b0
            r0 = r8
            short r0 = r0.flags
            r1 = 32
            r0 = r0 & r1
            if (r0 != 0) goto L18a
            r0 = r8
            r1 = r0
            short r1 = r1.flags
            r2 = 32
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r6
            r1 = 1
            r0.hasSubroutines = r1
        L18a:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            r1 = r0
            short r1 = r1.flags
            r2 = 16
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r6
            r1 = r6
            int r1 = r1.relativeStackSize
            r2 = 1
            int r1 = r1 + r2
            r2 = r8
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r11 = r0
            goto L1c7
        L1b0:
            r0 = r6
            r1 = r0
            int r1 = r1.relativeStackSize
            int[] r2 = org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA
            r3 = r9
            r2 = r2[r3]
            int r1 = r1 + r2
            r0.relativeStackSize = r1
            r0 = r6
            r1 = r6
            int r1 = r1.relativeStackSize
            r2 = r8
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
        L1c7:
            r0 = r11
            if (r0 == 0) goto L1e3
            r0 = r10
            if (r0 == 0) goto L1dd
            r0 = r11
            r1 = r0
            short r1 = r1.flags
            r2 = 2
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
        L1dd:
            r0 = r6
            r1 = r11
            r0.visitLabel(r1)
        L1e3:
            r0 = r9
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 != r1) goto L1ee
            r0 = r6
            r0.endCurrentBasicBlockWithNoSuccessor()
        L1ee:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLabel(org.objectweb.asm.Label r7) {
            r6 = this;
            r0 = r6
            r1 = r0
            boolean r1 = r1.hasAsmInstructions
            r2 = r7
            r3 = r6
            org.objectweb.asm.ByteVector r3 = r3.code
            byte[] r3 = r3.data
            r4 = r6
            org.objectweb.asm.ByteVector r4 = r4.code
            int r4 = r4.length
            boolean r2 = r2.resolve(r3, r4)
            r1 = r1 | r2
            r0.hasAsmInstructions = r1
            r0 = r7
            short r0 = r0.flags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L25
            return
        L25:
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 != r1) goto Lc4
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L67
            r0 = r7
            int r0 = r0.bytecodeOffset
            r1 = r6
            org.objectweb.asm.Label r1 = r1.currentBasicBlock
            int r1 = r1.bytecodeOffset
            if (r0 != r1) goto L61
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            r1 = r0
            short r1 = r1.flags
            r2 = r7
            short r2 = r2.flags
            r3 = 2
            r2 = r2 & r3
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r7
            r1 = r6
            org.objectweb.asm.Label r1 = r1.currentBasicBlock
            org.objectweb.asm.Frame r1 = r1.frame
            r0.frame = r1
            return
        L61:
            r0 = r6
            r1 = 0
            r2 = r7
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
        L67:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.lastBasicBlock
            if (r0 == 0) goto Lab
            r0 = r7
            int r0 = r0.bytecodeOffset
            r1 = r6
            org.objectweb.asm.Label r1 = r1.lastBasicBlock
            int r1 = r1.bytecodeOffset
            if (r0 != r1) goto La3
            r0 = r6
            org.objectweb.asm.Label r0 = r0.lastBasicBlock
            r1 = r0
            short r1 = r1.flags
            r2 = r7
            short r2 = r2.flags
            r3 = 2
            r2 = r2 & r3
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r7
            r1 = r6
            org.objectweb.asm.Label r1 = r1.lastBasicBlock
            org.objectweb.asm.Frame r1 = r1.frame
            r0.frame = r1
            r0 = r6
            r1 = r6
            org.objectweb.asm.Label r1 = r1.lastBasicBlock
            r0.currentBasicBlock = r1
            return
        La3:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.lastBasicBlock
            r1 = r7
            r0.nextBasicBlock = r1
        Lab:
            r0 = r6
            r1 = r7
            r0.lastBasicBlock = r1
            r0 = r6
            r1 = r7
            r0.currentBasicBlock = r1
            r0 = r7
            org.objectweb.asm.Frame r1 = new org.objectweb.asm.Frame
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.frame = r1
            goto L147
        Lc4:
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto Le9
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 != 0) goto Ldb
            r0 = r6
            r1 = r7
            r0.currentBasicBlock = r1
            goto L147
        Ldb:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r0.owner = r1
            goto L147
        Le9:
            r0 = r6
            int r0 = r0.compute
            r1 = 1
            if (r0 != r1) goto L133
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L10d
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            short r1 = (short) r1
            r0.outputStackMax = r1
            r0 = r6
            r1 = r6
            int r1 = r1.relativeStackSize
            r2 = r7
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
        L10d:
            r0 = r6
            r1 = r7
            r0.currentBasicBlock = r1
            r0 = r6
            r1 = 0
            r0.relativeStackSize = r1
            r0 = r6
            r1 = 0
            r0.maxRelativeStackSize = r1
            r0 = r6
            org.objectweb.asm.Label r0 = r0.lastBasicBlock
            if (r0 == 0) goto L12b
            r0 = r6
            org.objectweb.asm.Label r0 = r0.lastBasicBlock
            r1 = r7
            r0.nextBasicBlock = r1
        L12b:
            r0 = r6
            r1 = r7
            r0.lastBasicBlock = r1
            goto L147
        L133:
            r0 = r6
            int r0 = r0.compute
            r1 = 2
            if (r0 != r1) goto L147
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 != 0) goto L147
            r0 = r6
            r1 = r7
            r0.currentBasicBlock = r1
        L147:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLdcInsn(java.lang.Object r7) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            org.objectweb.asm.Symbol r0 = r0.addConstant(r1)
            r8 = r0
            r0 = r8
            int r0 = r0.index
            r9 = r0
            r0 = r8
            int r0 = r0.tag
            r1 = 5
            if (r0 == r1) goto L4a
            r0 = r8
            int r0 = r0.tag
            r1 = 6
            if (r0 == r1) goto L4a
            r0 = r8
            int r0 = r0.tag
            r1 = 17
            if (r0 != r1) goto L4e
            r0 = r8
            java.lang.String r0 = r0.value
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = r0
            r10 = r1
            r1 = 74
            if (r0 == r1) goto L4a
            r0 = r10
            r1 = 68
            if (r0 != r1) goto L4e
        L4a:
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L64
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 20
            r2 = r9
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L84
        L64:
            r0 = r9
            r1 = 256(0x100, float:3.59E-43)
            if (r0 < r1) goto L79
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 19
            r2 = r9
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            goto L84
        L79:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 18
            r2 = r9
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
        L84:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto Ld6
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L9b
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto Lb0
        L9b:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = 18
            r2 = 0
            r3 = r8
            r4 = r6
            org.objectweb.asm.SymbolTable r4 = r4.symbolTable
            r0.execute(r1, r2, r3, r4)
            goto Ld6
        Lb0:
            r0 = r6
            int r0 = r0.relativeStackSize
            r1 = r11
            if (r1 == 0) goto Lbd
            r1 = 2
            goto Lbe
        Lbd:
            r1 = 1
        Lbe:
            int r0 = r0 + r1
            r12 = r0
            r0 = r12
            r1 = r6
            int r1 = r1.maxRelativeStackSize
            if (r0 <= r1) goto Ld0
            r0 = r6
            r1 = r12
            r0.maxRelativeStackSize = r1
        Ld0:
            r0 = r6
            r1 = r12
            r0.relativeStackSize = r1
        Ld6:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitIincInsn(int r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r7
            r1 = 255(0xff, float:3.57E-43)
            if (r0 > r1) goto L1e
            r0 = r8
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L1e
            r0 = r8
            r1 = -128(0xffffffffffffff80, float:NaN)
            if (r0 >= r1) goto L37
        L1e:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 196(0xc4, float:2.75E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = 132(0x84, float:1.85E-43)
            r2 = r7
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L47
        L37:
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 132(0x84, float:1.85E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r7
            r2 = r8
            org.objectweb.asm.ByteVector r0 = r0.put11(r1, r2)
        L47:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L6e
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L5e
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L6e
        L5e:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = 132(0x84, float:1.85E-43)
            r2 = r7
            r3 = 0
            r4 = 0
            r0.execute(r1, r2, r3, r4)
        L6e:
            r0 = r6
            int r0 = r0.compute
            if (r0 == 0) goto L86
            r0 = r7
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r6
            int r1 = r1.maxLocals
            if (r0 <= r1) goto L86
            r0 = r6
            r1 = r9
            r0.maxLocals = r1
        L86:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTableSwitchInsn(int r8, int r9, org.objectweb.asm.Label r10, org.objectweb.asm.Label... r11) {
            r7 = this;
            r0 = r7
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 170(0xaa, float:2.38E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = 0
            r2 = 0
            r3 = 4
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.code
            int r4 = r4.length
            r5 = 4
            int r4 = r4 % r5
            int r3 = r3 - r4
            r4 = 4
            int r3 = r3 % r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r10
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            r2 = r7
            int r2 = r2.lastBytecodeOffset
            r3 = 1
            r0.put(r1, r2, r3)
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r9
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r11
            r12 = r0
            r0 = r12
            int r0 = r0.length
            r13 = r0
            r0 = 0
            r14 = r0
        L4e:
            r0 = r14
            r1 = r13
            if (r0 >= r1) goto L70
            r0 = r12
            r1 = r14
            r0 = r0[r1]
            r15 = r0
            r0 = r15
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            r2 = r7
            int r2 = r2.lastBytecodeOffset
            r3 = 1
            r0.put(r1, r2, r3)
            int r14 = r14 + 1
            goto L4e
        L70:
            r0 = r7
            r1 = r10
            r2 = r11
            r0.visitSwitchInsn(r1, r2)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLookupSwitchInsn(org.objectweb.asm.Label r8, int[] r9, org.objectweb.asm.Label[] r10) {
            r7 = this;
            r0 = r7
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 171(0xab, float:2.4E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = 0
            r2 = 0
            r3 = 4
            r4 = r7
            org.objectweb.asm.ByteVector r4 = r4.code
            int r4 = r4.length
            r5 = 4
            int r4 = r4 % r5
            int r3 = r3 - r4
            r4 = 4
            int r3 = r3 % r4
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r8
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            r2 = r7
            int r2 = r2.lastBytecodeOffset
            r3 = 1
            r0.put(r1, r2, r3)
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r10
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = 0
            r11 = r0
        L42:
            r0 = r11
            r1 = r10
            int r1 = r1.length
            if (r0 >= r1) goto L6b
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = r9
            r2 = r11
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r0 = r10
            r1 = r11
            r0 = r0[r1]
            r1 = r7
            org.objectweb.asm.ByteVector r1 = r1.code
            r2 = r7
            int r2 = r2.lastBytecodeOffset
            r3 = 1
            r0.put(r1, r2, r3)
            int r11 = r11 + 1
            goto L42
        L6b:
            r0 = r7
            r1 = r8
            r2 = r10
            r0.visitSwitchInsn(r1, r2)
            return
    }

    private void visitSwitchInsn(org.objectweb.asm.Label r7, org.objectweb.asm.Label[] r8) {
            r6 = this;
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto Lad
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 != r1) goto L68
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = 171(0xab, float:2.4E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r0.execute(r1, r2, r3, r4)
            r0 = r6
            r1 = 0
            r2 = r7
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
            r0 = r7
            org.objectweb.asm.Label r0 = r0.getCanonicalInstance()
            r1 = r0
            short r1 = r1.flags
            r2 = 2
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L3c:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L65
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r6
            r1 = 0
            r2 = r12
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
            r0 = r12
            org.objectweb.asm.Label r0 = r0.getCanonicalInstance()
            r1 = r0
            short r1 = r1.flags
            r2 = 2
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            int r11 = r11 + 1
            goto L3c
        L65:
            goto La9
        L68:
            r0 = r6
            int r0 = r0.compute
            r1 = 1
            if (r0 != r1) goto La9
            r0 = r6
            r1 = r0
            int r1 = r1.relativeStackSize
            r2 = 1
            int r1 = r1 - r2
            r0.relativeStackSize = r1
            r0 = r6
            r1 = r6
            int r1 = r1.relativeStackSize
            r2 = r7
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L8c:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto La9
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r6
            r1 = r6
            int r1 = r1.relativeStackSize
            r2 = r12
            r0.addSuccessorToCurrentBasicBlock(r1, r2)
            int r11 = r11 + 1
            goto L8c
        La9:
            r0 = r6
            r0.endCurrentBasicBlockWithNoSuccessor()
        Lad:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMultiANewArrayInsn(java.lang.String r7, int r8) {
            r6 = this;
            r0 = r6
            r1 = r6
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            r0.lastBytecodeOffset = r1
            r0 = r6
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r7
            org.objectweb.asm.Symbol r0 = r0.addConstantClass(r1)
            r9 = r0
            r0 = r6
            org.objectweb.asm.ByteVector r0 = r0.code
            r1 = 197(0xc5, float:2.76E-43)
            r2 = r9
            int r2 = r2.index
            org.objectweb.asm.ByteVector r0 = r0.put12(r1, r2)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            if (r0 == 0) goto L60
            r0 = r6
            int r0 = r0.compute
            r1 = 4
            if (r0 == r1) goto L3e
            r0 = r6
            int r0 = r0.compute
            r1 = 3
            if (r0 != r1) goto L54
        L3e:
            r0 = r6
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = 197(0xc5, float:2.76E-43)
            r2 = r8
            r3 = r9
            r4 = r6
            org.objectweb.asm.SymbolTable r4 = r4.symbolTable
            r0.execute(r1, r2, r3, r4)
            goto L60
        L54:
            r0 = r6
            r1 = r0
            int r1 = r1.relativeStackSize
            r2 = 1
            r3 = r8
            int r2 = r2 - r3
            int r1 = r1 + r2
            r0.relativeStackSize = r1
        L60:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitInsnAnnotation(int r8, org.objectweb.asm.TypePath r9, java.lang.String r10, boolean r11) {
            r7 = this;
            r0 = r11
            if (r0 == 0) goto L25
            r0 = r7
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            r3 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r2 = r2 & r3
            r3 = r7
            int r3 = r3.lastBytecodeOffset
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r3 = r9
            r4 = r10
            r5 = r7
            org.objectweb.asm.AnnotationWriter r5 = r5.lastCodeRuntimeVisibleTypeAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3, r4, r5)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastCodeRuntimeVisibleTypeAnnotation = r2
            return r0
        L25:
            r0 = r7
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            r3 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r2 = r2 & r3
            r3 = r7
            int r3 = r3.lastBytecodeOffset
            r4 = 8
            int r3 = r3 << r4
            r2 = r2 | r3
            r3 = r9
            r4 = r10
            r5 = r7
            org.objectweb.asm.AnnotationWriter r5 = r5.lastCodeRuntimeInvisibleTypeAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3, r4, r5)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastCodeRuntimeInvisibleTypeAnnotation = r2
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitTryCatchBlock(org.objectweb.asm.Label r9, org.objectweb.asm.Label r10, org.objectweb.asm.Label r11, java.lang.String r12) {
            r8 = this;
            org.objectweb.asm.Handler r0 = new org.objectweb.asm.Handler
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            if (r5 == 0) goto L1b
            r5 = r8
            org.objectweb.asm.SymbolTable r5 = r5.symbolTable
            r6 = r12
            org.objectweb.asm.Symbol r5 = r5.addConstantClass(r6)
            int r5 = r5.index
            goto L1c
        L1b:
            r5 = 0
        L1c:
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r13 = r0
            r0 = r8
            org.objectweb.asm.Handler r0 = r0.firstHandler
            if (r0 != 0) goto L33
            r0 = r8
            r1 = r13
            r0.firstHandler = r1
            goto L3c
        L33:
            r0 = r8
            org.objectweb.asm.Handler r0 = r0.lastHandler
            r1 = r13
            r0.nextHandler = r1
        L3c:
            r0 = r8
            r1 = r13
            r0.lastHandler = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitTryCatchAnnotation(int r8, org.objectweb.asm.TypePath r9, java.lang.String r10, boolean r11) {
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
            org.objectweb.asm.AnnotationWriter r5 = r5.lastCodeRuntimeVisibleTypeAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3, r4, r5)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastCodeRuntimeVisibleTypeAnnotation = r2
            return r0
        L19:
            r0 = r7
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r7
            org.objectweb.asm.AnnotationWriter r5 = r5.lastCodeRuntimeInvisibleTypeAnnotation
            org.objectweb.asm.AnnotationWriter r1 = org.objectweb.asm.AnnotationWriter.create(r1, r2, r3, r4, r5)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastCodeRuntimeInvisibleTypeAnnotation = r2
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLocalVariable(java.lang.String r5, java.lang.String r6, java.lang.String r7, org.objectweb.asm.Label r8, org.objectweb.asm.Label r9, int r10) {
            r4 = this;
            r0 = r7
            if (r0 == 0) goto L56
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.localVariableTypeTable
            if (r0 != 0) goto L16
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.localVariableTypeTable = r1
        L16:
            r0 = r4
            r1 = r0
            int r1 = r1.localVariableTypeTableLength
            r2 = 1
            int r1 = r1 + r2
            r0.localVariableTypeTableLength = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.localVariableTypeTable
            r1 = r8
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r9
            int r1 = r1.bytecodeOffset
            r2 = r8
            int r2 = r2.bytecodeOffset
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L56:
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.localVariableTable
            if (r0 != 0) goto L68
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.localVariableTable = r1
        L68:
            r0 = r4
            r1 = r0
            int r1 = r1.localVariableTableLength
            r2 = 1
            int r1 = r1 + r2
            r0.localVariableTableLength = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.localVariableTable
            r1 = r8
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r9
            int r1 = r1.bytecodeOffset
            r2 = r8
            int r2 = r2.bytecodeOffset
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r6
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r10
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            int r0 = r0.compute
            if (r0 == 0) goto Ldd
            r0 = r6
            r1 = 0
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = 74
            if (r1 == r2) goto Lc6
            r1 = r11
            r2 = 68
            if (r1 != r2) goto Lca
        Lc6:
            r1 = 2
            goto Lcb
        Lca:
            r1 = 1
        Lcb:
            int r0 = r0 + r1
            r12 = r0
            r0 = r12
            r1 = r4
            int r1 = r1.maxLocals
            if (r0 <= r1) goto Ldd
            r0 = r4
            r1 = r12
            r0.maxLocals = r1
        Ldd:
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public org.objectweb.asm.AnnotationVisitor visitLocalVariableAnnotation(int r9, org.objectweb.asm.TypePath r10, org.objectweb.asm.Label[] r11, org.objectweb.asm.Label[] r12, int[] r13, java.lang.String r14, boolean r15) {
            r8 = this;
            org.objectweb.asm.ByteVector r0 = new org.objectweb.asm.ByteVector
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r16
            r1 = r9
            r2 = 24
            int r1 = r1 >>> r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r11
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = 0
            r17 = r0
        L1b:
            r0 = r17
            r1 = r11
            int r1 = r1.length
            if (r0 >= r1) goto L50
            r0 = r16
            r1 = r11
            r2 = r17
            r1 = r1[r2]
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r12
            r2 = r17
            r1 = r1[r2]
            int r1 = r1.bytecodeOffset
            r2 = r11
            r3 = r17
            r2 = r2[r3]
            int r2 = r2.bytecodeOffset
            int r1 = r1 - r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r13
            r2 = r17
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r17 = r17 + 1
            goto L1b
        L50:
            r0 = r10
            r1 = r16
            org.objectweb.asm.TypePath.put(r0, r1)
            r0 = r16
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r14
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 0
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r15
            if (r0 == 0) goto L86
            r0 = r8
            org.objectweb.asm.AnnotationWriter r1 = new org.objectweb.asm.AnnotationWriter
            r2 = r1
            r3 = r8
            org.objectweb.asm.SymbolTable r3 = r3.symbolTable
            r4 = 1
            r5 = r16
            r6 = r8
            org.objectweb.asm.AnnotationWriter r6 = r6.lastCodeRuntimeVisibleTypeAnnotation
            r2.<init>(r3, r4, r5, r6)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastCodeRuntimeVisibleTypeAnnotation = r2
            return r0
        L86:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r1 = new org.objectweb.asm.AnnotationWriter
            r2 = r1
            r3 = r8
            org.objectweb.asm.SymbolTable r3 = r3.symbolTable
            r4 = 1
            r5 = r16
            r6 = r8
            org.objectweb.asm.AnnotationWriter r6 = r6.lastCodeRuntimeInvisibleTypeAnnotation
            r2.<init>(r3, r4, r5, r6)
            r2 = r1; r1 = r0; r0 = r2; 
            r1.lastCodeRuntimeInvisibleTypeAnnotation = r2
            return r0
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitLineNumber(int r5, org.objectweb.asm.Label r6) {
            r4 = this;
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.lineNumberTable
            if (r0 != 0) goto L12
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.lineNumberTable = r1
        L12:
            r0 = r4
            r1 = r0
            int r1 = r1.lineNumberTableLength
            r2 = 1
            int r1 = r1 + r2
            r0.lineNumberTableLength = r1
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.lineNumberTable
            r1 = r6
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.lineNumberTable
            r1 = r5
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitMaxs(int r4, int r5) {
            r3 = this;
            r0 = r3
            int r0 = r0.compute
            r1 = 4
            if (r0 != r1) goto Lf
            r0 = r3
            r0.computeAllFrames()
            goto L3b
        Lf:
            r0 = r3
            int r0 = r0.compute
            r1 = 1
            if (r0 != r1) goto L1e
            r0 = r3
            r0.computeMaxStackAndLocal()
            goto L3b
        L1e:
            r0 = r3
            int r0 = r0.compute
            r1 = 2
            if (r0 != r1) goto L31
            r0 = r3
            r1 = r3
            int r1 = r1.maxRelativeStackSize
            r0.maxStack = r1
            goto L3b
        L31:
            r0 = r3
            r1 = r4
            r0.maxStack = r1
            r0 = r3
            r1 = r5
            r0.maxLocals = r1
        L3b:
            return
    }

    private void computeAllFrames() {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Handler r0 = r0.firstHandler
            r8 = r0
        L5:
            r0 = r8
            if (r0 == 0) goto L78
            r0 = r8
            java.lang.String r0 = r0.catchTypeDescriptor
            if (r0 != 0) goto L16
            java.lang.String r0 = "java/lang/Throwable"
            goto L1a
        L16:
            r0 = r8
            java.lang.String r0 = r0.catchTypeDescriptor
        L1a:
            r9 = r0
            r0 = r7
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r9
            int r0 = org.objectweb.asm.Frame.getAbstractTypeFromInternalName(r0, r1)
            r10 = r0
            r0 = r8
            org.objectweb.asm.Label r0 = r0.handlerPc
            org.objectweb.asm.Label r0 = r0.getCanonicalInstance()
            r11 = r0
            r0 = r11
            r1 = r0
            short r1 = r1.flags
            r2 = 2
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r8
            org.objectweb.asm.Label r0 = r0.startPc
            org.objectweb.asm.Label r0 = r0.getCanonicalInstance()
            r12 = r0
            r0 = r8
            org.objectweb.asm.Label r0 = r0.endPc
            org.objectweb.asm.Label r0 = r0.getCanonicalInstance()
            r13 = r0
        L4b:
            r0 = r12
            r1 = r13
            if (r0 == r1) goto L70
            r0 = r12
            org.objectweb.asm.Edge r1 = new org.objectweb.asm.Edge
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r12
            org.objectweb.asm.Edge r5 = r5.outgoingEdges
            r2.<init>(r3, r4, r5)
            r0.outgoingEdges = r1
            r0 = r12
            org.objectweb.asm.Label r0 = r0.nextBasicBlock
            r12 = r0
            goto L4b
        L70:
            r0 = r8
            org.objectweb.asm.Handler r0 = r0.nextHandler
            r8 = r0
            goto L5
        L78:
            r0 = r7
            org.objectweb.asm.Label r0 = r0.firstBasicBlock
            org.objectweb.asm.Frame r0 = r0.frame
            r9 = r0
            r0 = r9
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r7
            int r2 = r2.accessFlags
            r3 = r7
            java.lang.String r3 = r3.descriptor
            r4 = r7
            int r4 = r4.maxLocals
            r0.setInputFrameFromDescriptor(r1, r2, r3, r4)
            r0 = r9
            r1 = r7
            r0.accept(r1)
            r0 = r7
            org.objectweb.asm.Label r0 = r0.firstBasicBlock
            r10 = r0
            r0 = r10
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            r0.nextListElement = r1
            r0 = 0
            r11 = r0
        La8:
            r0 = r10
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r1) goto L136
            r0 = r10
            r12 = r0
            r0 = r10
            org.objectweb.asm.Label r0 = r0.nextListElement
            r10 = r0
            r0 = r12
            r1 = 0
            r0.nextListElement = r1
            r0 = r12
            r1 = r0
            short r1 = r1.flags
            r2 = 8
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r12
            org.objectweb.asm.Frame r0 = r0.frame
            int r0 = r0.getInputStackSize()
            r1 = r12
            short r1 = r1.outputStackMax
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r1 = r11
            if (r0 <= r1) goto Le5
            r0 = r13
            r11 = r0
        Le5:
            r0 = r12
            org.objectweb.asm.Edge r0 = r0.outgoingEdges
            r14 = r0
        Lec:
            r0 = r14
            if (r0 == 0) goto L133
            r0 = r14
            org.objectweb.asm.Label r0 = r0.successor
            org.objectweb.asm.Label r0 = r0.getCanonicalInstance()
            r15 = r0
            r0 = r12
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r15
            org.objectweb.asm.Frame r2 = r2.frame
            r3 = r14
            int r3 = r3.info
            boolean r0 = r0.merge(r1, r2, r3)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L129
            r0 = r15
            org.objectweb.asm.Label r0 = r0.nextListElement
            if (r0 != 0) goto L129
            r0 = r15
            r1 = r10
            r0.nextListElement = r1
            r0 = r15
            r10 = r0
        L129:
            r0 = r14
            org.objectweb.asm.Edge r0 = r0.nextEdge
            r14 = r0
            goto Lec
        L133:
            goto La8
        L136:
            r0 = r7
            org.objectweb.asm.Label r0 = r0.firstBasicBlock
            r12 = r0
        L13c:
            r0 = r12
            if (r0 == 0) goto L1f7
            r0 = r12
            short r0 = r0.flags
            r1 = 10
            r0 = r0 & r1
            r1 = 10
            if (r0 != r1) goto L157
            r0 = r12
            org.objectweb.asm.Frame r0 = r0.frame
            r1 = r7
            r0.accept(r1)
        L157:
            r0 = r12
            short r0 = r0.flags
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L1ed
            r0 = r12
            org.objectweb.asm.Label r0 = r0.nextBasicBlock
            r13 = r0
            r0 = r12
            int r0 = r0.bytecodeOffset
            r14 = r0
            r0 = r13
            if (r0 != 0) goto L17f
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            int r0 = r0.length
            goto L184
        L17f:
            r0 = r13
            int r0 = r0.bytecodeOffset
        L184:
            r1 = 1
            int r0 = r0 - r1
            r15 = r0
            r0 = r15
            r1 = r14
            if (r0 < r1) goto L1ed
            r0 = r14
            r16 = r0
        L193:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto L1ab
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            byte[] r0 = r0.data
            r1 = r16
            r2 = 0
            r0[r1] = r2
            int r16 = r16 + 1
            goto L193
        L1ab:
            r0 = r7
            org.objectweb.asm.ByteVector r0 = r0.code
            byte[] r0 = r0.data
            r1 = r15
            r2 = -65
            r0[r1] = r2
            r0 = r7
            r1 = r14
            r2 = 0
            r3 = 1
            int r0 = r0.visitFrameStart(r1, r2, r3)
            r16 = r0
            r0 = r7
            int[] r0 = r0.currentFrame
            r1 = r16
            r2 = r7
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            java.lang.String r3 = "java/lang/Throwable"
            int r2 = org.objectweb.asm.Frame.getAbstractTypeFromInternalName(r2, r3)
            r0[r1] = r2
            r0 = r7
            r0.visitFrameEnd()
            r0 = r7
            r1 = r7
            org.objectweb.asm.Handler r1 = r1.firstHandler
            r2 = r12
            r3 = r13
            org.objectweb.asm.Handler r1 = org.objectweb.asm.Handler.removeRange(r1, r2, r3)
            r0.firstHandler = r1
            r0 = r11
            r1 = 1
            int r0 = java.lang.Math.max(r0, r1)
            r11 = r0
        L1ed:
            r0 = r12
            org.objectweb.asm.Label r0 = r0.nextBasicBlock
            r12 = r0
            goto L13c
        L1f7:
            r0 = r7
            r1 = r11
            r0.maxStack = r1
            return
    }

    private void computeMaxStackAndLocal() {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Handler r0 = r0.firstHandler
            r8 = r0
        L5:
            r0 = r8
            if (r0 == 0) goto L6e
            r0 = r8
            org.objectweb.asm.Label r0 = r0.handlerPc
            r9 = r0
            r0 = r8
            org.objectweb.asm.Label r0 = r0.startPc
            r10 = r0
            r0 = r8
            org.objectweb.asm.Label r0 = r0.endPc
            r11 = r0
        L19:
            r0 = r10
            r1 = r11
            if (r0 == r1) goto L66
            r0 = r10
            short r0 = r0.flags
            r1 = 16
            r0 = r0 & r1
            if (r0 != 0) goto L3f
            r0 = r10
            org.objectweb.asm.Edge r1 = new org.objectweb.asm.Edge
            r2 = r1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = r9
            r5 = r10
            org.objectweb.asm.Edge r5 = r5.outgoingEdges
            r2.<init>(r3, r4, r5)
            r0.outgoingEdges = r1
            goto L5e
        L3f:
            r0 = r10
            org.objectweb.asm.Edge r0 = r0.outgoingEdges
            org.objectweb.asm.Edge r0 = r0.nextEdge
            org.objectweb.asm.Edge r1 = new org.objectweb.asm.Edge
            r2 = r1
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = r9
            r5 = r10
            org.objectweb.asm.Edge r5 = r5.outgoingEdges
            org.objectweb.asm.Edge r5 = r5.nextEdge
            org.objectweb.asm.Edge r5 = r5.nextEdge
            r2.<init>(r3, r4, r5)
            r0.nextEdge = r1
        L5e:
            r0 = r10
            org.objectweb.asm.Label r0 = r0.nextBasicBlock
            r10 = r0
            goto L19
        L66:
            r0 = r8
            org.objectweb.asm.Handler r0 = r0.nextHandler
            r8 = r0
            goto L5
        L6e:
            r0 = r7
            boolean r0 = r0.hasSubroutines
            if (r0 == 0) goto L104
            r0 = 1
            r9 = r0
            r0 = r7
            org.objectweb.asm.Label r0 = r0.firstBasicBlock
            r1 = r9
            r0.markSubroutine(r1)
            r0 = 1
            r10 = r0
        L81:
            r0 = r10
            r1 = r9
            if (r0 > r1) goto Ld7
            r0 = r7
            org.objectweb.asm.Label r0 = r0.firstBasicBlock
            r11 = r0
        L8c:
            r0 = r11
            if (r0 == 0) goto Lcf
            r0 = r11
            short r0 = r0.flags
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto Lc5
            r0 = r11
            short r0 = r0.subroutineId
            r1 = r10
            if (r0 != r1) goto Lc5
            r0 = r11
            org.objectweb.asm.Edge r0 = r0.outgoingEdges
            org.objectweb.asm.Edge r0 = r0.nextEdge
            org.objectweb.asm.Label r0 = r0.successor
            r12 = r0
            r0 = r12
            short r0 = r0.subroutineId
            if (r0 != 0) goto Lc5
            r0 = r12
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            short r1 = (short) r1
            r9 = r1
            r1 = r9
            r0.markSubroutine(r1)
        Lc5:
            r0 = r11
            org.objectweb.asm.Label r0 = r0.nextBasicBlock
            r11 = r0
            goto L8c
        Lcf:
            r0 = r10
            r1 = 1
            int r0 = r0 + r1
            short r0 = (short) r0
            r10 = r0
            goto L81
        Ld7:
            r0 = r7
            org.objectweb.asm.Label r0 = r0.firstBasicBlock
            r10 = r0
        Ldc:
            r0 = r10
            if (r0 == 0) goto L104
            r0 = r10
            short r0 = r0.flags
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto Lfc
            r0 = r10
            org.objectweb.asm.Edge r0 = r0.outgoingEdges
            org.objectweb.asm.Edge r0 = r0.nextEdge
            org.objectweb.asm.Label r0 = r0.successor
            r11 = r0
            r0 = r11
            r1 = r10
            r0.addSubroutineRetSuccessors(r1)
        Lfc:
            r0 = r10
            org.objectweb.asm.Label r0 = r0.nextBasicBlock
            r10 = r0
            goto Ldc
        L104:
            r0 = r7
            org.objectweb.asm.Label r0 = r0.firstBasicBlock
            r9 = r0
            r0 = r9
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            r0.nextListElement = r1
            r0 = r7
            int r0 = r0.maxStack
            r10 = r0
        L115:
            r0 = r9
            org.objectweb.asm.Label r1 = org.objectweb.asm.Label.EMPTY_LIST
            if (r0 == r1) goto L19e
            r0 = r9
            r11 = r0
            r0 = r9
            org.objectweb.asm.Label r0 = r0.nextListElement
            r9 = r0
            r0 = r11
            short r0 = r0.inputStackSize
            r12 = r0
            r0 = r12
            r1 = r11
            short r1 = r1.outputStackMax
            int r0 = r0 + r1
            r13 = r0
            r0 = r13
            r1 = r10
            if (r0 <= r1) goto L13e
            r0 = r13
            r10 = r0
        L13e:
            r0 = r11
            org.objectweb.asm.Edge r0 = r0.outgoingEdges
            r14 = r0
            r0 = r11
            short r0 = r0.flags
            r1 = 16
            r0 = r0 & r1
            if (r0 == 0) goto L157
            r0 = r14
            org.objectweb.asm.Edge r0 = r0.nextEdge
            r14 = r0
        L157:
            r0 = r14
            if (r0 == 0) goto L19b
            r0 = r14
            org.objectweb.asm.Label r0 = r0.successor
            r15 = r0
            r0 = r15
            org.objectweb.asm.Label r0 = r0.nextListElement
            if (r0 != 0) goto L191
            r0 = r15
            r1 = r14
            int r1 = r1.info
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L17c
            r1 = 1
            goto L184
        L17c:
            r1 = r12
            r2 = r14
            int r2 = r2.info
            int r1 = r1 + r2
        L184:
            short r1 = (short) r1
            r0.inputStackSize = r1
            r0 = r15
            r1 = r9
            r0.nextListElement = r1
            r0 = r15
            r9 = r0
        L191:
            r0 = r14
            org.objectweb.asm.Edge r0 = r0.nextEdge
            r14 = r0
            goto L157
        L19b:
            goto L115
        L19e:
            r0 = r7
            r1 = r10
            r0.maxStack = r1
            return
    }

    @Override // org.objectweb.asm.MethodVisitor
    public void visitEnd() {
            r1 = this;
            return
    }

    private void addSuccessorToCurrentBasicBlock(int r8, org.objectweb.asm.Label r9) {
            r7 = this;
            r0 = r7
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            org.objectweb.asm.Edge r1 = new org.objectweb.asm.Edge
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r7
            org.objectweb.asm.Label r5 = r5.currentBasicBlock
            org.objectweb.asm.Edge r5 = r5.outgoingEdges
            r2.<init>(r3, r4, r5)
            r0.outgoingEdges = r1
            return
    }

    private void endCurrentBasicBlockWithNoSuccessor() {
            r5 = this;
            r0 = r5
            int r0 = r0.compute
            r1 = 4
            if (r0 != r1) goto L44
            org.objectweb.asm.Label r0 = new org.objectweb.asm.Label
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = r6
            org.objectweb.asm.Frame r1 = new org.objectweb.asm.Frame
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.frame = r1
            r0 = r6
            r1 = r5
            org.objectweb.asm.ByteVector r1 = r1.code
            byte[] r1 = r1.data
            r2 = r5
            org.objectweb.asm.ByteVector r2 = r2.code
            int r2 = r2.length
            boolean r0 = r0.resolve(r1, r2)
            r0 = r5
            org.objectweb.asm.Label r0 = r0.lastBasicBlock
            r1 = r6
            r0.nextBasicBlock = r1
            r0 = r5
            r1 = r6
            r0.lastBasicBlock = r1
            r0 = r5
            r1 = 0
            r0.currentBasicBlock = r1
            goto L5d
        L44:
            r0 = r5
            int r0 = r0.compute
            r1 = 1
            if (r0 != r1) goto L5d
            r0 = r5
            org.objectweb.asm.Label r0 = r0.currentBasicBlock
            r1 = r5
            int r1 = r1.maxRelativeStackSize
            short r1 = (short) r1
            r0.outputStackMax = r1
            r0 = r5
            r1 = 0
            r0.currentBasicBlock = r1
        L5d:
            return
    }

    int visitFrameStart(int r5, int r6, int r7) {
            r4 = this;
            r0 = 3
            r1 = r6
            int r0 = r0 + r1
            r1 = r7
            int r0 = r0 + r1
            r8 = r0
            r0 = r4
            int[] r0 = r0.currentFrame
            if (r0 == 0) goto L18
            r0 = r4
            int[] r0 = r0.currentFrame
            int r0 = r0.length
            r1 = r8
            if (r0 >= r1) goto L20
        L18:
            r0 = r4
            r1 = r8
            int[] r1 = new int[r1]
            r0.currentFrame = r1
        L20:
            r0 = r4
            int[] r0 = r0.currentFrame
            r1 = 0
            r2 = r5
            r0[r1] = r2
            r0 = r4
            int[] r0 = r0.currentFrame
            r1 = 1
            r2 = r6
            r0[r1] = r2
            r0 = r4
            int[] r0 = r0.currentFrame
            r1 = 2
            r2 = r7
            r0[r1] = r2
            r0 = 3
            return r0
    }

    void visitAbstractType(int r5, int r6) {
            r4 = this;
            r0 = r4
            int[] r0 = r0.currentFrame
            r1 = r5
            r2 = r6
            r0[r1] = r2
            return
    }

    void visitFrameEnd() {
            r4 = this;
            r0 = r4
            int[] r0 = r0.previousFrame
            if (r0 == 0) goto L27
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            if (r0 != 0) goto L19
            r0 = r4
            org.objectweb.asm.ByteVector r1 = new org.objectweb.asm.ByteVector
            r2 = r1
            r2.<init>()
            r0.stackMapTableEntries = r1
        L19:
            r0 = r4
            r0.putFrame()
            r0 = r4
            r1 = r0
            int r1 = r1.stackMapTableNumberOfEntries
            r2 = 1
            int r1 = r1 + r2
            r0.stackMapTableNumberOfEntries = r1
        L27:
            r0 = r4
            r1 = r4
            int[] r1 = r1.currentFrame
            r0.previousFrame = r1
            r0 = r4
            r1 = 0
            r0.currentFrame = r1
            return
    }

    private void putFrame() {
            r5 = this;
            r0 = r5
            int[] r0 = r0.currentFrame
            r1 = 1
            r0 = r0[r1]
            r6 = r0
            r0 = r5
            int[] r0 = r0.currentFrame
            r1 = 2
            r0 = r0[r1]
            r7 = r0
            r0 = r5
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 50
            if (r0 >= r1) goto L4a
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = r5
            int[] r1 = r1.currentFrame
            r2 = 0
            r1 = r1[r2]
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r0.putAbstractTypes(r1, r2)
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r3 = r7
            int r2 = r2 + r3
            r0.putAbstractTypes(r1, r2)
            return
        L4a:
            r0 = r5
            int r0 = r0.stackMapTableNumberOfEntries
            if (r0 != 0) goto L5a
            r0 = r5
            int[] r0 = r0.currentFrame
            r1 = 0
            r0 = r0[r1]
            goto L69
        L5a:
            r0 = r5
            int[] r0 = r0.currentFrame
            r1 = 0
            r0 = r0[r1]
            r1 = r5
            int[] r1 = r1.previousFrame
            r2 = 0
            r1 = r1[r2]
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 - r1
        L69:
            r8 = r0
            r0 = r5
            int[] r0 = r0.previousFrame
            r1 = 1
            r0 = r0[r1]
            r9 = r0
            r0 = r6
            r1 = r9
            int r0 = r0 - r1
            r10 = r0
            r0 = 255(0xff, float:3.57E-43)
            r11 = r0
            r0 = r7
            if (r0 != 0) goto Ld1
            r0 = r10
            switch(r0) {
                case -3: goto Lac;
                case -2: goto Lac;
                case -1: goto Lac;
                case 0: goto Lb4;
                case 1: goto Lc6;
                case 2: goto Lc6;
                case 3: goto Lc6;
                default: goto Lce;
            }
        Lac:
            r0 = 248(0xf8, float:3.48E-43)
            r11 = r0
            goto Leb
        Lb4:
            r0 = r8
            r1 = 64
            if (r0 >= r1) goto Lbe
            r0 = 0
            goto Lc1
        Lbe:
            r0 = 251(0xfb, float:3.52E-43)
        Lc1:
            r11 = r0
            goto Leb
        Lc6:
            r0 = 252(0xfc, float:3.53E-43)
            r11 = r0
            goto Leb
        Lce:
            goto Leb
        Ld1:
            r0 = r10
            if (r0 != 0) goto Leb
            r0 = r7
            r1 = 1
            if (r0 != r1) goto Leb
            r0 = r8
            r1 = 63
            if (r0 >= r1) goto Le6
            r0 = 64
            goto Le9
        Le6:
            r0 = 247(0xf7, float:3.46E-43)
        Le9:
            r11 = r0
        Leb:
            r0 = r11
            r1 = 255(0xff, float:3.57E-43)
            if (r0 == r1) goto L128
            r0 = 3
            r12 = r0
            r0 = 0
            r13 = r0
        Lf9:
            r0 = r13
            r1 = r9
            if (r0 >= r1) goto L128
            r0 = r13
            r1 = r6
            if (r0 >= r1) goto L128
            r0 = r5
            int[] r0 = r0.currentFrame
            r1 = r12
            r0 = r0[r1]
            r1 = r5
            int[] r1 = r1.previousFrame
            r2 = r12
            r1 = r1[r2]
            if (r0 == r1) goto L11f
            r0 = 255(0xff, float:3.57E-43)
            r11 = r0
            goto L128
        L11f:
            int r12 = r12 + 1
            int r13 = r13 + 1
            goto Lf9
        L128:
            r0 = r11
            switch(r0) {
                case 0: goto L16c;
                case 64: goto L178;
                case 247: goto L191;
                case 248: goto L1bf;
                case 251: goto L1ad;
                case 252: goto L1d4;
                case 255: goto L1f4;
                default: goto L1f4;
            }
        L16c:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L224
        L178:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 64
            r2 = r8
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 4
            r3 = r6
            int r2 = r2 + r3
            r0.putAbstractTypes(r1, r2)
            goto L224
        L191:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 247(0xf7, float:3.46E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 4
            r3 = r6
            int r2 = r2 + r3
            r0.putAbstractTypes(r1, r2)
            goto L224
        L1ad:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 251(0xfb, float:3.52E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L224
        L1bf:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r10
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L224
        L1d4:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r10
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r9
            int r1 = r1 + r2
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r0.putAbstractTypes(r1, r2)
            goto L224
        L1f4:
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 255(0xff, float:3.57E-43)
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r6
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r0.putAbstractTypes(r1, r2)
            r0 = r5
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = r7
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r5
            r1 = 3
            r2 = r6
            int r1 = r1 + r2
            r2 = 3
            r3 = r6
            int r2 = r2 + r3
            r3 = r7
            int r2 = r2 + r3
            r0.putAbstractTypes(r1, r2)
        L224:
            return
    }

    private void putAbstractTypes(int r5, int r6) {
            r4 = this;
            r0 = r5
            r7 = r0
        L2:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L1e
            r0 = r4
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r4
            int[] r1 = r1.currentFrame
            r2 = r7
            r1 = r1[r2]
            r2 = r4
            org.objectweb.asm.ByteVector r2 = r2.stackMapTableEntries
            org.objectweb.asm.Frame.putAbstractType(r0, r1, r2)
            int r7 = r7 + 1
            goto L2
        L1e:
            return
    }

    private void putFrameType(java.lang.Object r5) {
            r4 = this;
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Integer
            if (r0 == 0) goto L19
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = r5
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            goto L52
        L19:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L3e
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 7
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r5
            java.lang.String r2 = (java.lang.String) r2
            org.objectweb.asm.Symbol r1 = r1.addConstantClass(r2)
            int r1 = r1.index
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            goto L52
        L3e:
            r0 = r4
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            r1 = 8
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r5
            org.objectweb.asm.Label r1 = (org.objectweb.asm.Label) r1
            int r1 = r1.bytecodeOffset
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
        L52:
            return
    }

    boolean canCopyMethodAttributes(org.objectweb.asm.ClassReader r5, boolean r6, boolean r7, int r8, int r9, int r10) {
            r4 = this;
            r0 = r5
            r1 = r4
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            org.objectweb.asm.ClassReader r1 = r1.getSource()
            if (r0 != r1) goto L31
            r0 = r8
            r1 = r4
            int r1 = r1.descriptorIndex
            if (r0 != r1) goto L31
            r0 = r9
            r1 = r4
            int r1 = r1.signatureIndex
            if (r0 != r1) goto L31
            r0 = r7
            r1 = r4
            int r1 = r1.accessFlags
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r0 == r1) goto L33
        L31:
            r0 = 0
            return r0
        L33:
            r0 = r4
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 49
            if (r0 >= r1) goto L4e
            r0 = r4
            int r0 = r0.accessFlags
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L4e
            r0 = 1
            goto L4f
        L4e:
            r0 = 0
        L4f:
            r11 = r0
            r0 = r6
            r1 = r11
            if (r0 == r1) goto L59
            r0 = 0
            return r0
        L59:
            r0 = r10
            if (r0 != 0) goto L67
            r0 = r4
            int r0 = r0.numberOfExceptions
            if (r0 == 0) goto La1
            r0 = 0
            return r0
        L67:
            r0 = r5
            r1 = r10
            int r0 = r0.readUnsignedShort(r1)
            r1 = r4
            int r1 = r1.numberOfExceptions
            if (r0 != r1) goto La1
            r0 = r10
            r1 = 2
            int r0 = r0 + r1
            r12 = r0
            r0 = 0
            r13 = r0
        L7d:
            r0 = r13
            r1 = r4
            int r1 = r1.numberOfExceptions
            if (r0 >= r1) goto La1
            r0 = r5
            r1 = r12
            int r0 = r0.readUnsignedShort(r1)
            r1 = r4
            int[] r1 = r1.exceptionIndexTable
            r2 = r13
            r1 = r1[r2]
            if (r0 == r1) goto L98
            r0 = 0
            return r0
        L98:
            int r12 = r12 + 2
            int r13 = r13 + 1
            goto L7d
        La1:
            r0 = 1
            return r0
    }

    void setMethodAttributesSource(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 6
            int r1 = r1 + r2
            r0.sourceOffset = r1
            r0 = r4
            r1 = r6
            r2 = 6
            int r1 = r1 - r2
            r0.sourceLength = r1
            return
    }

    int computeMethodInfoSize() {
            r8 = this;
            r0 = r8
            int r0 = r0.sourceOffset
            if (r0 == 0) goto Lf
            r0 = 6
            r1 = r8
            int r1 = r1.sourceLength
            int r0 = r0 + r1
            return r0
        Lf:
            r0 = 8
            r9 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.code
            int r0 = r0.length
            if (r0 <= 0) goto L152
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.code
            int r0 = r0.length
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 <= r1) goto L47
            org.objectweb.asm.MethodTooLargeException r0 = new org.objectweb.asm.MethodTooLargeException
            r1 = r0
            r2 = r8
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            java.lang.String r2 = r2.getClassName()
            r3 = r8
            java.lang.String r3 = r3.name
            r4 = r8
            java.lang.String r4 = r4.descriptor
            r5 = r8
            org.objectweb.asm.ByteVector r5 = r5.code
            int r5 = r5.length
            r1.<init>(r2, r3, r4, r5)
            throw r0
        L47:
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "Code"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 16
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.code
            int r2 = r2.length
            int r1 = r1 + r2
            r2 = r8
            org.objectweb.asm.Handler r2 = r2.firstHandler
            int r2 = org.objectweb.asm.Handler.getExceptionTableSize(r2)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            if (r0 == 0) goto La2
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 50
            if (r0 < r1) goto L7e
            r0 = 1
            goto L7f
        L7e:
            r0 = 0
        L7f:
            r10 = r0
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r10
            if (r1 == 0) goto L8e
            java.lang.String r1 = "StackMapTable"
            goto L91
        L8e:
            java.lang.String r1 = "StackMap"
        L91:
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.stackMapTableEntries
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        La2:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.lineNumberTable
            if (r0 == 0) goto Lc1
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "LineNumberTable"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.lineNumberTable
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Lc1:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.localVariableTable
            if (r0 == 0) goto Le0
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "LocalVariableTable"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.localVariableTable
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Le0:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.localVariableTypeTable
            if (r0 == 0) goto Lff
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "LocalVariableTypeTable"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.localVariableTypeTable
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        Lff:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L113
            r0 = r9
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.lastCodeRuntimeVisibleTypeAnnotation
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r9 = r0
        L113:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L127
            r0 = r9
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.lastCodeRuntimeInvisibleTypeAnnotation
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r9 = r0
        L127:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstCodeAttribute
            if (r0 == 0) goto L152
            r0 = r9
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.firstCodeAttribute
            r2 = r8
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.code
            byte[] r3 = r3.data
            r4 = r8
            org.objectweb.asm.ByteVector r4 = r4.code
            int r4 = r4.length
            r5 = r8
            int r5 = r5.maxStack
            r6 = r8
            int r6 = r6.maxLocals
            int r1 = r1.computeAttributesSize(r2, r3, r4, r5, r6)
            int r0 = r0 + r1
            r9 = r0
        L152:
            r0 = r8
            int r0 = r0.numberOfExceptions
            if (r0 <= 0) goto L170
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "Exceptions"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 8
            r2 = 2
            r3 = r8
            int r3 = r3.numberOfExceptions
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L170:
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            int r2 = r2.accessFlags
            r3 = r8
            int r3 = r3.signatureIndex
            int r1 = org.objectweb.asm.Attribute.computeAttributesSize(r1, r2, r3)
            int r0 = r0 + r1
            r9 = r0
            r0 = r9
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeVisibleAnnotation
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.lastRuntimeInvisibleAnnotation
            r3 = r8
            org.objectweb.asm.AnnotationWriter r3 = r3.lastRuntimeVisibleTypeAnnotation
            r4 = r8
            org.objectweb.asm.AnnotationWriter r4 = r4.lastRuntimeInvisibleTypeAnnotation
            int r1 = org.objectweb.asm.AnnotationWriter.computeAnnotationsSize(r1, r2, r3, r4)
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeVisibleParameterAnnotations
            if (r0 == 0) goto L1bf
            r0 = r9
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            r2 = r8
            org.objectweb.asm.AnnotationWriter[] r2 = r2.lastRuntimeVisibleParameterAnnotations
            r3 = r8
            int r3 = r3.visibleAnnotableParameterCount
            if (r3 != 0) goto L1b6
            r3 = r8
            org.objectweb.asm.AnnotationWriter[] r3 = r3.lastRuntimeVisibleParameterAnnotations
            int r3 = r3.length
            goto L1ba
        L1b6:
            r3 = r8
            int r3 = r3.visibleAnnotableParameterCount
        L1ba:
            int r1 = org.objectweb.asm.AnnotationWriter.computeParameterAnnotationsSize(r1, r2, r3)
            int r0 = r0 + r1
            r9 = r0
        L1bf:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeInvisibleParameterAnnotations
            if (r0 == 0) goto L1e6
            r0 = r9
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            r2 = r8
            org.objectweb.asm.AnnotationWriter[] r2 = r2.lastRuntimeInvisibleParameterAnnotations
            r3 = r8
            int r3 = r3.invisibleAnnotableParameterCount
            if (r3 != 0) goto L1dd
            r3 = r8
            org.objectweb.asm.AnnotationWriter[] r3 = r3.lastRuntimeInvisibleParameterAnnotations
            int r3 = r3.length
            goto L1e1
        L1dd:
            r3 = r8
            int r3 = r3.invisibleAnnotableParameterCount
        L1e1:
            int r1 = org.objectweb.asm.AnnotationWriter.computeParameterAnnotationsSize(r1, r2, r3)
            int r0 = r0 + r1
            r9 = r0
        L1e6:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.defaultValue
            if (r0 == 0) goto L205
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "AnnotationDefault"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 6
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.defaultValue
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L205:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.parameters
            if (r0 == 0) goto L224
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "MethodParameters"
            int r0 = r0.addConstantUtf8(r1)
            r0 = r9
            r1 = 7
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.parameters
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r9 = r0
        L224:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto L239
            r0 = r9
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r2 = r8
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            int r1 = r1.computeAttributesSize(r2)
            int r0 = r0 + r1
            r9 = r0
        L239:
            r0 = r9
            return r0
    }

    void putMethodInfo(org.objectweb.asm.ByteVector r9) {
            r8 = this;
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 49
            if (r0 >= r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L1c
            r0 = 4096(0x1000, float:5.74E-42)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r11 = r0
            r0 = r9
            r1 = r8
            int r1 = r1.accessFlags
            r2 = r11
            r3 = -1
            r2 = r2 ^ r3
            r1 = r1 & r2
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.nameIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.descriptorIndex
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            int r0 = r0.sourceOffset
            if (r0 == 0) goto L58
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            org.objectweb.asm.ClassReader r1 = r1.getSource()
            byte[] r1 = r1.classFileBuffer
            r2 = r8
            int r2 = r2.sourceOffset
            r3 = r8
            int r3 = r3.sourceLength
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            return
        L58:
            r0 = 0
            r12 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.code
            int r0 = r0.length
            if (r0 <= 0) goto L68
            int r12 = r12 + 1
        L68:
            r0 = r8
            int r0 = r0.numberOfExceptions
            if (r0 <= 0) goto L72
            int r12 = r12 + 1
        L72:
            r0 = r8
            int r0 = r0.accessFlags
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 & r1
            if (r0 == 0) goto L84
            r0 = r10
            if (r0 == 0) goto L84
            int r12 = r12 + 1
        L84:
            r0 = r8
            int r0 = r0.signatureIndex
            if (r0 == 0) goto L8e
            int r12 = r12 + 1
        L8e:
            r0 = r8
            int r0 = r0.accessFlags
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L9c
            int r12 = r12 + 1
        L9c:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleAnnotation
            if (r0 == 0) goto La6
            int r12 = r12 + 1
        La6:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleAnnotation
            if (r0 == 0) goto Lb0
            int r12 = r12 + 1
        Lb0:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeVisibleParameterAnnotations
            if (r0 == 0) goto Lba
            int r12 = r12 + 1
        Lba:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeInvisibleParameterAnnotations
            if (r0 == 0) goto Lc4
            int r12 = r12 + 1
        Lc4:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto Lce
            int r12 = r12 + 1
        Lce:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto Ld8
            int r12 = r12 + 1
        Ld8:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.defaultValue
            if (r0 == 0) goto Le2
            int r12 = r12 + 1
        Le2:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.parameters
            if (r0 == 0) goto Lec
            int r12 = r12 + 1
        Lec:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto Lff
            r0 = r12
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            int r1 = r1.getAttributeCount()
            int r0 = r0 + r1
            r12 = r0
        Lff:
            r0 = r9
            r1 = r12
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.code
            int r0 = r0.length
            if (r0 <= 0) goto L3a8
            r0 = 10
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            int r0 = r0 + r1
            r1 = r8
            org.objectweb.asm.Handler r1 = r1.firstHandler
            int r1 = org.objectweb.asm.Handler.getExceptionTableSize(r1)
            int r0 = r0 + r1
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            if (r0 == 0) goto L140
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.stackMapTableEntries
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
            int r14 = r14 + 1
        L140:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.lineNumberTable
            if (r0 == 0) goto L159
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.lineNumberTable
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
            int r14 = r14 + 1
        L159:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.localVariableTable
            if (r0 == 0) goto L172
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.localVariableTable
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
            int r14 = r14 + 1
        L172:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.localVariableTypeTable
            if (r0 == 0) goto L18b
            r0 = r13
            r1 = 8
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.localVariableTypeTable
            int r2 = r2.length
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
            int r14 = r14 + 1
        L18b:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L1a4
            r0 = r13
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.lastCodeRuntimeVisibleTypeAnnotation
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r13 = r0
            int r14 = r14 + 1
        L1a4:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L1bd
            r0 = r13
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.lastCodeRuntimeInvisibleTypeAnnotation
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.computeAnnotationsSize(r2)
            int r0 = r0 + r1
            r13 = r0
            int r14 = r14 + 1
        L1bd:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstCodeAttribute
            if (r0 == 0) goto L1f6
            r0 = r13
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.firstCodeAttribute
            r2 = r8
            org.objectweb.asm.SymbolTable r2 = r2.symbolTable
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.code
            byte[] r3 = r3.data
            r4 = r8
            org.objectweb.asm.ByteVector r4 = r4.code
            int r4 = r4.length
            r5 = r8
            int r5 = r5.maxStack
            r6 = r8
            int r6 = r6.maxLocals
            int r1 = r1.computeAttributesSize(r2, r3, r4, r5, r6)
            int r0 = r0 + r1
            r13 = r0
            r0 = r14
            r1 = r8
            org.objectweb.asm.Attribute r1 = r1.firstCodeAttribute
            int r1 = r1.getAttributeCount()
            int r0 = r0 + r1
            r14 = r0
        L1f6:
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "Code"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r13
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.maxStack
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            int r1 = r1.maxLocals
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.code
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.code
            byte[] r1 = r1.data
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.code
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
            r0 = r8
            org.objectweb.asm.Handler r0 = r0.firstHandler
            r1 = r9
            org.objectweb.asm.Handler.putExceptionTable(r0, r1)
            r0 = r9
            r1 = r14
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.stackMapTableEntries
            if (r0 == 0) goto L29c
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            int r0 = r0.getMajorVersion()
            r1 = 50
            if (r0 < r1) goto L25a
            r0 = 1
            goto L25b
        L25a:
            r0 = 0
        L25b:
            r15 = r0
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r15
            if (r2 == 0) goto L26d
            java.lang.String r2 = "StackMapTable"
            goto L270
        L26d:
            java.lang.String r2 = "StackMap"
        L270:
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.stackMapTableEntries
            int r2 = r2.length
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.stackMapTableNumberOfEntries
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.stackMapTableEntries
            byte[] r1 = r1.data
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.stackMapTableEntries
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L29c:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.lineNumberTable
            if (r0 == 0) goto L2d7
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "LineNumberTable"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.lineNumberTable
            int r2 = r2.length
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.lineNumberTableLength
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.lineNumberTable
            byte[] r1 = r1.data
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.lineNumberTable
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L2d7:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.localVariableTable
            if (r0 == 0) goto L312
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "LocalVariableTable"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.localVariableTable
            int r2 = r2.length
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.localVariableTableLength
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.localVariableTable
            byte[] r1 = r1.data
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.localVariableTable
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L312:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.localVariableTypeTable
            if (r0 == 0) goto L34d
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "LocalVariableTypeTable"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.localVariableTypeTable
            int r2 = r2.length
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.localVariableTypeTableLength
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.localVariableTypeTable
            byte[] r1 = r1.data
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.localVariableTypeTable
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L34d:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeVisibleTypeAnnotation
            if (r0 == 0) goto L366
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeVisibleTypeAnnotation
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "RuntimeVisibleTypeAnnotations"
            int r1 = r1.addConstantUtf8(r2)
            r2 = r9
            r0.putAnnotations(r1, r2)
        L366:
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeInvisibleTypeAnnotation
            if (r0 == 0) goto L37f
            r0 = r8
            org.objectweb.asm.AnnotationWriter r0 = r0.lastCodeRuntimeInvisibleTypeAnnotation
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "RuntimeInvisibleTypeAnnotations"
            int r1 = r1.addConstantUtf8(r2)
            r2 = r9
            r0.putAnnotations(r1, r2)
        L37f:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstCodeAttribute
            if (r0 == 0) goto L3a8
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstCodeAttribute
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.code
            byte[] r2 = r2.data
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.code
            int r3 = r3.length
            r4 = r8
            int r4 = r4.maxStack
            r5 = r8
            int r5 = r5.maxLocals
            r6 = r9
            r0.putAttributes(r1, r2, r3, r4, r5, r6)
        L3a8:
            r0 = r8
            int r0 = r0.numberOfExceptions
            if (r0 <= 0) goto L3f9
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "Exceptions"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 2
            r2 = 2
            r3 = r8
            int r3 = r3.numberOfExceptions
            int r2 = r2 * r3
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.numberOfExceptions
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r0 = r8
            int[] r0 = r0.exceptionIndexTable
            r13 = r0
            r0 = r13
            int r0 = r0.length
            r14 = r0
            r0 = 0
            r15 = r0
        L3de:
            r0 = r15
            r1 = r14
            if (r0 >= r1) goto L3f9
            r0 = r13
            r1 = r15
            r0 = r0[r1]
            r16 = r0
            r0 = r9
            r1 = r16
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            int r15 = r15 + 1
            goto L3de
        L3f9:
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r8
            int r1 = r1.accessFlags
            r2 = r8
            int r2 = r2.signatureIndex
            r3 = r9
            org.objectweb.asm.Attribute.putAttributes(r0, r1, r2, r3)
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            r1 = r8
            org.objectweb.asm.AnnotationWriter r1 = r1.lastRuntimeVisibleAnnotation
            r2 = r8
            org.objectweb.asm.AnnotationWriter r2 = r2.lastRuntimeInvisibleAnnotation
            r3 = r8
            org.objectweb.asm.AnnotationWriter r3 = r3.lastRuntimeVisibleTypeAnnotation
            r4 = r8
            org.objectweb.asm.AnnotationWriter r4 = r4.lastRuntimeInvisibleTypeAnnotation
            r5 = r9
            org.objectweb.asm.AnnotationWriter.putAnnotations(r0, r1, r2, r3, r4, r5)
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeVisibleParameterAnnotations
            if (r0 == 0) goto L44d
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "RuntimeVisibleParameterAnnotations"
            int r0 = r0.addConstantUtf8(r1)
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.lastRuntimeVisibleParameterAnnotations
            r2 = r8
            int r2 = r2.visibleAnnotableParameterCount
            if (r2 != 0) goto L445
            r2 = r8
            org.objectweb.asm.AnnotationWriter[] r2 = r2.lastRuntimeVisibleParameterAnnotations
            int r2 = r2.length
            goto L449
        L445:
            r2 = r8
            int r2 = r2.visibleAnnotableParameterCount
        L449:
            r3 = r9
            org.objectweb.asm.AnnotationWriter.putParameterAnnotations(r0, r1, r2, r3)
        L44d:
            r0 = r8
            org.objectweb.asm.AnnotationWriter[] r0 = r0.lastRuntimeInvisibleParameterAnnotations
            if (r0 == 0) goto L479
            r0 = r8
            org.objectweb.asm.SymbolTable r0 = r0.symbolTable
            java.lang.String r1 = "RuntimeInvisibleParameterAnnotations"
            int r0 = r0.addConstantUtf8(r1)
            r1 = r8
            org.objectweb.asm.AnnotationWriter[] r1 = r1.lastRuntimeInvisibleParameterAnnotations
            r2 = r8
            int r2 = r2.invisibleAnnotableParameterCount
            if (r2 != 0) goto L471
            r2 = r8
            org.objectweb.asm.AnnotationWriter[] r2 = r2.lastRuntimeInvisibleParameterAnnotations
            int r2 = r2.length
            goto L475
        L471:
            r2 = r8
            int r2 = r2.invisibleAnnotableParameterCount
        L475:
            r3 = r9
            org.objectweb.asm.AnnotationWriter.putParameterAnnotations(r0, r1, r2, r3)
        L479:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.defaultValue
            if (r0 == 0) goto L4ab
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "AnnotationDefault"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.defaultValue
            int r1 = r1.length
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.defaultValue
            byte[] r1 = r1.data
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.defaultValue
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L4ab:
            r0 = r8
            org.objectweb.asm.ByteVector r0 = r0.parameters
            if (r0 == 0) goto L4e6
            r0 = r9
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            java.lang.String r2 = "MethodParameters"
            int r1 = r1.addConstantUtf8(r2)
            org.objectweb.asm.ByteVector r0 = r0.putShort(r1)
            r1 = 1
            r2 = r8
            org.objectweb.asm.ByteVector r2 = r2.parameters
            int r2 = r2.length
            int r1 = r1 + r2
            org.objectweb.asm.ByteVector r0 = r0.putInt(r1)
            r1 = r8
            int r1 = r1.parametersCount
            org.objectweb.asm.ByteVector r0 = r0.putByte(r1)
            r1 = r8
            org.objectweb.asm.ByteVector r1 = r1.parameters
            byte[] r1 = r1.data
            r2 = 0
            r3 = r8
            org.objectweb.asm.ByteVector r3 = r3.parameters
            int r3 = r3.length
            org.objectweb.asm.ByteVector r0 = r0.putByteArray(r1, r2, r3)
        L4e6:
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            if (r0 == 0) goto L4f9
            r0 = r8
            org.objectweb.asm.Attribute r0 = r0.firstAttribute
            r1 = r8
            org.objectweb.asm.SymbolTable r1 = r1.symbolTable
            r2 = r9
            r0.putAttributes(r1, r2)
        L4f9:
            return
    }

    final void collectAttributePrototypes(org.objectweb.asm.Attribute.Set r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.firstAttribute
            r0.addAttributes(r1)
            r0 = r4
            r1 = r3
            org.objectweb.asm.Attribute r1 = r1.firstCodeAttribute
            r0.addAttributes(r1)
            return
    }

    static {
            r0 = 202(0xca, float:2.83E-43)
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 22
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 35
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 36
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 37
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 38
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 39
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 40
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 41
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 42
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 43
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 44
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 45
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 46
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 47
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 48
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 49
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 50
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 51
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 52
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 53
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 54
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 55
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 56
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 57
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 58
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 59
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 60
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 61
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 62
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 63
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 64
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 65
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 66
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 67
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 68
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 69
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 70
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 71
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 72
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 73
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 74
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 75
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 76
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 77
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 78
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 79
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 80
            r3 = -4
            r1[r2] = r3
            r1 = r0
            r2 = 81
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 82
            r3 = -4
            r1[r2] = r3
            r1 = r0
            r2 = 83
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 84
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 85
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 86
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 87
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 88
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 89
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 90
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 91
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 92
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 93
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 94
            r3 = 2
            r1[r2] = r3
            r1 = r0
            r2 = 95
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 96
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 97
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 98
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 99
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 100
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 101(0x65, float:1.42E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 102(0x66, float:1.43E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 103(0x67, float:1.44E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 104(0x68, float:1.46E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 105(0x69, float:1.47E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 106(0x6a, float:1.49E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 107(0x6b, float:1.5E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 108(0x6c, float:1.51E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 109(0x6d, float:1.53E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 110(0x6e, float:1.54E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 111(0x6f, float:1.56E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 112(0x70, float:1.57E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 113(0x71, float:1.58E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 114(0x72, float:1.6E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 115(0x73, float:1.61E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 116(0x74, float:1.63E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 117(0x75, float:1.64E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 118(0x76, float:1.65E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 119(0x77, float:1.67E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 120(0x78, float:1.68E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 121(0x79, float:1.7E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 122(0x7a, float:1.71E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 123(0x7b, float:1.72E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 124(0x7c, float:1.74E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 125(0x7d, float:1.75E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 126(0x7e, float:1.77E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 127(0x7f, float:1.78E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 128(0x80, float:1.794E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 129(0x81, float:1.81E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 130(0x82, float:1.82E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 131(0x83, float:1.84E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 132(0x84, float:1.85E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 133(0x85, float:1.86E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 134(0x86, float:1.88E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 135(0x87, float:1.89E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 136(0x88, float:1.9E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 137(0x89, float:1.92E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 138(0x8a, float:1.93E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 139(0x8b, float:1.95E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 140(0x8c, float:1.96E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 141(0x8d, float:1.98E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 142(0x8e, float:1.99E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 143(0x8f, float:2.0E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 144(0x90, float:2.02E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 145(0x91, float:2.03E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 146(0x92, float:2.05E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 147(0x93, float:2.06E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 148(0x94, float:2.07E-43)
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 149(0x95, float:2.09E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 150(0x96, float:2.1E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 151(0x97, float:2.12E-43)
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 152(0x98, float:2.13E-43)
            r3 = -3
            r1[r2] = r3
            r1 = r0
            r2 = 153(0x99, float:2.14E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 154(0x9a, float:2.16E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 155(0x9b, float:2.17E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 156(0x9c, float:2.19E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 157(0x9d, float:2.2E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 158(0x9e, float:2.21E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 159(0x9f, float:2.23E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 160(0xa0, float:2.24E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 161(0xa1, float:2.26E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 162(0xa2, float:2.27E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 163(0xa3, float:2.28E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 164(0xa4, float:2.3E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 165(0xa5, float:2.31E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 166(0xa6, float:2.33E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 167(0xa7, float:2.34E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 168(0xa8, float:2.35E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 169(0xa9, float:2.37E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 170(0xaa, float:2.38E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 171(0xab, float:2.4E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 172(0xac, float:2.41E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 173(0xad, float:2.42E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 174(0xae, float:2.44E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 175(0xaf, float:2.45E-43)
            r3 = -2
            r1[r2] = r3
            r1 = r0
            r2 = 176(0xb0, float:2.47E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 177(0xb1, float:2.48E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 178(0xb2, float:2.5E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 179(0xb3, float:2.51E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 180(0xb4, float:2.52E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 181(0xb5, float:2.54E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 182(0xb6, float:2.55E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 183(0xb7, float:2.56E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 184(0xb8, float:2.58E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 185(0xb9, float:2.59E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 186(0xba, float:2.6E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 187(0xbb, float:2.62E-43)
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 188(0xbc, float:2.63E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 189(0xbd, float:2.65E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 190(0xbe, float:2.66E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 191(0xbf, float:2.68E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 192(0xc0, float:2.69E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 193(0xc1, float:2.7E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 194(0xc2, float:2.72E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 195(0xc3, float:2.73E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 196(0xc4, float:2.75E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 197(0xc5, float:2.76E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 198(0xc6, float:2.77E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 199(0xc7, float:2.79E-43)
            r3 = -1
            r1[r2] = r3
            r1 = r0
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            r1[r2] = r3
            r1 = r0
            r2 = 201(0xc9, float:2.82E-43)
            r3 = 0
            r1[r2] = r3
            org.objectweb.asm.MethodWriter.STACK_SIZE_DELTA = r0
            return
    }
}
