package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/Constants.SCL.lombok */
final class Constants {
    static final java.lang.String CONSTANT_VALUE = "ConstantValue";
    static final java.lang.String CODE = "Code";
    static final java.lang.String STACK_MAP_TABLE = "StackMapTable";
    static final java.lang.String EXCEPTIONS = "Exceptions";
    static final java.lang.String INNER_CLASSES = "InnerClasses";
    static final java.lang.String ENCLOSING_METHOD = "EnclosingMethod";
    static final java.lang.String SYNTHETIC = "Synthetic";
    static final java.lang.String SIGNATURE = "Signature";
    static final java.lang.String SOURCE_FILE = "SourceFile";
    static final java.lang.String SOURCE_DEBUG_EXTENSION = "SourceDebugExtension";
    static final java.lang.String LINE_NUMBER_TABLE = "LineNumberTable";
    static final java.lang.String LOCAL_VARIABLE_TABLE = "LocalVariableTable";
    static final java.lang.String LOCAL_VARIABLE_TYPE_TABLE = "LocalVariableTypeTable";
    static final java.lang.String DEPRECATED = "Deprecated";
    static final java.lang.String RUNTIME_VISIBLE_ANNOTATIONS = "RuntimeVisibleAnnotations";
    static final java.lang.String RUNTIME_INVISIBLE_ANNOTATIONS = "RuntimeInvisibleAnnotations";
    static final java.lang.String RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS = "RuntimeVisibleParameterAnnotations";
    static final java.lang.String RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS = "RuntimeInvisibleParameterAnnotations";
    static final java.lang.String RUNTIME_VISIBLE_TYPE_ANNOTATIONS = "RuntimeVisibleTypeAnnotations";
    static final java.lang.String RUNTIME_INVISIBLE_TYPE_ANNOTATIONS = "RuntimeInvisibleTypeAnnotations";
    static final java.lang.String ANNOTATION_DEFAULT = "AnnotationDefault";
    static final java.lang.String BOOTSTRAP_METHODS = "BootstrapMethods";
    static final java.lang.String METHOD_PARAMETERS = "MethodParameters";
    static final java.lang.String MODULE = "Module";
    static final java.lang.String MODULE_PACKAGES = "ModulePackages";
    static final java.lang.String MODULE_MAIN_CLASS = "ModuleMainClass";
    static final java.lang.String NEST_HOST = "NestHost";
    static final java.lang.String NEST_MEMBERS = "NestMembers";
    static final java.lang.String PERMITTED_SUBCLASSES = "PermittedSubclasses";
    static final java.lang.String RECORD = "Record";
    static final int ACC_CONSTRUCTOR = 262144;
    static final int F_INSERT = 256;
    static final int LDC_W = 19;
    static final int LDC2_W = 20;
    static final int ILOAD_0 = 26;
    static final int ILOAD_1 = 27;
    static final int ILOAD_2 = 28;
    static final int ILOAD_3 = 29;
    static final int LLOAD_0 = 30;
    static final int LLOAD_1 = 31;
    static final int LLOAD_2 = 32;
    static final int LLOAD_3 = 33;
    static final int FLOAD_0 = 34;
    static final int FLOAD_1 = 35;
    static final int FLOAD_2 = 36;
    static final int FLOAD_3 = 37;
    static final int DLOAD_0 = 38;
    static final int DLOAD_1 = 39;
    static final int DLOAD_2 = 40;
    static final int DLOAD_3 = 41;
    static final int ALOAD_0 = 42;
    static final int ALOAD_1 = 43;
    static final int ALOAD_2 = 44;
    static final int ALOAD_3 = 45;
    static final int ISTORE_0 = 59;
    static final int ISTORE_1 = 60;
    static final int ISTORE_2 = 61;
    static final int ISTORE_3 = 62;
    static final int LSTORE_0 = 63;
    static final int LSTORE_1 = 64;
    static final int LSTORE_2 = 65;
    static final int LSTORE_3 = 66;
    static final int FSTORE_0 = 67;
    static final int FSTORE_1 = 68;
    static final int FSTORE_2 = 69;
    static final int FSTORE_3 = 70;
    static final int DSTORE_0 = 71;
    static final int DSTORE_1 = 72;
    static final int DSTORE_2 = 73;
    static final int DSTORE_3 = 74;
    static final int ASTORE_0 = 75;
    static final int ASTORE_1 = 76;
    static final int ASTORE_2 = 77;
    static final int ASTORE_3 = 78;
    static final int WIDE = 196;
    static final int GOTO_W = 200;
    static final int JSR_W = 201;
    static final int WIDE_JUMP_OPCODE_DELTA = 33;
    static final int ASM_OPCODE_DELTA = 49;
    static final int ASM_IFNULL_OPCODE_DELTA = 20;
    static final int ASM_IFEQ = 202;
    static final int ASM_IFNE = 203;
    static final int ASM_IFLT = 204;
    static final int ASM_IFGE = 205;
    static final int ASM_IFGT = 206;
    static final int ASM_IFLE = 207;
    static final int ASM_IF_ICMPEQ = 208;
    static final int ASM_IF_ICMPNE = 209;
    static final int ASM_IF_ICMPLT = 210;
    static final int ASM_IF_ICMPGE = 211;
    static final int ASM_IF_ICMPGT = 212;
    static final int ASM_IF_ICMPLE = 213;
    static final int ASM_IF_ACMPEQ = 214;
    static final int ASM_IF_ACMPNE = 215;
    static final int ASM_GOTO = 216;
    static final int ASM_JSR = 217;
    static final int ASM_IFNULL = 218;
    static final int ASM_IFNONNULL = 219;
    static final int ASM_GOTO_W = 220;

    private Constants() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void checkAsmExperimental(java.lang.Object r4) {
            r0 = r4
            java.lang.Class r0 = r0.getClass()
            r5 = r0
            r0 = r5
            java.lang.String r0 = r0.getName()
            r1 = 46
            r2 = 47
            java.lang.String r0 = r0.replace(r1, r2)
            r6 = r0
            r0 = r6
            boolean r0 = isWhitelisted(r0)
            if (r0 != 0) goto L36
            r0 = r5
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".class"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            checkIsPreview(r0)
        L36:
            return
    }

    static boolean isWhitelisted(java.lang.String r3) {
            r0 = r3
            java.lang.String r1 = "org/objectweb/asm/"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.String r0 = "(Annotation|Class|Field|Method|Module|RecordComponent|Signature)"
            r4 = r0
            r0 = r3
            java.lang.String r1 = "Test$"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "org/objectweb/asm/util/Trace"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "Visitor(\\$.*)?"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            boolean r0 = java.util.regex.Pattern.matches(r0, r1)
            if (r0 != 0) goto L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "org/objectweb/asm/util/Check"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "Adapter(\\$.*)?"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            boolean r0 = java.util.regex.Pattern.matches(r0, r1)
            if (r0 == 0) goto L60
        L5c:
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            return r0
    }

    static void checkIsPreview(java.io.InputStream r5) {
            r0 = r5
            if (r0 != 0) goto Lf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Bytecode not available, can't check class version"
            r1.<init>(r2)
            throw r0
        Lf:
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3c
            r1 = r0
            r2 = r5
            r1.<init>(r2)     // Catch: java.io.IOException -> L3c
            r7 = r0
            r0 = r7
            int r0 = r0.readInt()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L3c
            r0 = r7
            int r0 = r0.readUnsignedShort()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L3c
            r6 = r0
            r0 = r7
            r0.close()     // Catch: java.io.IOException -> L3c
            goto L39
        L29:
            r8 = move-exception
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L3c
            goto L37
        L31:
            r9 = move-exception
            r0 = r8
            r1 = r9
        L37:
            r0 = r8
            throw r0     // Catch: java.io.IOException -> L3c
        L39:
            goto L49
        L3c:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "I/O error, can't check class version"
            r3 = r7
            r1.<init>(r2, r3)
            throw r0
        L49:
            r0 = r6
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 == r1) goto L5b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "ASM9_EXPERIMENTAL can only be used by classes compiled with --enable-preview"
            r1.<init>(r2)
            throw r0
        L5b:
            return
    }
}
