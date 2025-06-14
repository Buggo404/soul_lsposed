package org.objectweb.asm;

/* loaded from: com.usidqw.qwerklj.apk:org/objectweb/asm/ClassReader.SCL.lombok */
public class ClassReader {
    public static final int SKIP_CODE = 1;
    public static final int SKIP_DEBUG = 2;
    public static final int SKIP_FRAMES = 4;
    public static final int EXPAND_FRAMES = 8;
    static final int EXPAND_ASM_INSNS = 256;
    private static final int MAX_BUFFER_SIZE = 1048576;
    private static final int INPUT_STREAM_DATA_CHUNK_SIZE = 4096;

    /* renamed from: b */
    @java.lang.Deprecated
    public final byte[] f623b;
    public final int header;
    final byte[] classFileBuffer;
    private final int[] cpInfoOffsets;
    private final java.lang.String[] constantUtf8Values;
    private final org.objectweb.asm.ConstantDynamic[] constantDynamicValues;
    private final int[] bootstrapMethodOffsets;
    private final int maxStringLength;

    public ClassReader(byte[] r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r6
            int r3 = r3.length
            r0.<init>(r1, r2, r3)
            return
    }

    public ClassReader(byte[] r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 1
            r0.<init>(r1, r2, r3)
            return
    }

    ClassReader(byte[] r8, int r9, boolean r10) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            r1 = r8
            r0.classFileBuffer = r1
            r0 = r7
            r1 = r8
            r0.f623b = r1
            r0 = r10
            if (r0 == 0) goto L41
            r0 = r7
            r1 = r9
            r2 = 6
            int r1 = r1 + r2
            short r0 = r0.readShort(r1)
            r1 = 64
            if (r0 <= r1) goto L41
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unsupported class file major version "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            r4 = r9
            r5 = 6
            int r4 = r4 + r5
            short r3 = r3.readShort(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L41:
            r0 = r7
            r1 = r9
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r11 = r0
            r0 = r7
            r1 = r11
            int[] r1 = new int[r1]
            r0.cpInfoOffsets = r1
            r0 = r7
            r1 = r11
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.constantUtf8Values = r1
            r0 = 1
            r12 = r0
            r0 = r9
            r1 = 10
            int r0 = r0 + r1
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = 0
            r16 = r0
        L6e:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L141
            r0 = r7
            int[] r0 = r0.cpInfoOffsets
            r1 = r12
            int r12 = r12 + 1
            r2 = r13
            r3 = 1
            int r2 = r2 + r3
            r0[r1] = r2
            r0 = r8
            r1 = r13
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L109;
                case 2: goto L12f;
                case 3: goto Le4;
                case 4: goto Le4;
                case 5: goto Lff;
                case 6: goto Lff;
                case 7: goto L129;
                case 8: goto L129;
                case 9: goto Le4;
                case 10: goto Le4;
                case 11: goto Le4;
                case 12: goto Le4;
                case 13: goto L12f;
                case 14: goto L12f;
                case 15: goto L123;
                case 16: goto L129;
                case 17: goto Lea;
                case 18: goto Lf6;
                case 19: goto L129;
                case 20: goto L129;
                default: goto L12f;
            }
        Le4:
            r0 = 5
            r17 = r0
            goto L137
        Lea:
            r0 = 5
            r17 = r0
            r0 = 1
            r15 = r0
            r0 = 1
            r16 = r0
            goto L137
        Lf6:
            r0 = 5
            r17 = r0
            r0 = 1
            r15 = r0
            goto L137
        Lff:
            r0 = 9
            r17 = r0
            int r12 = r12 + 1
            goto L137
        L109:
            r0 = 3
            r1 = r7
            r2 = r13
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            int r0 = r0 + r1
            r17 = r0
            r0 = r17
            r1 = r14
            if (r0 <= r1) goto L137
            r0 = r17
            r14 = r0
            goto L137
        L123:
            r0 = 4
            r17 = r0
            goto L137
        L129:
            r0 = 3
            r17 = r0
            goto L137
        L12f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L137:
            r0 = r13
            r1 = r17
            int r0 = r0 + r1
            r13 = r0
            goto L6e
        L141:
            r0 = r7
            r1 = r14
            r0.maxStringLength = r1
            r0 = r7
            r1 = r13
            r0.header = r1
            r0 = r7
            r1 = r16
            if (r1 == 0) goto L15b
            r1 = r11
            org.objectweb.asm.ConstantDynamic[] r1 = new org.objectweb.asm.ConstantDynamic[r1]
            goto L15c
        L15b:
            r1 = 0
        L15c:
            r0.constantDynamicValues = r1
            r0 = r7
            r1 = r15
            if (r1 == 0) goto L16e
            r1 = r7
            r2 = r14
            int[] r1 = r1.readBootstrapMethodsAttribute(r2)
            goto L16f
        L16e:
            r1 = 0
        L16f:
            r0.bootstrapMethodOffsets = r1
            return
    }

    public ClassReader(java.io.InputStream r5) throws java.io.IOException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            byte[] r1 = readStream(r1, r2)
            r0.<init>(r1)
            return
    }

    public ClassReader(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            r0 = r6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            r2 = r7
            r3 = 46
            r4 = 47
            java.lang.String r2 = r2.replace(r3, r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ".class"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.io.InputStream r1 = java.lang.ClassLoader.getSystemResourceAsStream(r1)
            r2 = 1
            byte[] r1 = readStream(r1, r2)
            r0.<init>(r1)
            return
    }

    private static byte[] readStream(java.io.InputStream r5, boolean r6) throws java.io.IOException {
            r0 = r5
            if (r0 != 0) goto Le
            java.io.IOException r0 = new java.io.IOException
            r1 = r0
            java.lang.String r2 = "Class not found"
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r5
            int r0 = computeBufferSize(r0)
            r7 = r0
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L86
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L86
            r8 = r0
            r0 = r7
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L86
            r9 = r0
            r0 = 0
            r11 = r0
        L23:
            r0 = r5
            r1 = r9
            r2 = 0
            r3 = r7
            int r0 = r0.read(r1, r2, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L86
            r1 = r0
            r10 = r1
            r1 = -1
            if (r0 == r1) goto L41
            r0 = r8
            r1 = r9
            r2 = 0
            r3 = r10
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L86
            int r11 = r11 + 1
            goto L23
        L41:
            r0 = r8
            r0.flush()     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L86
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L5e
            r0 = r9
            r12 = r0
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L86
            r0 = r6
            if (r0 == 0) goto L5b
            r0 = r5
            r0.close()
        L5b:
            r0 = r12
            return r0
        L5e:
            r0 = r8
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L73 java.lang.Throwable -> L86
            r12 = r0
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L86
            r0 = r6
            if (r0 == 0) goto L70
            r0 = r5
            r0.close()
        L70:
            r0 = r12
            return r0
        L73:
            r9 = move-exception
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L7c java.lang.Throwable -> L86
            goto L83
        L7c:
            r10 = move-exception
            r0 = r9
            r1 = r10
        L83:
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L86
        L86:
            r13 = move-exception
            r0 = r6
            if (r0 == 0) goto L90
            r0 = r5
            r0.close()
        L90:
            r0 = r13
            throw r0
    }

    private static int computeBufferSize(java.io.InputStream r3) throws java.io.IOException {
            r0 = r3
            int r0 = r0.available()
            r4 = r0
            r0 = r4
            r1 = 256(0x100, float:3.59E-43)
            if (r0 >= r1) goto L10
            r0 = 4096(0x1000, float:5.74E-42)
            return r0
        L10:
            r0 = r4
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    public int getAccess() {
            r3 = this;
            r0 = r3
            r1 = r3
            int r1 = r1.header
            int r0 = r0.readUnsignedShort(r1)
            return r0
    }

    public java.lang.String getClassName() {
            r4 = this;
            r0 = r4
            r1 = r4
            int r1 = r1.header
            r2 = 2
            int r1 = r1 + r2
            r2 = r4
            int r2 = r2.maxStringLength
            char[] r2 = new char[r2]
            java.lang.String r0 = r0.readClass(r1, r2)
            return r0
    }

    public java.lang.String getSuperName() {
            r4 = this;
            r0 = r4
            r1 = r4
            int r1 = r1.header
            r2 = 4
            int r1 = r1 + r2
            r2 = r4
            int r2 = r2.maxStringLength
            char[] r2 = new char[r2]
            java.lang.String r0 = r0.readClass(r1, r2)
            return r0
    }

    public java.lang.String[] getInterfaces() {
            r6 = this;
            r0 = r6
            int r0 = r0.header
            r1 = 6
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r7
            int r0 = r0.readUnsignedShort(r1)
            r8 = r0
            r0 = r8
            java.lang.String[] r0 = new java.lang.String[r0]
            r9 = r0
            r0 = r8
            if (r0 <= 0) goto L3c
            r0 = r6
            int r0 = r0.maxStringLength
            char[] r0 = new char[r0]
            r10 = r0
            r0 = 0
            r11 = r0
        L22:
            r0 = r11
            r1 = r8
            if (r0 >= r1) goto L3c
            int r7 = r7 + 2
            r0 = r9
            r1 = r11
            r2 = r6
            r3 = r7
            r4 = r10
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r11 = r11 + 1
            goto L22
        L3c:
            r0 = r9
            return r0
    }

    public void accept(org.objectweb.asm.ClassVisitor r6, int r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            org.objectweb.asm.Attribute[] r2 = new org.objectweb.asm.Attribute[r2]
            r3 = r7
            r0.accept(r1, r2, r3)
            return
    }

    public void accept(org.objectweb.asm.ClassVisitor r10, org.objectweb.asm.Attribute[] r11, int r12) {
            r9 = this;
            org.objectweb.asm.Context r0 = new org.objectweb.asm.Context
            r1 = r0
            r1.<init>()
            r13 = r0
            r0 = r13
            r1 = r11
            r0.attributePrototypes = r1
            r0 = r13
            r1 = r12
            r0.parsingOptions = r1
            r0 = r13
            r1 = r9
            int r1 = r1.maxStringLength
            char[] r1 = new char[r1]
            r0.charBuffer = r1
            r0 = r13
            char[] r0 = r0.charBuffer
            r14 = r0
            r0 = r9
            int r0 = r0.header
            r15 = r0
            r0 = r9
            r1 = r15
            int r0 = r0.readUnsignedShort(r1)
            r16 = r0
            r0 = r9
            r1 = r15
            r2 = 2
            int r1 = r1 + r2
            r2 = r14
            java.lang.String r0 = r0.readClass(r1, r2)
            r17 = r0
            r0 = r9
            r1 = r15
            r2 = 4
            int r1 = r1 + r2
            r2 = r14
            java.lang.String r0 = r0.readClass(r1, r2)
            r18 = r0
            r0 = r9
            r1 = r15
            r2 = 6
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            java.lang.String[] r0 = new java.lang.String[r0]
            r19 = r0
            int r15 = r15 + 8
            r0 = 0
            r20 = r0
        L61:
            r0 = r20
            r1 = r19
            int r1 = r1.length
            if (r0 >= r1) goto L7f
            r0 = r19
            r1 = r20
            r2 = r9
            r3 = r15
            r4 = r14
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r15 = r15 + 2
            int r20 = r20 + 1
            goto L61
        L7f:
            r0 = 0
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = 0
            r29 = r0
            r0 = 0
            r30 = r0
            r0 = 0
            r31 = r0
            r0 = 0
            r32 = r0
            r0 = 0
            r33 = r0
            r0 = 0
            r34 = r0
            r0 = 0
            r35 = r0
            r0 = 0
            r36 = r0
            r0 = r9
            int r0 = r0.getFirstAttributeOffset()
            r37 = r0
            r0 = r9
            r1 = r37
            r2 = 2
            int r1 = r1 - r2
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
        Lc2:
            r0 = r38
            if (r0 <= 0) goto L293
            r0 = r9
            r1 = r37
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r39 = r0
            r0 = r9
            r1 = r37
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r40 = r0
            int r37 = r37 + 6
            java.lang.String r0 = "SourceFile"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf5
            r0 = r9
            r1 = r37
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r23 = r0
            goto L286
        Lf5:
            java.lang.String r0 = "InnerClasses"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L106
            r0 = r37
            r20 = r0
            goto L286
        L106:
            java.lang.String r0 = "EnclosingMethod"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L117
            r0 = r37
            r21 = r0
            goto L286
        L117:
            java.lang.String r0 = "NestHost"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L12e
            r0 = r9
            r1 = r37
            r2 = r14
            java.lang.String r0 = r0.readClass(r1, r2)
            r32 = r0
            goto L286
        L12e:
            java.lang.String r0 = "NestMembers"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13f
            r0 = r37
            r33 = r0
            goto L286
        L13f:
            java.lang.String r0 = "PermittedSubclasses"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L150
            r0 = r37
            r34 = r0
            goto L286
        L150:
            java.lang.String r0 = "Signature"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L167
            r0 = r9
            r1 = r37
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r22 = r0
            goto L286
        L167:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L178
            r0 = r37
            r25 = r0
            goto L286
        L178:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L189
            r0 = r37
            r27 = r0
            goto L286
        L189:
            java.lang.String r0 = "Deprecated"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19e
            r0 = r16
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r16 = r0
            goto L286
        L19e:
            java.lang.String r0 = "Synthetic"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b4
            r0 = r16
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 | r1
            r16 = r0
            goto L286
        L1b4:
            java.lang.String r0 = "SourceDebugExtension"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e5
            r0 = r40
            r1 = r9
            byte[] r1 = r1.classFileBuffer
            int r1 = r1.length
            r2 = r37
            int r1 = r1 - r2
            if (r0 <= r1) goto L1d4
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1d4:
            r0 = r9
            r1 = r37
            r2 = r40
            r3 = r40
            char[] r3 = new char[r3]
            java.lang.String r0 = r0.readUtf(r1, r2, r3)
            r24 = r0
            goto L286
        L1e5:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f7
            r0 = r37
            r26 = r0
            goto L286
        L1f7:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L209
            r0 = r37
            r28 = r0
            goto L286
        L209:
            java.lang.String r0 = "Record"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L223
            r0 = r37
            r35 = r0
            r0 = r16
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 | r1
            r16 = r0
            goto L286
        L223:
            java.lang.String r0 = "Module"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L235
            r0 = r37
            r29 = r0
            goto L286
        L235:
            java.lang.String r0 = "ModuleMainClass"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L24d
            r0 = r9
            r1 = r37
            r2 = r14
            java.lang.String r0 = r0.readClass(r1, r2)
            r31 = r0
            goto L286
        L24d:
            java.lang.String r0 = "ModulePackages"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25f
            r0 = r37
            r30 = r0
            goto L286
        L25f:
            java.lang.String r0 = "BootstrapMethods"
            r1 = r39
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L286
            r0 = r9
            r1 = r11
            r2 = r39
            r3 = r37
            r4 = r40
            r5 = r14
            r6 = -1
            r7 = 0
            org.objectweb.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r41 = r0
            r0 = r41
            r1 = r36
            r0.nextAttribute = r1
            r0 = r41
            r36 = r0
        L286:
            r0 = r37
            r1 = r40
            int r0 = r0 + r1
            r37 = r0
            int r38 = r38 + (-1)
            goto Lc2
        L293:
            r0 = r10
            r1 = r9
            r2 = r9
            int[] r2 = r2.cpInfoOffsets
            r3 = 1
            r2 = r2[r3]
            r3 = 7
            int r2 = r2 - r3
            int r1 = r1.readInt(r2)
            r2 = r16
            r3 = r17
            r4 = r22
            r5 = r18
            r6 = r19
            r0.visit(r1, r2, r3, r4, r5, r6)
            r0 = r12
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L2c6
            r0 = r23
            if (r0 != 0) goto L2be
            r0 = r24
            if (r0 == 0) goto L2c6
        L2be:
            r0 = r10
            r1 = r23
            r2 = r24
            r0.visitSource(r1, r2)
        L2c6:
            r0 = r29
            if (r0 == 0) goto L2d8
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r29
            r4 = r30
            r5 = r31
            r0.readModuleAttributes(r1, r2, r3, r4, r5)
        L2d8:
            r0 = r32
            if (r0 == 0) goto L2e3
            r0 = r10
            r1 = r32
            r0.visitNestHost(r1)
        L2e3:
            r0 = r21
            if (r0 == 0) goto L338
            r0 = r9
            r1 = r21
            r2 = r14
            java.lang.String r0 = r0.readClass(r1, r2)
            r38 = r0
            r0 = r9
            r1 = r21
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r39 = r0
            r0 = r39
            if (r0 != 0) goto L305
            r0 = 0
            goto L312
        L305:
            r0 = r9
            r1 = r9
            int[] r1 = r1.cpInfoOffsets
            r2 = r39
            r1 = r1[r2]
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
        L312:
            r40 = r0
            r0 = r39
            if (r0 != 0) goto L31d
            r0 = 0
            goto L32c
        L31d:
            r0 = r9
            r1 = r9
            int[] r1 = r1.cpInfoOffsets
            r2 = r39
            r1 = r1[r2]
            r2 = 2
            int r1 = r1 + r2
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
        L32c:
            r41 = r0
            r0 = r10
            r1 = r38
            r2 = r40
            r3 = r41
            r0.visitOuterClass(r1, r2, r3)
        L338:
            r0 = r25
            if (r0 == 0) goto L375
            r0 = r9
            r1 = r25
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r25
            r1 = 2
            int r0 = r0 + r1
            r39 = r0
        L34b:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L375
            r0 = r9
            r1 = r39
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r40 = r0
            int r39 = r39 + 2
            r0 = r9
            r1 = r10
            r2 = r40
            r3 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r39
            r3 = 1
            r4 = r14
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r39 = r0
            goto L34b
        L375:
            r0 = r26
            if (r0 == 0) goto L3b2
            r0 = r9
            r1 = r26
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r26
            r1 = 2
            int r0 = r0 + r1
            r39 = r0
        L388:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L3b2
            r0 = r9
            r1 = r39
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r40 = r0
            int r39 = r39 + 2
            r0 = r9
            r1 = r10
            r2 = r40
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r39
            r3 = 1
            r4 = r14
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r39 = r0
            goto L388
        L3b2:
            r0 = r27
            if (r0 == 0) goto L403
            r0 = r9
            r1 = r27
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r27
            r1 = 2
            int r0 = r0 + r1
            r39 = r0
        L3c5:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L403
            r0 = r9
            r1 = r13
            r2 = r39
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r39 = r0
            r0 = r9
            r1 = r39
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r40 = r0
            int r39 = r39 + 2
            r0 = r9
            r1 = r10
            r2 = r13
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r13
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r40
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r39
            r3 = 1
            r4 = r14
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r39 = r0
            goto L3c5
        L403:
            r0 = r28
            if (r0 == 0) goto L454
            r0 = r9
            r1 = r28
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r28
            r1 = 2
            int r0 = r0 + r1
            r39 = r0
        L416:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L454
            r0 = r9
            r1 = r13
            r2 = r39
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r39 = r0
            r0 = r9
            r1 = r39
            r2 = r14
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r40 = r0
            int r39 = r39 + 2
            r0 = r9
            r1 = r10
            r2 = r13
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r13
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r40
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r39
            r3 = 1
            r4 = r14
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r39 = r0
            goto L416
        L454:
            r0 = r36
            if (r0 == 0) goto L473
            r0 = r36
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r38 = r0
            r0 = r36
            r1 = 0
            r0.nextAttribute = r1
            r0 = r10
            r1 = r36
            r0.visitAttribute(r1)
            r0 = r38
            r36 = r0
            goto L454
        L473:
            r0 = r33
            if (r0 == 0) goto L4a0
            r0 = r9
            r1 = r33
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r33
            r1 = 2
            int r0 = r0 + r1
            r39 = r0
        L486:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L4a0
            r0 = r10
            r1 = r9
            r2 = r39
            r3 = r14
            java.lang.String r1 = r1.readClass(r2, r3)
            r0.visitNestMember(r1)
            int r39 = r39 + 2
            goto L486
        L4a0:
            r0 = r34
            if (r0 == 0) goto L4cd
            r0 = r9
            r1 = r34
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r34
            r1 = 2
            int r0 = r0 + r1
            r39 = r0
        L4b3:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L4cd
            r0 = r10
            r1 = r9
            r2 = r39
            r3 = r14
            java.lang.String r1 = r1.readClass(r2, r3)
            r0.visitPermittedSubclass(r1)
            int r39 = r39 + 2
            goto L4b3
        L4cd:
            r0 = r20
            if (r0 == 0) goto L517
            r0 = r9
            r1 = r20
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r20
            r1 = 2
            int r0 = r0 + r1
            r39 = r0
        L4e0:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L517
            r0 = r10
            r1 = r9
            r2 = r39
            r3 = r14
            java.lang.String r1 = r1.readClass(r2, r3)
            r2 = r9
            r3 = r39
            r4 = 2
            int r3 = r3 + r4
            r4 = r14
            java.lang.String r2 = r2.readClass(r3, r4)
            r3 = r9
            r4 = r39
            r5 = 4
            int r4 = r4 + r5
            r5 = r14
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r4 = r9
            r5 = r39
            r6 = 6
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r0.visitInnerClass(r1, r2, r3, r4)
            int r39 = r39 + 8
            goto L4e0
        L517:
            r0 = r35
            if (r0 == 0) goto L53d
            r0 = r9
            r1 = r35
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            int r35 = r35 + 2
        L527:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L53d
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r35
            int r0 = r0.readRecordComponent(r1, r2, r3)
            r35 = r0
            goto L527
        L53d:
            r0 = r9
            r1 = r15
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            int r15 = r15 + 2
        L548:
            r0 = r38
            int r38 = r38 + (-1)
            if (r0 <= 0) goto L55e
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r15
            int r0 = r0.readField(r1, r2, r3)
            r15 = r0
            goto L548
        L55e:
            r0 = r9
            r1 = r15
            int r0 = r0.readUnsignedShort(r1)
            r39 = r0
            int r15 = r15 + 2
        L569:
            r0 = r39
            int r39 = r39 + (-1)
            if (r0 <= 0) goto L57f
            r0 = r9
            r1 = r10
            r2 = r13
            r3 = r15
            int r0 = r0.readMethod(r1, r2, r3)
            r15 = r0
            goto L569
        L57f:
            r0 = r10
            r0.visitEnd()
            return
    }

    private void readModuleAttributes(org.objectweb.asm.ClassVisitor r7, org.objectweb.asm.Context r8, int r9, int r10, java.lang.String r11) {
            r6 = this;
            r0 = r8
            char[] r0 = r0.charBuffer
            r12 = r0
            r0 = r9
            r13 = r0
            r0 = r6
            r1 = r13
            r2 = r12
            java.lang.String r0 = r0.readModule(r1, r2)
            r14 = r0
            r0 = r6
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r15 = r0
            r0 = r6
            r1 = r13
            r2 = 4
            int r1 = r1 + r2
            r2 = r12
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r16 = r0
            int r13 = r13 + 6
            r0 = r7
            r1 = r14
            r2 = r15
            r3 = r16
            org.objectweb.asm.ModuleVisitor r0 = r0.visitModule(r1, r2, r3)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L3e
            return
        L3e:
            r0 = r11
            if (r0 == 0) goto L4a
            r0 = r17
            r1 = r11
            r0.visitMainClass(r1)
        L4a:
            r0 = r10
            if (r0 == 0) goto L78
            r0 = r6
            r1 = r10
            int r0 = r0.readUnsignedShort(r1)
            r18 = r0
            r0 = r10
            r1 = 2
            int r0 = r0 + r1
            r19 = r0
        L5d:
            r0 = r18
            int r18 = r18 + (-1)
            if (r0 <= 0) goto L78
            r0 = r17
            r1 = r6
            r2 = r19
            r3 = r12
            java.lang.String r1 = r1.readPackage(r2, r3)
            r0.visitPackage(r1)
            int r19 = r19 + 2
            goto L5d
        L78:
            r0 = r6
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r18 = r0
            int r13 = r13 + 2
        L83:
            r0 = r18
            int r18 = r18 + (-1)
            if (r0 <= 0) goto Lbc
            r0 = r6
            r1 = r13
            r2 = r12
            java.lang.String r0 = r0.readModule(r1, r2)
            r19 = r0
            r0 = r6
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r20 = r0
            r0 = r6
            r1 = r13
            r2 = 4
            int r1 = r1 + r2
            r2 = r12
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r21 = r0
            int r13 = r13 + 6
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            r0.visitRequire(r1, r2, r3)
            goto L83
        Lbc:
            r0 = r6
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r19 = r0
            int r13 = r13 + 2
        Lc7:
            r0 = r19
            int r19 = r19 + (-1)
            if (r0 <= 0) goto L12d
            r0 = r6
            r1 = r13
            r2 = r12
            java.lang.String r0 = r0.readPackage(r1, r2)
            r20 = r0
            r0 = r6
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r21 = r0
            r0 = r6
            r1 = r13
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r22 = r0
            int r13 = r13 + 6
            r0 = 0
            r23 = r0
            r0 = r22
            if (r0 == 0) goto L11f
            r0 = r22
            java.lang.String[] r0 = new java.lang.String[r0]
            r23 = r0
            r0 = 0
            r24 = r0
        L102:
            r0 = r24
            r1 = r22
            if (r0 >= r1) goto L11f
            r0 = r23
            r1 = r24
            r2 = r6
            r3 = r13
            r4 = r12
            java.lang.String r2 = r2.readModule(r3, r4)
            r0[r1] = r2
            int r13 = r13 + 2
            int r24 = r24 + 1
            goto L102
        L11f:
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r23
            r0.visitExport(r1, r2, r3)
            goto Lc7
        L12d:
            r0 = r6
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r20 = r0
            int r13 = r13 + 2
        L138:
            r0 = r20
            int r20 = r20 + (-1)
            if (r0 <= 0) goto L19e
            r0 = r6
            r1 = r13
            r2 = r12
            java.lang.String r0 = r0.readPackage(r1, r2)
            r21 = r0
            r0 = r6
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r22 = r0
            r0 = r6
            r1 = r13
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r23 = r0
            int r13 = r13 + 6
            r0 = 0
            r24 = r0
            r0 = r23
            if (r0 == 0) goto L190
            r0 = r23
            java.lang.String[] r0 = new java.lang.String[r0]
            r24 = r0
            r0 = 0
            r25 = r0
        L173:
            r0 = r25
            r1 = r23
            if (r0 >= r1) goto L190
            r0 = r24
            r1 = r25
            r2 = r6
            r3 = r13
            r4 = r12
            java.lang.String r2 = r2.readModule(r3, r4)
            r0[r1] = r2
            int r13 = r13 + 2
            int r25 = r25 + 1
            goto L173
        L190:
            r0 = r17
            r1 = r21
            r2 = r22
            r3 = r24
            r0.visitOpen(r1, r2, r3)
            goto L138
        L19e:
            r0 = r6
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r21 = r0
            int r13 = r13 + 2
        L1a9:
            r0 = r21
            int r21 = r21 + (-1)
            if (r0 <= 0) goto L1c4
            r0 = r17
            r1 = r6
            r2 = r13
            r3 = r12
            java.lang.String r1 = r1.readClass(r2, r3)
            r0.visitUse(r1)
            int r13 = r13 + 2
            goto L1a9
        L1c4:
            r0 = r6
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r22 = r0
            int r13 = r13 + 2
        L1cf:
            r0 = r22
            int r22 = r22 + (-1)
            if (r0 <= 0) goto L221
            r0 = r6
            r1 = r13
            r2 = r12
            java.lang.String r0 = r0.readClass(r1, r2)
            r23 = r0
            r0 = r6
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r24 = r0
            int r13 = r13 + 4
            r0 = r24
            java.lang.String[] r0 = new java.lang.String[r0]
            r25 = r0
            r0 = 0
            r26 = r0
        L1f8:
            r0 = r26
            r1 = r24
            if (r0 >= r1) goto L215
            r0 = r25
            r1 = r26
            r2 = r6
            r3 = r13
            r4 = r12
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r13 = r13 + 2
            int r26 = r26 + 1
            goto L1f8
        L215:
            r0 = r17
            r1 = r23
            r2 = r25
            r0.visitProvide(r1, r2)
            goto L1cf
        L221:
            r0 = r17
            r0.visitEnd()
            return
    }

    private int readRecordComponent(org.objectweb.asm.ClassVisitor r10, org.objectweb.asm.Context r11, int r12) {
            r9 = this;
            r0 = r11
            char[] r0 = r0.charBuffer
            r13 = r0
            r0 = r12
            r14 = r0
            r0 = r9
            r1 = r14
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r15 = r0
            r0 = r9
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r16 = r0
            int r14 = r14 + 4
            r0 = 0
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = r9
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r23 = r0
            int r14 = r14 + 2
        L3f:
            r0 = r23
            int r23 = r23 + (-1)
            if (r0 <= 0) goto Le4
            r0 = r9
            r1 = r14
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r24 = r0
            r0 = r9
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r25 = r0
            int r14 = r14 + 6
            java.lang.String r0 = "Signature"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L75
            r0 = r9
            r1 = r14
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r17 = r0
            goto Lda
        L75:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L86
            r0 = r14
            r18 = r0
            goto Lda
        L86:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L97
            r0 = r14
            r20 = r0
            goto Lda
        L97:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La9
            r0 = r14
            r19 = r0
            goto Lda
        La9:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r24
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lbb
            r0 = r14
            r21 = r0
            goto Lda
        Lbb:
            r0 = r9
            r1 = r11
            org.objectweb.asm.Attribute[] r1 = r1.attributePrototypes
            r2 = r24
            r3 = r14
            r4 = r25
            r5 = r13
            r6 = -1
            r7 = 0
            org.objectweb.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r26 = r0
            r0 = r26
            r1 = r22
            r0.nextAttribute = r1
            r0 = r26
            r22 = r0
        Lda:
            r0 = r14
            r1 = r25
            int r0 = r0 + r1
            r14 = r0
            goto L3f
        Le4:
            r0 = r10
            r1 = r15
            r2 = r16
            r3 = r17
            org.objectweb.asm.RecordComponentVisitor r0 = r0.visitRecordComponent(r1, r2, r3)
            r24 = r0
            r0 = r24
            if (r0 != 0) goto Lf8
            r0 = r14
            return r0
        Lf8:
            r0 = r18
            if (r0 == 0) goto L136
            r0 = r9
            r1 = r18
            int r0 = r0.readUnsignedShort(r1)
            r25 = r0
            r0 = r18
            r1 = 2
            int r0 = r0 + r1
            r26 = r0
        L10b:
            r0 = r25
            int r25 = r25 + (-1)
            if (r0 <= 0) goto L136
            r0 = r9
            r1 = r26
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r27 = r0
            int r26 = r26 + 2
            r0 = r9
            r1 = r24
            r2 = r27
            r3 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r26
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r26 = r0
            goto L10b
        L136:
            r0 = r19
            if (r0 == 0) goto L174
            r0 = r9
            r1 = r19
            int r0 = r0.readUnsignedShort(r1)
            r25 = r0
            r0 = r19
            r1 = 2
            int r0 = r0 + r1
            r26 = r0
        L149:
            r0 = r25
            int r25 = r25 + (-1)
            if (r0 <= 0) goto L174
            r0 = r9
            r1 = r26
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r27 = r0
            int r26 = r26 + 2
            r0 = r9
            r1 = r24
            r2 = r27
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r26
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r26 = r0
            goto L149
        L174:
            r0 = r20
            if (r0 == 0) goto L1c3
            r0 = r9
            r1 = r20
            int r0 = r0.readUnsignedShort(r1)
            r25 = r0
            r0 = r20
            r1 = 2
            int r0 = r0 + r1
            r26 = r0
        L187:
            r0 = r25
            int r25 = r25 + (-1)
            if (r0 <= 0) goto L1c3
            r0 = r9
            r1 = r11
            r2 = r26
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r26 = r0
            r0 = r9
            r1 = r26
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r27 = r0
            int r26 = r26 + 2
            r0 = r9
            r1 = r24
            r2 = r11
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r27
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r26
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r26 = r0
            goto L187
        L1c3:
            r0 = r21
            if (r0 == 0) goto L212
            r0 = r9
            r1 = r21
            int r0 = r0.readUnsignedShort(r1)
            r25 = r0
            r0 = r21
            r1 = 2
            int r0 = r0 + r1
            r26 = r0
        L1d6:
            r0 = r25
            int r25 = r25 + (-1)
            if (r0 <= 0) goto L212
            r0 = r9
            r1 = r11
            r2 = r26
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r26 = r0
            r0 = r9
            r1 = r26
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r27 = r0
            int r26 = r26 + 2
            r0 = r9
            r1 = r24
            r2 = r11
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r27
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r26
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r26 = r0
            goto L1d6
        L212:
            r0 = r22
            if (r0 == 0) goto L232
            r0 = r22
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r25 = r0
            r0 = r22
            r1 = 0
            r0.nextAttribute = r1
            r0 = r24
            r1 = r22
            r0.visitAttribute(r1)
            r0 = r25
            r22 = r0
            goto L212
        L232:
            r0 = r24
            r0.visitEnd()
            r0 = r14
            return r0
    }

    private int readField(org.objectweb.asm.ClassVisitor r10, org.objectweb.asm.Context r11, int r12) {
            r9 = this;
            r0 = r11
            char[] r0 = r0.charBuffer
            r13 = r0
            r0 = r12
            r14 = r0
            r0 = r9
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r15 = r0
            r0 = r9
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r16 = r0
            r0 = r9
            r1 = r14
            r2 = 4
            int r1 = r1 + r2
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r17 = r0
            int r14 = r14 + 6
            r0 = 0
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = r9
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r25 = r0
            int r14 = r14 + 2
        L4c:
            r0 = r25
            int r25 = r25 + (-1)
            if (r0 <= 0) goto L145
            r0 = r9
            r1 = r14
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r26 = r0
            r0 = r9
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r27 = r0
            int r14 = r14 + 6
            java.lang.String r0 = "ConstantValue"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L94
            r0 = r9
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r28 = r0
            r0 = r28
            if (r0 != 0) goto L87
            r0 = 0
            goto L8f
        L87:
            r0 = r9
            r1 = r28
            r2 = r13
            java.lang.Object r0 = r0.readConst(r1, r2)
        L8f:
            r18 = r0
            goto L13b
        L94:
            java.lang.String r0 = "Signature"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lab
            r0 = r9
            r1 = r14
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r19 = r0
            goto L13b
        Lab:
            java.lang.String r0 = "Deprecated"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc0
            r0 = r15
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 | r1
            r15 = r0
            goto L13b
        Lc0:
            java.lang.String r0 = "Synthetic"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Ld6
            r0 = r15
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r0 | r1
            r15 = r0
            goto L13b
        Ld6:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le7
            r0 = r14
            r20 = r0
            goto L13b
        Le7:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf8
            r0 = r14
            r22 = r0
            goto L13b
        Lf8:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L10a
            r0 = r14
            r21 = r0
            goto L13b
        L10a:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L11c
            r0 = r14
            r23 = r0
            goto L13b
        L11c:
            r0 = r9
            r1 = r11
            org.objectweb.asm.Attribute[] r1 = r1.attributePrototypes
            r2 = r26
            r3 = r14
            r4 = r27
            r5 = r13
            r6 = -1
            r7 = 0
            org.objectweb.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r28 = r0
            r0 = r28
            r1 = r24
            r0.nextAttribute = r1
            r0 = r28
            r24 = r0
        L13b:
            r0 = r14
            r1 = r27
            int r0 = r0 + r1
            r14 = r0
            goto L4c
        L145:
            r0 = r10
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r19
            r5 = r18
            org.objectweb.asm.FieldVisitor r0 = r0.visitField(r1, r2, r3, r4, r5)
            r26 = r0
            r0 = r26
            if (r0 != 0) goto L15d
            r0 = r14
            return r0
        L15d:
            r0 = r20
            if (r0 == 0) goto L19b
            r0 = r9
            r1 = r20
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r20
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L170:
            r0 = r27
            int r27 = r27 + (-1)
            if (r0 <= 0) goto L19b
            r0 = r9
            r1 = r28
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r29 = r0
            int r28 = r28 + 2
            r0 = r9
            r1 = r26
            r2 = r29
            r3 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r28
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r28 = r0
            goto L170
        L19b:
            r0 = r21
            if (r0 == 0) goto L1d9
            r0 = r9
            r1 = r21
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r21
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L1ae:
            r0 = r27
            int r27 = r27 + (-1)
            if (r0 <= 0) goto L1d9
            r0 = r9
            r1 = r28
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r29 = r0
            int r28 = r28 + 2
            r0 = r9
            r1 = r26
            r2 = r29
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r28
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r28 = r0
            goto L1ae
        L1d9:
            r0 = r22
            if (r0 == 0) goto L228
            r0 = r9
            r1 = r22
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r22
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L1ec:
            r0 = r27
            int r27 = r27 + (-1)
            if (r0 <= 0) goto L228
            r0 = r9
            r1 = r11
            r2 = r28
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r28 = r0
            r0 = r9
            r1 = r28
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r29 = r0
            int r28 = r28 + 2
            r0 = r9
            r1 = r26
            r2 = r11
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r29
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r28
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r28 = r0
            goto L1ec
        L228:
            r0 = r23
            if (r0 == 0) goto L277
            r0 = r9
            r1 = r23
            int r0 = r0.readUnsignedShort(r1)
            r27 = r0
            r0 = r23
            r1 = 2
            int r0 = r0 + r1
            r28 = r0
        L23b:
            r0 = r27
            int r27 = r27 + (-1)
            if (r0 <= 0) goto L277
            r0 = r9
            r1 = r11
            r2 = r28
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r28 = r0
            r0 = r9
            r1 = r28
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r29 = r0
            int r28 = r28 + 2
            r0 = r9
            r1 = r26
            r2 = r11
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r29
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r28
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r28 = r0
            goto L23b
        L277:
            r0 = r24
            if (r0 == 0) goto L297
            r0 = r24
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r27 = r0
            r0 = r24
            r1 = 0
            r0.nextAttribute = r1
            r0 = r26
            r1 = r24
            r0.visitAttribute(r1)
            r0 = r27
            r24 = r0
            goto L277
        L297:
            r0 = r26
            r0.visitEnd()
            r0 = r14
            return r0
    }

    private int readMethod(org.objectweb.asm.ClassVisitor r10, org.objectweb.asm.Context r11, int r12) {
            r9 = this;
            r0 = r11
            char[] r0 = r0.charBuffer
            r13 = r0
            r0 = r12
            r14 = r0
            r0 = r11
            r1 = r9
            r2 = r14
            int r1 = r1.readUnsignedShort(r2)
            r0.currentMethodAccessFlags = r1
            r0 = r11
            r1 = r9
            r2 = r14
            r3 = 2
            int r2 = r2 + r3
            r3 = r13
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r0.currentMethodName = r1
            r0 = r11
            r1 = r9
            r2 = r14
            r3 = 4
            int r2 = r2 + r3
            r3 = r13
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r0.currentMethodDescriptor = r1
            int r14 = r14 + 6
            r0 = 0
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = 0
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 0
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = r9
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r29 = r0
            int r14 = r14 + 2
        L67:
            r0 = r29
            int r29 = r29 + (-1)
            if (r0 <= 0) goto L1e7
            r0 = r9
            r1 = r14
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r30 = r0
            r0 = r9
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r31 = r0
            int r14 = r14 + 6
            java.lang.String r0 = "Code"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La1
            r0 = r11
            int r0 = r0.parsingOptions
            r1 = 1
            r0 = r0 & r1
            if (r0 != 0) goto L1dd
            r0 = r14
            r15 = r0
            goto L1dd
        La1:
            java.lang.String r0 = "Exceptions"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le5
            r0 = r14
            r16 = r0
            r0 = r9
            r1 = r16
            int r0 = r0.readUnsignedShort(r1)
            java.lang.String[] r0 = new java.lang.String[r0]
            r17 = r0
            r0 = r16
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
            r0 = 0
            r33 = r0
        Lc4:
            r0 = r33
            r1 = r17
            int r1 = r1.length
            if (r0 >= r1) goto Le2
            r0 = r17
            r1 = r33
            r2 = r9
            r3 = r32
            r4 = r13
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r32 = r32 + 2
            int r33 = r33 + 1
            goto Lc4
        Le2:
            goto L1dd
        Le5:
            java.lang.String r0 = "Signature"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lfa
            r0 = r9
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r19 = r0
            goto L1dd
        Lfa:
            java.lang.String r0 = "Deprecated"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L113
            r0 = r11
            r1 = r0
            int r1 = r1.currentMethodAccessFlags
            r2 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r2
            r0.currentMethodAccessFlags = r1
            goto L1dd
        L113:
            java.lang.String r0 = "RuntimeVisibleAnnotations"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L124
            r0 = r14
            r20 = r0
            goto L1dd
        L124:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L135
            r0 = r14
            r24 = r0
            goto L1dd
        L135:
            java.lang.String r0 = "AnnotationDefault"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L147
            r0 = r14
            r26 = r0
            goto L1dd
        L147:
            java.lang.String r0 = "Synthetic"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L164
            r0 = 1
            r18 = r0
            r0 = r11
            r1 = r0
            int r1 = r1.currentMethodAccessFlags
            r2 = 4096(0x1000, float:5.74E-42)
            r1 = r1 | r2
            r0.currentMethodAccessFlags = r1
            goto L1dd
        L164:
            java.lang.String r0 = "RuntimeInvisibleAnnotations"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L176
            r0 = r14
            r21 = r0
            goto L1dd
        L176:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L188
            r0 = r14
            r25 = r0
            goto L1dd
        L188:
            java.lang.String r0 = "RuntimeVisibleParameterAnnotations"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19a
            r0 = r14
            r22 = r0
            goto L1dd
        L19a:
            java.lang.String r0 = "RuntimeInvisibleParameterAnnotations"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1ac
            r0 = r14
            r23 = r0
            goto L1dd
        L1ac:
            java.lang.String r0 = "MethodParameters"
            r1 = r30
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1be
            r0 = r14
            r27 = r0
            goto L1dd
        L1be:
            r0 = r9
            r1 = r11
            org.objectweb.asm.Attribute[] r1 = r1.attributePrototypes
            r2 = r30
            r3 = r14
            r4 = r31
            r5 = r13
            r6 = -1
            r7 = 0
            org.objectweb.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r32 = r0
            r0 = r32
            r1 = r28
            r0.nextAttribute = r1
            r0 = r32
            r28 = r0
        L1dd:
            r0 = r14
            r1 = r31
            int r0 = r0 + r1
            r14 = r0
            goto L67
        L1e7:
            r0 = r10
            r1 = r11
            int r1 = r1.currentMethodAccessFlags
            r2 = r11
            java.lang.String r2 = r2.currentMethodName
            r3 = r11
            java.lang.String r3 = r3.currentMethodDescriptor
            r4 = r19
            if (r4 != 0) goto L1fd
            r4 = 0
            goto L205
        L1fd:
            r4 = r9
            r5 = r19
            r6 = r13
            java.lang.String r4 = r4.readUtf(r5, r6)
        L205:
            r5 = r17
            org.objectweb.asm.MethodVisitor r0 = r0.visitMethod(r1, r2, r3, r4, r5)
            r30 = r0
            r0 = r30
            if (r0 != 0) goto L214
            r0 = r14
            return r0
        L214:
            r0 = r30
            boolean r0 = r0 instanceof org.objectweb.asm.MethodWriter
            if (r0 == 0) goto L256
            r0 = r30
            org.objectweb.asm.MethodWriter r0 = (org.objectweb.asm.MethodWriter) r0
            r31 = r0
            r0 = r31
            r1 = r9
            r2 = r18
            r3 = r11
            int r3 = r3.currentMethodAccessFlags
            r4 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L237
            r3 = 1
            goto L238
        L237:
            r3 = 0
        L238:
            r4 = r9
            r5 = r12
            r6 = 4
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r5 = r19
            r6 = r16
            boolean r0 = r0.canCopyMethodAttributes(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L256
            r0 = r31
            r1 = r12
            r2 = r14
            r3 = r12
            int r2 = r2 - r3
            r0.setMethodAttributesSource(r1, r2)
            r0 = r14
            return r0
        L256:
            r0 = r27
            if (r0 == 0) goto L295
            r0 = r11
            int r0 = r0.parsingOptions
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L295
            r0 = r9
            r1 = r27
            int r0 = r0.readByte(r1)
            r31 = r0
            r0 = r27
            r1 = 1
            int r0 = r0 + r1
            r32 = r0
        L272:
            r0 = r31
            int r31 = r31 + (-1)
            if (r0 <= 0) goto L295
            r0 = r30
            r1 = r9
            r2 = r32
            r3 = r13
            java.lang.String r1 = r1.readUTF8(r2, r3)
            r2 = r9
            r3 = r32
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r0.visitParameter(r1, r2)
            int r32 = r32 + 4
            goto L272
        L295:
            r0 = r26
            if (r0 == 0) goto L2b7
            r0 = r30
            org.objectweb.asm.AnnotationVisitor r0 = r0.visitAnnotationDefault()
            r31 = r0
            r0 = r9
            r1 = r31
            r2 = r26
            r3 = 0
            r4 = r13
            int r0 = r0.readElementValue(r1, r2, r3, r4)
            r0 = r31
            if (r0 == 0) goto L2b7
            r0 = r31
            r0.visitEnd()
        L2b7:
            r0 = r20
            if (r0 == 0) goto L2f5
            r0 = r9
            r1 = r20
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r20
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L2ca:
            r0 = r31
            int r31 = r31 + (-1)
            if (r0 <= 0) goto L2f5
            r0 = r9
            r1 = r32
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r33 = r0
            int r32 = r32 + 2
            r0 = r9
            r1 = r30
            r2 = r33
            r3 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r32
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r32 = r0
            goto L2ca
        L2f5:
            r0 = r21
            if (r0 == 0) goto L333
            r0 = r9
            r1 = r21
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r21
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L308:
            r0 = r31
            int r31 = r31 + (-1)
            if (r0 <= 0) goto L333
            r0 = r9
            r1 = r32
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r33 = r0
            int r32 = r32 + 2
            r0 = r9
            r1 = r30
            r2 = r33
            r3 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r32
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r32 = r0
            goto L308
        L333:
            r0 = r24
            if (r0 == 0) goto L382
            r0 = r9
            r1 = r24
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r24
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L346:
            r0 = r31
            int r31 = r31 + (-1)
            if (r0 <= 0) goto L382
            r0 = r9
            r1 = r11
            r2 = r32
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r32 = r0
            r0 = r9
            r1 = r32
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r33 = r0
            int r32 = r32 + 2
            r0 = r9
            r1 = r30
            r2 = r11
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r33
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r32
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r32 = r0
            goto L346
        L382:
            r0 = r25
            if (r0 == 0) goto L3d1
            r0 = r9
            r1 = r25
            int r0 = r0.readUnsignedShort(r1)
            r31 = r0
            r0 = r25
            r1 = 2
            int r0 = r0 + r1
            r32 = r0
        L395:
            r0 = r31
            int r31 = r31 + (-1)
            if (r0 <= 0) goto L3d1
            r0 = r9
            r1 = r11
            r2 = r32
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r32 = r0
            r0 = r9
            r1 = r32
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r33 = r0
            int r32 = r32 + 2
            r0 = r9
            r1 = r30
            r2 = r11
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r11
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r33
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTypeAnnotation(r2, r3, r4, r5)
            r2 = r32
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r32 = r0
            goto L395
        L3d1:
            r0 = r22
            if (r0 == 0) goto L3e0
            r0 = r9
            r1 = r30
            r2 = r11
            r3 = r22
            r4 = 1
            r0.readParameterAnnotations(r1, r2, r3, r4)
        L3e0:
            r0 = r23
            if (r0 == 0) goto L3ef
            r0 = r9
            r1 = r30
            r2 = r11
            r3 = r23
            r4 = 0
            r0.readParameterAnnotations(r1, r2, r3, r4)
        L3ef:
            r0 = r28
            if (r0 == 0) goto L40f
            r0 = r28
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r31 = r0
            r0 = r28
            r1 = 0
            r0.nextAttribute = r1
            r0 = r30
            r1 = r28
            r0.visitAttribute(r1)
            r0 = r31
            r28 = r0
            goto L3ef
        L40f:
            r0 = r15
            if (r0 == 0) goto L422
            r0 = r30
            r0.visitCode()
            r0 = r9
            r1 = r30
            r2 = r11
            r3 = r15
            r0.readCode(r1, r2, r3)
        L422:
            r0 = r30
            r0.visitEnd()
            r0 = r14
            return r0
    }

    private void readCode(org.objectweb.asm.MethodVisitor r11, org.objectweb.asm.Context r12, int r13) {
            r10 = this;
            r0 = r13
            r14 = r0
            r0 = r10
            byte[] r0 = r0.classFileBuffer
            r15 = r0
            r0 = r12
            char[] r0 = r0.charBuffer
            r16 = r0
            r0 = r10
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r17 = r0
            r0 = r10
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r18 = r0
            r0 = r10
            r1 = r14
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r19 = r0
            int r14 = r14 + 8
            r0 = r19
            r1 = r10
            byte[] r1 = r1.classFileBuffer
            int r1 = r1.length
            r2 = r14
            int r1 = r1 - r2
            if (r0 <= r1) goto L43
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L43:
            r0 = r14
            r20 = r0
            r0 = r14
            r1 = r19
            int r0 = r0 + r1
            r21 = r0
            r0 = r12
            r1 = r19
            r2 = 1
            int r1 = r1 + r2
            org.objectweb.asm.Label[] r1 = new org.objectweb.asm.Label[r1]
            r2 = r1; r1 = r0; r0 = r2; 
            r1.currentMethodLabels = r2
            r22 = r0
        L5c:
            r0 = r14
            r1 = r21
            if (r0 >= r1) goto L58d
            r0 = r14
            r1 = r20
            int r0 = r0 - r1
            r23 = r0
            r0 = r15
            r1 = r14
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r24 = r0
            r0 = r24
            switch(r0) {
                case 0: goto L3f8;
                case 1: goto L3f8;
                case 2: goto L3f8;
                case 3: goto L3f8;
                case 4: goto L3f8;
                case 5: goto L3f8;
                case 6: goto L3f8;
                case 7: goto L3f8;
                case 8: goto L3f8;
                case 9: goto L3f8;
                case 10: goto L3f8;
                case 11: goto L3f8;
                case 12: goto L3f8;
                case 13: goto L3f8;
                case 14: goto L3f8;
                case 15: goto L3f8;
                case 16: goto L56a;
                case 17: goto L570;
                case 18: goto L56a;
                case 19: goto L570;
                case 20: goto L570;
                case 21: goto L56a;
                case 22: goto L56a;
                case 23: goto L56a;
                case 24: goto L56a;
                case 25: goto L56a;
                case 26: goto L3f8;
                case 27: goto L3f8;
                case 28: goto L3f8;
                case 29: goto L3f8;
                case 30: goto L3f8;
                case 31: goto L3f8;
                case 32: goto L3f8;
                case 33: goto L3f8;
                case 34: goto L3f8;
                case 35: goto L3f8;
                case 36: goto L3f8;
                case 37: goto L3f8;
                case 38: goto L3f8;
                case 39: goto L3f8;
                case 40: goto L3f8;
                case 41: goto L3f8;
                case 42: goto L3f8;
                case 43: goto L3f8;
                case 44: goto L3f8;
                case 45: goto L3f8;
                case 46: goto L3f8;
                case 47: goto L3f8;
                case 48: goto L3f8;
                case 49: goto L3f8;
                case 50: goto L3f8;
                case 51: goto L3f8;
                case 52: goto L3f8;
                case 53: goto L3f8;
                case 54: goto L56a;
                case 55: goto L56a;
                case 56: goto L56a;
                case 57: goto L56a;
                case 58: goto L56a;
                case 59: goto L3f8;
                case 60: goto L3f8;
                case 61: goto L3f8;
                case 62: goto L3f8;
                case 63: goto L3f8;
                case 64: goto L3f8;
                case 65: goto L3f8;
                case 66: goto L3f8;
                case 67: goto L3f8;
                case 68: goto L3f8;
                case 69: goto L3f8;
                case 70: goto L3f8;
                case 71: goto L3f8;
                case 72: goto L3f8;
                case 73: goto L3f8;
                case 74: goto L3f8;
                case 75: goto L3f8;
                case 76: goto L3f8;
                case 77: goto L3f8;
                case 78: goto L3f8;
                case 79: goto L3f8;
                case 80: goto L3f8;
                case 81: goto L3f8;
                case 82: goto L3f8;
                case 83: goto L3f8;
                case 84: goto L3f8;
                case 85: goto L3f8;
                case 86: goto L3f8;
                case 87: goto L3f8;
                case 88: goto L3f8;
                case 89: goto L3f8;
                case 90: goto L3f8;
                case 91: goto L3f8;
                case 92: goto L3f8;
                case 93: goto L3f8;
                case 94: goto L3f8;
                case 95: goto L3f8;
                case 96: goto L3f8;
                case 97: goto L3f8;
                case 98: goto L3f8;
                case 99: goto L3f8;
                case 100: goto L3f8;
                case 101: goto L3f8;
                case 102: goto L3f8;
                case 103: goto L3f8;
                case 104: goto L3f8;
                case 105: goto L3f8;
                case 106: goto L3f8;
                case 107: goto L3f8;
                case 108: goto L3f8;
                case 109: goto L3f8;
                case 110: goto L3f8;
                case 111: goto L3f8;
                case 112: goto L3f8;
                case 113: goto L3f8;
                case 114: goto L3f8;
                case 115: goto L3f8;
                case 116: goto L3f8;
                case 117: goto L3f8;
                case 118: goto L3f8;
                case 119: goto L3f8;
                case 120: goto L3f8;
                case 121: goto L3f8;
                case 122: goto L3f8;
                case 123: goto L3f8;
                case 124: goto L3f8;
                case 125: goto L3f8;
                case 126: goto L3f8;
                case 127: goto L3f8;
                case 128: goto L3f8;
                case 129: goto L3f8;
                case 130: goto L3f8;
                case 131: goto L3f8;
                case 132: goto L570;
                case 133: goto L3f8;
                case 134: goto L3f8;
                case 135: goto L3f8;
                case 136: goto L3f8;
                case 137: goto L3f8;
                case 138: goto L3f8;
                case 139: goto L3f8;
                case 140: goto L3f8;
                case 141: goto L3f8;
                case 142: goto L3f8;
                case 143: goto L3f8;
                case 144: goto L3f8;
                case 145: goto L3f8;
                case 146: goto L3f8;
                case 147: goto L3f8;
                case 148: goto L3f8;
                case 149: goto L3f8;
                case 150: goto L3f8;
                case 151: goto L3f8;
                case 152: goto L3f8;
                case 153: goto L3fe;
                case 154: goto L3fe;
                case 155: goto L3fe;
                case 156: goto L3fe;
                case 157: goto L3fe;
                case 158: goto L3fe;
                case 159: goto L3fe;
                case 160: goto L3fe;
                case 161: goto L3fe;
                case 162: goto L3fe;
                case 163: goto L3fe;
                case 164: goto L3fe;
                case 165: goto L3fe;
                case 166: goto L3fe;
                case 167: goto L3fe;
                case 168: goto L3fe;
                case 169: goto L56a;
                case 170: goto L4d0;
                case 171: goto L522;
                case 172: goto L3f8;
                case 173: goto L3f8;
                case 174: goto L3f8;
                case 175: goto L3f8;
                case 176: goto L3f8;
                case 177: goto L3f8;
                case 178: goto L570;
                case 179: goto L570;
                case 180: goto L570;
                case 181: goto L570;
                case 182: goto L570;
                case 183: goto L570;
                case 184: goto L570;
                case 185: goto L576;
                case 186: goto L576;
                case 187: goto L570;
                case 188: goto L56a;
                case 189: goto L570;
                case 190: goto L3f8;
                case 191: goto L3f8;
                case 192: goto L570;
                case 193: goto L570;
                case 194: goto L3f8;
                case 195: goto L3f8;
                case 196: goto L446;
                case 197: goto L57c;
                case 198: goto L3fe;
                case 199: goto L3fe;
                case 200: goto L42e;
                case 201: goto L42e;
                case 202: goto L416;
                case 203: goto L416;
                case 204: goto L416;
                case 205: goto L416;
                case 206: goto L416;
                case 207: goto L416;
                case 208: goto L416;
                case 209: goto L416;
                case 210: goto L416;
                case 211: goto L416;
                case 212: goto L416;
                case 213: goto L416;
                case 214: goto L416;
                case 215: goto L416;
                case 216: goto L416;
                case 217: goto L416;
                case 218: goto L416;
                case 219: goto L416;
                case 220: goto L42e;
                default: goto L582;
            }
        L3f8:
            int r14 = r14 + 1
            goto L58a
        L3fe:
            r0 = r10
            r1 = r23
            r2 = r10
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            short r2 = r2.readShort(r3)
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            int r14 = r14 + 3
            goto L58a
        L416:
            r0 = r10
            r1 = r23
            r2 = r10
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            int r14 = r14 + 3
            goto L58a
        L42e:
            r0 = r10
            r1 = r23
            r2 = r10
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            int r14 = r14 + 5
            goto L58a
        L446:
            r0 = r15
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 21: goto L4bc;
                case 22: goto L4bc;
                case 23: goto L4bc;
                case 24: goto L4bc;
                case 25: goto L4bc;
                case 54: goto L4bc;
                case 55: goto L4bc;
                case 56: goto L4bc;
                case 57: goto L4bc;
                case 58: goto L4bc;
                case 132: goto L4c2;
                case 169: goto L4bc;
                default: goto L4c8;
            }
        L4bc:
            int r14 = r14 + 4
            goto L58a
        L4c2:
            int r14 = r14 + 6
            goto L58a
        L4c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L4d0:
            r0 = r14
            r1 = 4
            r2 = r23
            r3 = 3
            r2 = r2 & r3
            int r1 = r1 - r2
            int r0 = r0 + r1
            r14 = r0
            r0 = r10
            r1 = r23
            r2 = r10
            r3 = r14
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r0 = r10
            r1 = r14
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r1 = r10
            r2 = r14
            r3 = 4
            int r2 = r2 + r3
            int r1 = r1.readInt(r2)
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            r25 = r0
            int r14 = r14 + 12
        L504:
            r0 = r25
            int r25 = r25 + (-1)
            if (r0 <= 0) goto L58a
            r0 = r10
            r1 = r23
            r2 = r10
            r3 = r14
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            int r14 = r14 + 4
            goto L504
        L522:
            r0 = r14
            r1 = 4
            r2 = r23
            r3 = 3
            r2 = r2 & r3
            int r1 = r1 - r2
            int r0 = r0 + r1
            r14 = r0
            r0 = r10
            r1 = r23
            r2 = r10
            r3 = r14
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r0 = r10
            r1 = r14
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r26 = r0
            int r14 = r14 + 8
        L54a:
            r0 = r26
            int r26 = r26 + (-1)
            if (r0 <= 0) goto L58a
            r0 = r10
            r1 = r23
            r2 = r10
            r3 = r14
            r4 = 4
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            int r14 = r14 + 8
            goto L54a
        L56a:
            int r14 = r14 + 2
            goto L58a
        L570:
            int r14 = r14 + 3
            goto L58a
        L576:
            int r14 = r14 + 5
            goto L58a
        L57c:
            int r14 = r14 + 4
            goto L58a
        L582:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L58a:
            goto L5c
        L58d:
            r0 = r10
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r23 = r0
            int r14 = r14 + 2
        L598:
            r0 = r23
            int r23 = r23 + (-1)
            if (r0 <= 0) goto L5f6
            r0 = r10
            r1 = r10
            r2 = r14
            int r1 = r1.readUnsignedShort(r2)
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r24 = r0
            r0 = r10
            r1 = r10
            r2 = r14
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r25 = r0
            r0 = r10
            r1 = r10
            r2 = r14
            r3 = 4
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r26 = r0
            r0 = r10
            r1 = r10
            int[] r1 = r1.cpInfoOffsets
            r2 = r10
            r3 = r14
            r4 = 6
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r1 = r1[r2]
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r27 = r0
            int r14 = r14 + 8
            r0 = r11
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r0.visitTryCatchBlock(r1, r2, r3, r4)
            goto L598
        L5f6:
            r0 = 0
            r24 = r0
            r0 = 0
            r25 = r0
            r0 = 1
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = 0
            r28 = r0
            r0 = 0
            r29 = r0
            r0 = 0
            r30 = r0
            r0 = 0
            r31 = r0
            r0 = r10
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r32 = r0
            int r14 = r14 + 2
        L619:
            r0 = r32
            int r32 = r32 + (-1)
            if (r0 <= 0) goto L7a5
            r0 = r10
            r1 = r14
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r33 = r0
            r0 = r10
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r34 = r0
            int r14 = r14 + 6
            java.lang.String r0 = "LocalVariableTable"
            r1 = r33
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L695
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L79b
            r0 = r14
            r27 = r0
            r0 = r14
            r35 = r0
            r0 = r10
            r1 = r35
            int r0 = r0.readUnsignedShort(r1)
            r36 = r0
            int r35 = r35 + 2
        L65f:
            r0 = r36
            int r36 = r36 + (-1)
            if (r0 <= 0) goto L692
            r0 = r10
            r1 = r35
            int r0 = r0.readUnsignedShort(r1)
            r37 = r0
            r0 = r10
            r1 = r37
            r2 = r22
            r0.createDebugLabel(r1, r2)
            r0 = r10
            r1 = r35
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            r0 = r10
            r1 = r37
            r2 = r38
            int r1 = r1 + r2
            r2 = r22
            r0.createDebugLabel(r1, r2)
            int r35 = r35 + 10
            goto L65f
        L692:
            goto L79b
        L695:
            java.lang.String r0 = "LocalVariableTypeTable"
            r1 = r33
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6a7
            r0 = r14
            r28 = r0
            goto L79b
        L6a7:
            java.lang.String r0 = "LineNumberTable"
            r1 = r33
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6ff
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L79b
            r0 = r14
            r35 = r0
            r0 = r10
            r1 = r35
            int r0 = r0.readUnsignedShort(r1)
            r36 = r0
            int r35 = r35 + 2
        L6ca:
            r0 = r36
            int r36 = r36 + (-1)
            if (r0 <= 0) goto L6fc
            r0 = r10
            r1 = r35
            int r0 = r0.readUnsignedShort(r1)
            r37 = r0
            r0 = r10
            r1 = r35
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r38 = r0
            int r35 = r35 + 4
            r0 = r10
            r1 = r37
            r2 = r22
            r0.createDebugLabel(r1, r2)
            r0 = r22
            r1 = r37
            r0 = r0[r1]
            r1 = r38
            r0.addLineNumber(r1)
            goto L6ca
        L6fc:
            goto L79b
        L6ff:
            java.lang.String r0 = "RuntimeVisibleTypeAnnotations"
            r1 = r33
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L717
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = 1
            int[] r0 = r0.readTypeAnnotations(r1, r2, r3, r4)
            r29 = r0
            goto L79b
        L717:
            java.lang.String r0 = "RuntimeInvisibleTypeAnnotations"
            r1 = r33
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L730
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = 0
            int[] r0 = r0.readTypeAnnotations(r1, r2, r3, r4)
            r30 = r0
            goto L79b
        L730:
            java.lang.String r0 = "StackMapTable"
            r1 = r33
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L754
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 4
            r0 = r0 & r1
            if (r0 != 0) goto L79b
            r0 = r14
            r1 = 2
            int r0 = r0 + r1
            r24 = r0
            r0 = r14
            r1 = r34
            int r0 = r0 + r1
            r25 = r0
            goto L79b
        L754:
            java.lang.String r0 = "StackMap"
            r1 = r33
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L77b
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 4
            r0 = r0 & r1
            if (r0 != 0) goto L79b
            r0 = r14
            r1 = 2
            int r0 = r0 + r1
            r24 = r0
            r0 = r14
            r1 = r34
            int r0 = r0 + r1
            r25 = r0
            r0 = 0
            r26 = r0
            goto L79b
        L77b:
            r0 = r10
            r1 = r12
            org.objectweb.asm.Attribute[] r1 = r1.attributePrototypes
            r2 = r33
            r3 = r14
            r4 = r34
            r5 = r16
            r6 = r13
            r7 = r22
            org.objectweb.asm.Attribute r0 = r0.readAttribute(r1, r2, r3, r4, r5, r6, r7)
            r35 = r0
            r0 = r35
            r1 = r31
            r0.nextAttribute = r1
            r0 = r35
            r31 = r0
        L79b:
            r0 = r14
            r1 = r34
            int r0 = r0 + r1
            r14 = r0
            goto L619
        L7a5:
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L7b3
            r0 = 1
            goto L7b4
        L7b3:
            r0 = 0
        L7b4:
            r33 = r0
            r0 = r24
            if (r0 == 0) goto L83e
            r0 = r12
            r1 = -1
            r0.currentFrameOffset = r1
            r0 = r12
            r1 = 0
            r0.currentFrameType = r1
            r0 = r12
            r1 = 0
            r0.currentFrameLocalCount = r1
            r0 = r12
            r1 = 0
            r0.currentFrameLocalCountDelta = r1
            r0 = r12
            r1 = r18
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.currentFrameLocalTypes = r1
            r0 = r12
            r1 = 0
            r0.currentFrameStackCount = r1
            r0 = r12
            r1 = r17
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.currentFrameStackTypes = r1
            r0 = r33
            if (r0 == 0) goto L7f0
            r0 = r10
            r1 = r12
            r0.computeImplicitFrame(r1)
        L7f0:
            r0 = r24
            r34 = r0
        L7f4:
            r0 = r34
            r1 = r25
            r2 = 2
            int r1 = r1 - r2
            if (r0 >= r1) goto L83e
            r0 = r15
            r1 = r34
            r0 = r0[r1]
            r1 = 8
            if (r0 != r1) goto L838
            r0 = r10
            r1 = r34
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r35 = r0
            r0 = r35
            if (r0 < 0) goto L838
            r0 = r35
            r1 = r19
            if (r0 >= r1) goto L838
            r0 = r15
            r1 = r20
            r2 = r35
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 != r1) goto L838
            r0 = r10
            r1 = r35
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
        L838:
            int r34 = r34 + 1
            goto L7f4
        L83e:
            r0 = r33
            if (r0 == 0) goto L858
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 == 0) goto L858
            r0 = r11
            r1 = -1
            r2 = r18
            r3 = 0
            r4 = 0
            r5 = 0
            r0.visitFrame(r1, r2, r3, r4, r5)
        L858:
            r0 = 0
            r34 = r0
            r0 = r10
            r1 = r29
            r2 = 0
            int r0 = r0.getTypeAnnotationBytecodeOffset(r1, r2)
            r35 = r0
            r0 = 0
            r36 = r0
            r0 = r10
            r1 = r30
            r2 = 0
            int r0 = r0.getTypeAnnotationBytecodeOffset(r1, r2)
            r37 = r0
            r0 = 0
            r38 = r0
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 256(0x100, float:3.59E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L883
            r0 = 33
            goto L884
        L883:
            r0 = 0
        L884:
            r39 = r0
            r0 = r20
            r14 = r0
        L88a:
            r0 = r14
            r1 = r21
            if (r0 >= r1) goto L11c0
            r0 = r14
            r1 = r20
            int r0 = r0 - r1
            r40 = r0
            r0 = r22
            r1 = r40
            r0 = r0[r1]
            r41 = r0
            r0 = r41
            if (r0 == 0) goto L8b8
            r0 = r41
            r1 = r11
            r2 = r12
            int r2 = r2.parsingOptions
            r3 = 2
            r2 = r2 & r3
            if (r2 != 0) goto L8b4
            r2 = 1
            goto L8b5
        L8b4:
            r2 = 0
        L8b5:
            r0.accept(r1, r2)
        L8b8:
            r0 = r24
            if (r0 == 0) goto L930
            r0 = r12
            int r0 = r0.currentFrameOffset
            r1 = r40
            if (r0 == r1) goto L8ce
            r0 = r12
            int r0 = r0.currentFrameOffset
            r1 = -1
            if (r0 != r1) goto L930
        L8ce:
            r0 = r12
            int r0 = r0.currentFrameOffset
            r1 = -1
            if (r0 == r1) goto L913
            r0 = r26
            if (r0 == 0) goto L8e0
            r0 = r33
            if (r0 == 0) goto L8f8
        L8e0:
            r0 = r11
            r1 = -1
            r2 = r12
            int r2 = r2.currentFrameLocalCount
            r3 = r12
            java.lang.Object[] r3 = r3.currentFrameLocalTypes
            r4 = r12
            int r4 = r4.currentFrameStackCount
            r5 = r12
            java.lang.Object[] r5 = r5.currentFrameStackTypes
            r0.visitFrame(r1, r2, r3, r4, r5)
            goto L910
        L8f8:
            r0 = r11
            r1 = r12
            int r1 = r1.currentFrameType
            r2 = r12
            int r2 = r2.currentFrameLocalCountDelta
            r3 = r12
            java.lang.Object[] r3 = r3.currentFrameLocalTypes
            r4 = r12
            int r4 = r4.currentFrameStackCount
            r5 = r12
            java.lang.Object[] r5 = r5.currentFrameStackTypes
            r0.visitFrame(r1, r2, r3, r4, r5)
        L910:
            r0 = 0
            r38 = r0
        L913:
            r0 = r24
            r1 = r25
            if (r0 >= r1) goto L92a
            r0 = r10
            r1 = r24
            r2 = r26
            r3 = r33
            r4 = r12
            int r0 = r0.readStackMapFrame(r1, r2, r3, r4)
            r24 = r0
            goto L8b8
        L92a:
            r0 = 0
            r24 = r0
            goto L8b8
        L930:
            r0 = r38
            if (r0 == 0) goto L94d
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L94a
            r0 = r11
            r1 = 256(0x100, float:3.59E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.visitFrame(r1, r2, r3, r4, r5)
        L94a:
            r0 = 0
            r38 = r0
        L94d:
            r0 = r15
            r1 = r14
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r42 = r0
            r0 = r42
            switch(r0) {
                case 0: goto Lcdc;
                case 1: goto Lcdc;
                case 2: goto Lcdc;
                case 3: goto Lcdc;
                case 4: goto Lcdc;
                case 5: goto Lcdc;
                case 6: goto Lcdc;
                case 7: goto Lcdc;
                case 8: goto Lcdc;
                case 9: goto Lcdc;
                case 10: goto Lcdc;
                case 11: goto Lcdc;
                case 12: goto Lcdc;
                case 13: goto Lcdc;
                case 14: goto Lcdc;
                case 15: goto Lcdc;
                case 16: goto Lf2d;
                case 17: goto Lf40;
                case 18: goto Lf54;
                case 19: goto Lf6f;
                case 20: goto Lf6f;
                case 21: goto Lf16;
                case 22: goto Lf16;
                case 23: goto Lf16;
                case 24: goto Lf16;
                case 25: goto Lf16;
                case 26: goto Lce8;
                case 27: goto Lce8;
                case 28: goto Lce8;
                case 29: goto Lce8;
                case 30: goto Lce8;
                case 31: goto Lce8;
                case 32: goto Lce8;
                case 33: goto Lce8;
                case 34: goto Lce8;
                case 35: goto Lce8;
                case 36: goto Lce8;
                case 37: goto Lce8;
                case 38: goto Lce8;
                case 39: goto Lce8;
                case 40: goto Lce8;
                case 41: goto Lce8;
                case 42: goto Lce8;
                case 43: goto Lce8;
                case 44: goto Lce8;
                case 45: goto Lce8;
                case 46: goto Lcdc;
                case 47: goto Lcdc;
                case 48: goto Lcdc;
                case 49: goto Lcdc;
                case 50: goto Lcdc;
                case 51: goto Lcdc;
                case 52: goto Lcdc;
                case 53: goto Lcdc;
                case 54: goto Lf16;
                case 55: goto Lf16;
                case 56: goto Lf16;
                case 57: goto Lf16;
                case 58: goto Lf16;
                case 59: goto Ld00;
                case 60: goto Ld00;
                case 61: goto Ld00;
                case 62: goto Ld00;
                case 63: goto Ld00;
                case 64: goto Ld00;
                case 65: goto Ld00;
                case 66: goto Ld00;
                case 67: goto Ld00;
                case 68: goto Ld00;
                case 69: goto Ld00;
                case 70: goto Ld00;
                case 71: goto Ld00;
                case 72: goto Ld00;
                case 73: goto Ld00;
                case 74: goto Ld00;
                case 75: goto Ld00;
                case 76: goto Ld00;
                case 77: goto Ld00;
                case 78: goto Ld00;
                case 79: goto Lcdc;
                case 80: goto Lcdc;
                case 81: goto Lcdc;
                case 82: goto Lcdc;
                case 83: goto Lcdc;
                case 84: goto Lcdc;
                case 85: goto Lcdc;
                case 86: goto Lcdc;
                case 87: goto Lcdc;
                case 88: goto Lcdc;
                case 89: goto Lcdc;
                case 90: goto Lcdc;
                case 91: goto Lcdc;
                case 92: goto Lcdc;
                case 93: goto Lcdc;
                case 94: goto Lcdc;
                case 95: goto Lcdc;
                case 96: goto Lcdc;
                case 97: goto Lcdc;
                case 98: goto Lcdc;
                case 99: goto Lcdc;
                case 100: goto Lcdc;
                case 101: goto Lcdc;
                case 102: goto Lcdc;
                case 103: goto Lcdc;
                case 104: goto Lcdc;
                case 105: goto Lcdc;
                case 106: goto Lcdc;
                case 107: goto Lcdc;
                case 108: goto Lcdc;
                case 109: goto Lcdc;
                case 110: goto Lcdc;
                case 111: goto Lcdc;
                case 112: goto Lcdc;
                case 113: goto Lcdc;
                case 114: goto Lcdc;
                case 115: goto Lcdc;
                case 116: goto Lcdc;
                case 117: goto Lcdc;
                case 118: goto Lcdc;
                case 119: goto Lcdc;
                case 120: goto Lcdc;
                case 121: goto Lcdc;
                case 122: goto Lcdc;
                case 123: goto Lcdc;
                case 124: goto Lcdc;
                case 125: goto Lcdc;
                case 126: goto Lcdc;
                case 127: goto Lcdc;
                case 128: goto Lcdc;
                case 129: goto Lcdc;
                case 130: goto Lcdc;
                case 131: goto Lcdc;
                case 132: goto L10c0;
                case 133: goto Lcdc;
                case 134: goto Lcdc;
                case 135: goto Lcdc;
                case 136: goto Lcdc;
                case 137: goto Lcdc;
                case 138: goto Lcdc;
                case 139: goto Lcdc;
                case 140: goto Lcdc;
                case 141: goto Lcdc;
                case 142: goto Lcdc;
                case 143: goto Lcdc;
                case 144: goto Lcdc;
                case 145: goto Lcdc;
                case 146: goto Lcdc;
                case 147: goto Lcdc;
                case 148: goto Lcdc;
                case 149: goto Lcdc;
                case 150: goto Lcdc;
                case 151: goto Lcdc;
                case 152: goto Lcdc;
                case 153: goto Ld18;
                case 154: goto Ld18;
                case 155: goto Ld18;
                case 156: goto Ld18;
                case 157: goto Ld18;
                case 158: goto Ld18;
                case 159: goto Ld18;
                case 160: goto Ld18;
                case 161: goto Ld18;
                case 162: goto Ld18;
                case 163: goto Ld18;
                case 164: goto Ld18;
                case 165: goto Ld18;
                case 166: goto Ld18;
                case 167: goto Ld18;
                case 168: goto Ld18;
                case 169: goto Lf16;
                case 170: goto Le34;
                case 171: goto Lea5;
                case 172: goto Lcdc;
                case 173: goto Lcdc;
                case 174: goto Lcdc;
                case 175: goto Lcdc;
                case 176: goto Lcdc;
                case 177: goto Lcdc;
                case 178: goto Lf87;
                case 179: goto Lf87;
                case 180: goto Lf87;
                case 181: goto Lf87;
                case 182: goto Lf87;
                case 183: goto Lf87;
                case 184: goto Lf87;
                case 185: goto Lf87;
                case 186: goto L1011;
                case 187: goto L10aa;
                case 188: goto Lf2d;
                case 189: goto L10aa;
                case 190: goto Lcdc;
                case 191: goto Lcdc;
                case 192: goto L10aa;
                case 193: goto L10aa;
                case 194: goto Lcdc;
                case 195: goto Lcdc;
                case 196: goto Ldf1;
                case 197: goto L10dc;
                case 198: goto Ld18;
                case 199: goto Ld18;
                case 200: goto Ld32;
                case 201: goto Ld32;
                case 202: goto Ld4f;
                case 203: goto Ld4f;
                case 204: goto Ld4f;
                case 205: goto Ld4f;
                case 206: goto Ld4f;
                case 207: goto Ld4f;
                case 208: goto Ld4f;
                case 209: goto Ld4f;
                case 210: goto Ld4f;
                case 211: goto Ld4f;
                case 212: goto Ld4f;
                case 213: goto Ld4f;
                case 214: goto Ld4f;
                case 215: goto Ld4f;
                case 216: goto Ld4f;
                case 217: goto Ld4f;
                case 218: goto Ld4f;
                case 219: goto Ld4f;
                case 220: goto Ldd3;
                default: goto L10fb;
            }
        Lcdc:
            r0 = r11
            r1 = r42
            r0.visitInsn(r1)
            int r14 = r14 + 1
            goto L1103
        Lce8:
            int r42 = r42 + (-26)
            r0 = r11
            r1 = 21
            r2 = r42
            r3 = 2
            int r2 = r2 >> r3
            int r1 = r1 + r2
            r2 = r42
            r3 = 3
            r2 = r2 & r3
            r0.visitVarInsn(r1, r2)
            int r14 = r14 + 1
            goto L1103
        Ld00:
            int r42 = r42 + (-59)
            r0 = r11
            r1 = 54
            r2 = r42
            r3 = 2
            int r2 = r2 >> r3
            int r1 = r1 + r2
            r2 = r42
            r3 = 3
            r2 = r2 & r3
            r0.visitVarInsn(r1, r2)
            int r14 = r14 + 1
            goto L1103
        Ld18:
            r0 = r11
            r1 = r42
            r2 = r22
            r3 = r40
            r4 = r10
            r5 = r14
            r6 = 1
            int r5 = r5 + r6
            short r4 = r4.readShort(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitJumpInsn(r1, r2)
            int r14 = r14 + 3
            goto L1103
        Ld32:
            r0 = r11
            r1 = r42
            r2 = r39
            int r1 = r1 - r2
            r2 = r22
            r3 = r40
            r4 = r10
            r5 = r14
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitJumpInsn(r1, r2)
            int r14 = r14 + 5
            goto L1103
        Ld4f:
            r0 = r42
            r1 = 218(0xda, float:3.05E-43)
            if (r0 >= r1) goto Ld5f
            r0 = r42
            r1 = 49
            int r0 = r0 - r1
            goto Ld64
        Ld5f:
            r0 = r42
            r1 = 20
            int r0 = r0 - r1
        Ld64:
            r42 = r0
            r0 = r22
            r1 = r40
            r2 = r10
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            int r1 = r1 + r2
            r0 = r0[r1]
            r43 = r0
            r0 = r42
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 == r1) goto Ld86
            r0 = r42
            r1 = 168(0xa8, float:2.35E-43)
            if (r0 != r1) goto Ld94
        Ld86:
            r0 = r11
            r1 = r42
            r2 = 33
            int r1 = r1 + r2
            r2 = r43
            r0.visitJumpInsn(r1, r2)
            goto Ldcd
        Ld94:
            r0 = r42
            r1 = 167(0xa7, float:2.34E-43)
            if (r0 >= r1) goto Lda7
            r0 = r42
            r1 = 1
            int r0 = r0 + r1
            r1 = 1
            r0 = r0 ^ r1
            r1 = 1
            int r0 = r0 - r1
            goto Ldab
        Lda7:
            r0 = r42
            r1 = 1
            r0 = r0 ^ r1
        Ldab:
            r42 = r0
            r0 = r10
            r1 = r40
            r2 = 3
            int r1 = r1 + r2
            r2 = r22
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r44 = r0
            r0 = r11
            r1 = r42
            r2 = r44
            r0.visitJumpInsn(r1, r2)
            r0 = r11
            r1 = 200(0xc8, float:2.8E-43)
            r2 = r43
            r0.visitJumpInsn(r1, r2)
            r0 = 1
            r38 = r0
        Ldcd:
            int r14 = r14 + 3
            goto L1103
        Ldd3:
            r0 = r11
            r1 = 200(0xc8, float:2.8E-43)
            r2 = r22
            r3 = r40
            r4 = r10
            r5 = r14
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitJumpInsn(r1, r2)
            r0 = 1
            r38 = r0
            int r14 = r14 + 5
            goto L1103
        Ldf1:
            r0 = r15
            r1 = r14
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r42 = r0
            r0 = r42
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto Le20
            r0 = r11
            r1 = r10
            r2 = r14
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = r10
            r3 = r14
            r4 = 4
            int r3 = r3 + r4
            short r2 = r2.readShort(r3)
            r0.visitIincInsn(r1, r2)
            int r14 = r14 + 6
            goto L1103
        Le20:
            r0 = r11
            r1 = r42
            r2 = r10
            r3 = r14
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r0.visitVarInsn(r1, r2)
            int r14 = r14 + 4
            goto L1103
        Le34:
            r0 = r14
            r1 = 4
            r2 = r40
            r3 = 3
            r2 = r2 & r3
            int r1 = r1 - r2
            int r0 = r0 + r1
            r14 = r0
            r0 = r22
            r1 = r40
            r2 = r10
            r3 = r14
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r0 = r0[r1]
            r43 = r0
            r0 = r10
            r1 = r14
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r44 = r0
            r0 = r10
            r1 = r14
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r45 = r0
            int r14 = r14 + 12
            r0 = r45
            r1 = r44
            int r0 = r0 - r1
            r1 = 1
            int r0 = r0 + r1
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r46 = r0
            r0 = 0
            r47 = r0
        Le74:
            r0 = r47
            r1 = r46
            int r1 = r1.length
            if (r0 >= r1) goto Le96
            r0 = r46
            r1 = r47
            r2 = r22
            r3 = r40
            r4 = r10
            r5 = r14
            int r4 = r4.readInt(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            int r14 = r14 + 4
            int r47 = r47 + 1
            goto Le74
        Le96:
            r0 = r11
            r1 = r44
            r2 = r45
            r3 = r43
            r4 = r46
            r0.visitTableSwitchInsn(r1, r2, r3, r4)
            goto L1103
        Lea5:
            r0 = r14
            r1 = 4
            r2 = r40
            r3 = 3
            r2 = r2 & r3
            int r1 = r1 - r2
            int r0 = r0 + r1
            r14 = r0
            r0 = r22
            r1 = r40
            r2 = r10
            r3 = r14
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            r0 = r0[r1]
            r43 = r0
            r0 = r10
            r1 = r14
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r44 = r0
            int r14 = r14 + 8
            r0 = r44
            int[] r0 = new int[r0]
            r45 = r0
            r0 = r44
            org.objectweb.asm.Label[] r0 = new org.objectweb.asm.Label[r0]
            r46 = r0
            r0 = 0
            r47 = r0
        Ledb:
            r0 = r47
            r1 = r44
            if (r0 >= r1) goto Lf09
            r0 = r45
            r1 = r47
            r2 = r10
            r3 = r14
            int r2 = r2.readInt(r3)
            r0[r1] = r2
            r0 = r46
            r1 = r47
            r2 = r22
            r3 = r40
            r4 = r10
            r5 = r14
            r6 = 4
            int r5 = r5 + r6
            int r4 = r4.readInt(r5)
            int r3 = r3 + r4
            r2 = r2[r3]
            r0[r1] = r2
            int r14 = r14 + 8
            int r47 = r47 + 1
            goto Ledb
        Lf09:
            r0 = r11
            r1 = r43
            r2 = r45
            r3 = r46
            r0.visitLookupSwitchInsn(r1, r2, r3)
            goto L1103
        Lf16:
            r0 = r11
            r1 = r42
            r2 = r15
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r0.visitVarInsn(r1, r2)
            int r14 = r14 + 2
            goto L1103
        Lf2d:
            r0 = r11
            r1 = r42
            r2 = r15
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitIntInsn(r1, r2)
            int r14 = r14 + 2
            goto L1103
        Lf40:
            r0 = r11
            r1 = r42
            r2 = r10
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            short r2 = r2.readShort(r3)
            r0.visitIntInsn(r1, r2)
            int r14 = r14 + 3
            goto L1103
        Lf54:
            r0 = r11
            r1 = r10
            r2 = r15
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r3 = r16
            java.lang.Object r1 = r1.readConst(r2, r3)
            r0.visitLdcInsn(r1)
            int r14 = r14 + 2
            goto L1103
        Lf6f:
            r0 = r11
            r1 = r10
            r2 = r10
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r3 = r16
            java.lang.Object r1 = r1.readConst(r2, r3)
            r0.visitLdcInsn(r1)
            int r14 = r14 + 3
            goto L1103
        Lf87:
            r0 = r10
            int[] r0 = r0.cpInfoOffsets
            r1 = r10
            r2 = r14
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r43 = r0
            r0 = r10
            int[] r0 = r0.cpInfoOffsets
            r1 = r10
            r2 = r43
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r44 = r0
            r0 = r10
            r1 = r43
            r2 = r16
            java.lang.String r0 = r0.readClass(r1, r2)
            r45 = r0
            r0 = r10
            r1 = r44
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r46 = r0
            r0 = r10
            r1 = r44
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r47 = r0
            r0 = r42
            r1 = 182(0xb6, float:2.55E-43)
            if (r0 >= r1) goto Lfdc
            r0 = r11
            r1 = r42
            r2 = r45
            r3 = r46
            r4 = r47
            r0.visitFieldInsn(r1, r2, r3, r4)
            goto Lffd
        Lfdc:
            r0 = r15
            r1 = r43
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 11
            if (r0 != r1) goto Lfec
            r0 = 1
            goto Lfed
        Lfec:
            r0 = 0
        Lfed:
            r48 = r0
            r0 = r11
            r1 = r42
            r2 = r45
            r3 = r46
            r4 = r47
            r5 = r48
            r0.visitMethodInsn(r1, r2, r3, r4, r5)
        Lffd:
            r0 = r42
            r1 = 185(0xb9, float:2.59E-43)
            if (r0 != r1) goto L100b
            int r14 = r14 + 5
            goto L1103
        L100b:
            int r14 = r14 + 3
            goto L1103
        L1011:
            r0 = r10
            int[] r0 = r0.cpInfoOffsets
            r1 = r10
            r2 = r14
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r43 = r0
            r0 = r10
            int[] r0 = r0.cpInfoOffsets
            r1 = r10
            r2 = r43
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r44 = r0
            r0 = r10
            r1 = r44
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r45 = r0
            r0 = r10
            r1 = r44
            r2 = 2
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r46 = r0
            r0 = r10
            int[] r0 = r0.bootstrapMethodOffsets
            r1 = r10
            r2 = r43
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r47 = r0
            r0 = r10
            r1 = r10
            r2 = r47
            int r1 = r1.readUnsignedShort(r2)
            r2 = r16
            java.lang.Object r0 = r0.readConst(r1, r2)
            org.objectweb.asm.Handle r0 = (org.objectweb.asm.Handle) r0
            r48 = r0
            r0 = r10
            r1 = r47
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r49 = r0
            int r47 = r47 + 4
            r0 = 0
            r50 = r0
        L1076:
            r0 = r50
            r1 = r49
            int r1 = r1.length
            if (r0 >= r1) goto L1098
            r0 = r49
            r1 = r50
            r2 = r10
            r3 = r10
            r4 = r47
            int r3 = r3.readUnsignedShort(r4)
            r4 = r16
            java.lang.Object r2 = r2.readConst(r3, r4)
            r0[r1] = r2
            int r47 = r47 + 2
            int r50 = r50 + 1
            goto L1076
        L1098:
            r0 = r11
            r1 = r45
            r2 = r46
            r3 = r48
            r4 = r49
            r0.visitInvokeDynamicInsn(r1, r2, r3, r4)
            int r14 = r14 + 5
            goto L1103
        L10aa:
            r0 = r11
            r1 = r42
            r2 = r10
            r3 = r14
            r4 = 1
            int r3 = r3 + r4
            r4 = r16
            java.lang.String r2 = r2.readClass(r3, r4)
            r0.visitTypeInsn(r1, r2)
            int r14 = r14 + 3
            goto L1103
        L10c0:
            r0 = r11
            r1 = r15
            r2 = r14
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = r15
            r3 = r14
            r4 = 2
            int r3 = r3 + r4
            r2 = r2[r3]
            r0.visitIincInsn(r1, r2)
            int r14 = r14 + 3
            goto L1103
        L10dc:
            r0 = r11
            r1 = r10
            r2 = r14
            r3 = 1
            int r2 = r2 + r3
            r3 = r16
            java.lang.String r1 = r1.readClass(r2, r3)
            r2 = r15
            r3 = r14
            r4 = 3
            int r3 = r3 + r4
            r2 = r2[r3]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r0.visitMultiANewArrayInsn(r1, r2)
            int r14 = r14 + 4
            goto L1103
        L10fb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r1.<init>()
            throw r0
        L1103:
            r0 = r29
            if (r0 == 0) goto L1160
            r0 = r34
            r1 = r29
            int r1 = r1.length
            if (r0 >= r1) goto L1160
            r0 = r35
            r1 = r40
            if (r0 > r1) goto L1160
            r0 = r35
            r1 = r40
            if (r0 != r1) goto L1150
            r0 = r10
            r1 = r12
            r2 = r29
            r3 = r34
            r2 = r2[r3]
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r43 = r0
            r0 = r10
            r1 = r43
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r44 = r0
            int r43 = r43 + 2
            r0 = r10
            r1 = r11
            r2 = r12
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r12
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r44
            r5 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitInsnAnnotation(r2, r3, r4, r5)
            r2 = r43
            r3 = 1
            r4 = r16
            int r0 = r0.readElementValues(r1, r2, r3, r4)
        L1150:
            r0 = r10
            r1 = r29
            int r34 = r34 + 1
            r2 = r34
            int r0 = r0.getTypeAnnotationBytecodeOffset(r1, r2)
            r35 = r0
            goto L1103
        L1160:
            r0 = r30
            if (r0 == 0) goto L11bd
            r0 = r36
            r1 = r30
            int r1 = r1.length
            if (r0 >= r1) goto L11bd
            r0 = r37
            r1 = r40
            if (r0 > r1) goto L11bd
            r0 = r37
            r1 = r40
            if (r0 != r1) goto L11ad
            r0 = r10
            r1 = r12
            r2 = r30
            r3 = r36
            r2 = r2[r3]
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r43 = r0
            r0 = r10
            r1 = r43
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r44 = r0
            int r43 = r43 + 2
            r0 = r10
            r1 = r11
            r2 = r12
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r12
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r44
            r5 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitInsnAnnotation(r2, r3, r4, r5)
            r2 = r43
            r3 = 1
            r4 = r16
            int r0 = r0.readElementValues(r1, r2, r3, r4)
        L11ad:
            r0 = r10
            r1 = r30
            int r36 = r36 + 1
            r2 = r36
            int r0 = r0.getTypeAnnotationBytecodeOffset(r1, r2)
            r37 = r0
            goto L1160
        L11bd:
            goto L88a
        L11c0:
            r0 = r22
            r1 = r19
            r0 = r0[r1]
            if (r0 == 0) goto L11d1
            r0 = r11
            r1 = r22
            r2 = r19
            r1 = r1[r2]
            r0.visitLabel(r1)
        L11d1:
            r0 = r27
            if (r0 == 0) goto L12e1
            r0 = r12
            int r0 = r0.parsingOptions
            r1 = 2
            r0 = r0 & r1
            if (r0 != 0) goto L12e1
            r0 = 0
            r40 = r0
            r0 = r28
            if (r0 == 0) goto L1235
            r0 = r10
            r1 = r28
            int r0 = r0.readUnsignedShort(r1)
            r1 = 3
            int r0 = r0 * r1
            int[] r0 = new int[r0]
            r40 = r0
            r0 = r28
            r1 = 2
            int r0 = r0 + r1
            r14 = r0
            r0 = r40
            int r0 = r0.length
            r41 = r0
        L11fe:
            r0 = r41
            if (r0 <= 0) goto L1235
            r0 = r40
            int r41 = r41 + (-1)
            r1 = r41
            r2 = r14
            r3 = 6
            int r2 = r2 + r3
            r0[r1] = r2
            r0 = r40
            int r41 = r41 + (-1)
            r1 = r41
            r2 = r10
            r3 = r14
            r4 = 8
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r0[r1] = r2
            r0 = r40
            int r41 = r41 + (-1)
            r1 = r41
            r2 = r10
            r3 = r14
            int r2 = r2.readUnsignedShort(r3)
            r0[r1] = r2
            int r14 = r14 + 10
            goto L11fe
        L1235:
            r0 = r10
            r1 = r27
            int r0 = r0.readUnsignedShort(r1)
            r41 = r0
            r0 = r27
            r1 = 2
            int r0 = r0 + r1
            r14 = r0
        L1243:
            r0 = r41
            int r41 = r41 + (-1)
            if (r0 <= 0) goto L12e1
            r0 = r10
            r1 = r14
            int r0 = r0.readUnsignedShort(r1)
            r42 = r0
            r0 = r10
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r43 = r0
            r0 = r10
            r1 = r14
            r2 = 4
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r44 = r0
            r0 = r10
            r1 = r14
            r2 = 6
            int r1 = r1 + r2
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r45 = r0
            r0 = r10
            r1 = r14
            r2 = 8
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r46 = r0
            int r14 = r14 + 10
            r0 = 0
            r47 = r0
            r0 = r40
            if (r0 == 0) goto L12c5
            r0 = 0
            r48 = r0
        L128f:
            r0 = r48
            r1 = r40
            int r1 = r1.length
            if (r0 >= r1) goto L12c5
            r0 = r40
            r1 = r48
            r0 = r0[r1]
            r1 = r42
            if (r0 != r1) goto L12bf
            r0 = r40
            r1 = r48
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            r1 = r46
            if (r0 != r1) goto L12bf
            r0 = r10
            r1 = r40
            r2 = r48
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r47 = r0
            goto L12c5
        L12bf:
            int r48 = r48 + 3
            goto L128f
        L12c5:
            r0 = r11
            r1 = r44
            r2 = r45
            r3 = r47
            r4 = r22
            r5 = r42
            r4 = r4[r5]
            r5 = r22
            r6 = r42
            r7 = r43
            int r6 = r6 + r7
            r5 = r5[r6]
            r6 = r46
            r0.visitLocalVariable(r1, r2, r3, r4, r5, r6)
            goto L1243
        L12e1:
            r0 = r29
            if (r0 == 0) goto L1357
            r0 = r29
            r40 = r0
            r0 = r40
            int r0 = r0.length
            r41 = r0
            r0 = 0
            r42 = r0
        L12f2:
            r0 = r42
            r1 = r41
            if (r0 >= r1) goto L1357
            r0 = r40
            r1 = r42
            r0 = r0[r1]
            r43 = r0
            r0 = r10
            r1 = r43
            int r0 = r0.readByte(r1)
            r44 = r0
            r0 = r44
            r1 = 64
            if (r0 == r1) goto L1316
            r0 = r44
            r1 = 65
            if (r0 != r1) goto L1351
        L1316:
            r0 = r10
            r1 = r12
            r2 = r43
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r14 = r0
            r0 = r10
            r1 = r14
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r45 = r0
            int r14 = r14 + 2
            r0 = r10
            r1 = r11
            r2 = r12
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r12
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r12
            org.objectweb.asm.Label[] r4 = r4.currentLocalVariableAnnotationRangeStarts
            r5 = r12
            org.objectweb.asm.Label[] r5 = r5.currentLocalVariableAnnotationRangeEnds
            r6 = r12
            int[] r6 = r6.currentLocalVariableAnnotationRangeIndices
            r7 = r45
            r8 = 1
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitLocalVariableAnnotation(r2, r3, r4, r5, r6, r7, r8)
            r2 = r14
            r3 = 1
            r4 = r16
            int r0 = r0.readElementValues(r1, r2, r3, r4)
        L1351:
            int r42 = r42 + 1
            goto L12f2
        L1357:
            r0 = r30
            if (r0 == 0) goto L13cd
            r0 = r30
            r40 = r0
            r0 = r40
            int r0 = r0.length
            r41 = r0
            r0 = 0
            r42 = r0
        L1368:
            r0 = r42
            r1 = r41
            if (r0 >= r1) goto L13cd
            r0 = r40
            r1 = r42
            r0 = r0[r1]
            r43 = r0
            r0 = r10
            r1 = r43
            int r0 = r0.readByte(r1)
            r44 = r0
            r0 = r44
            r1 = 64
            if (r0 == r1) goto L138c
            r0 = r44
            r1 = 65
            if (r0 != r1) goto L13c7
        L138c:
            r0 = r10
            r1 = r12
            r2 = r43
            int r0 = r0.readTypeAnnotationTarget(r1, r2)
            r14 = r0
            r0 = r10
            r1 = r14
            r2 = r16
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r45 = r0
            int r14 = r14 + 2
            r0 = r10
            r1 = r11
            r2 = r12
            int r2 = r2.currentTypeAnnotationTarget
            r3 = r12
            org.objectweb.asm.TypePath r3 = r3.currentTypeAnnotationTargetPath
            r4 = r12
            org.objectweb.asm.Label[] r4 = r4.currentLocalVariableAnnotationRangeStarts
            r5 = r12
            org.objectweb.asm.Label[] r5 = r5.currentLocalVariableAnnotationRangeEnds
            r6 = r12
            int[] r6 = r6.currentLocalVariableAnnotationRangeIndices
            r7 = r45
            r8 = 0
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitLocalVariableAnnotation(r2, r3, r4, r5, r6, r7, r8)
            r2 = r14
            r3 = 1
            r4 = r16
            int r0 = r0.readElementValues(r1, r2, r3, r4)
        L13c7:
            int r42 = r42 + 1
            goto L1368
        L13cd:
            r0 = r31
            if (r0 == 0) goto L13ec
            r0 = r31
            org.objectweb.asm.Attribute r0 = r0.nextAttribute
            r40 = r0
            r0 = r31
            r1 = 0
            r0.nextAttribute = r1
            r0 = r11
            r1 = r31
            r0.visitAttribute(r1)
            r0 = r40
            r31 = r0
            goto L13cd
        L13ec:
            r0 = r11
            r1 = r17
            r2 = r18
            r0.visitMaxs(r1, r2)
            return
    }

    protected org.objectweb.asm.Label readLabel(int r6, org.objectweb.asm.Label[] r7) {
            r5 = this;
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            if (r0 != 0) goto L10
            r0 = r7
            r1 = r6
            org.objectweb.asm.Label r2 = new org.objectweb.asm.Label
            r3 = r2
            r3.<init>()
            r0[r1] = r2
        L10:
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            return r0
    }

    private org.objectweb.asm.Label createLabel(int r5, org.objectweb.asm.Label[] r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r7 = r0
            r0 = r7
            r1 = r0
            short r1 = r1.flags
            r2 = -2
            r1 = r1 & r2
            short r1 = (short) r1
            r0.flags = r1
            r0 = r7
            return r0
    }

    private void createDebugLabel(int r5, org.objectweb.asm.Label[] r6) {
            r4 = this;
            r0 = r6
            r1 = r5
            r0 = r0[r1]
            if (r0 != 0) goto L16
            r0 = r4
            r1 = r5
            r2 = r6
            org.objectweb.asm.Label r0 = r0.readLabel(r1, r2)
            r1 = r0
            short r1 = r1.flags
            r2 = 1
            r1 = r1 | r2
            short r1 = (short) r1
            r0.flags = r1
        L16:
            return
    }

    private int[] readTypeAnnotations(org.objectweb.asm.MethodVisitor r8, org.objectweb.asm.Context r9, int r10, boolean r11) {
            r7 = this;
            r0 = r9
            char[] r0 = r0.charBuffer
            r12 = r0
            r0 = r10
            r13 = r0
            r0 = r7
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            int[] r0 = new int[r0]
            r14 = r0
            int r13 = r13 + 2
            r0 = 0
            r15 = r0
        L19:
            r0 = r15
            r1 = r14
            int r1 = r1.length
            if (r0 >= r1) goto L24b
            r0 = r14
            r1 = r15
            r2 = r13
            r0[r1] = r2
            r0 = r7
            r1 = r13
            int r0 = r0.readInt(r1)
            r16 = r0
            r0 = r16
            r1 = 24
            int r0 = r0 >>> r1
            switch(r0) {
                case 0: goto L1c6;
                case 1: goto L1c6;
                case 2: goto L1c6;
                case 3: goto L1c6;
                case 4: goto L1c6;
                case 5: goto L1c6;
                case 6: goto L1c6;
                case 7: goto L1c6;
                case 8: goto L1c6;
                case 9: goto L1c6;
                case 10: goto L1c6;
                case 11: goto L1c6;
                case 12: goto L1c6;
                case 13: goto L1c6;
                case 14: goto L1c6;
                case 15: goto L1c6;
                case 16: goto L1c0;
                case 17: goto L1c0;
                case 18: goto L1c0;
                case 19: goto L1c6;
                case 20: goto L1c6;
                case 21: goto L1c6;
                case 22: goto L1c6;
                case 23: goto L1c0;
                case 24: goto L1c6;
                case 25: goto L1c6;
                case 26: goto L1c6;
                case 27: goto L1c6;
                case 28: goto L1c6;
                case 29: goto L1c6;
                case 30: goto L1c6;
                case 31: goto L1c6;
                case 32: goto L1c6;
                case 33: goto L1c6;
                case 34: goto L1c6;
                case 35: goto L1c6;
                case 36: goto L1c6;
                case 37: goto L1c6;
                case 38: goto L1c6;
                case 39: goto L1c6;
                case 40: goto L1c6;
                case 41: goto L1c6;
                case 42: goto L1c6;
                case 43: goto L1c6;
                case 44: goto L1c6;
                case 45: goto L1c6;
                case 46: goto L1c6;
                case 47: goto L1c6;
                case 48: goto L1c6;
                case 49: goto L1c6;
                case 50: goto L1c6;
                case 51: goto L1c6;
                case 52: goto L1c6;
                case 53: goto L1c6;
                case 54: goto L1c6;
                case 55: goto L1c6;
                case 56: goto L1c6;
                case 57: goto L1c6;
                case 58: goto L1c6;
                case 59: goto L1c6;
                case 60: goto L1c6;
                case 61: goto L1c6;
                case 62: goto L1c6;
                case 63: goto L1c6;
                case 64: goto L174;
                case 65: goto L174;
                case 66: goto L1c0;
                case 67: goto L1c0;
                case 68: goto L1c0;
                case 69: goto L1c0;
                case 70: goto L1c0;
                case 71: goto L1ba;
                case 72: goto L1ba;
                case 73: goto L1ba;
                case 74: goto L1ba;
                case 75: goto L1ba;
                default: goto L1c6;
            }
        L174:
            r0 = r7
            r1 = r13
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r17 = r0
            int r13 = r13 + 3
        L181:
            r0 = r17
            int r17 = r17 + (-1)
            if (r0 <= 0) goto L1ce
            r0 = r7
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r18 = r0
            r0 = r7
            r1 = r13
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r19 = r0
            int r13 = r13 + 6
            r0 = r7
            r1 = r18
            r2 = r9
            org.objectweb.asm.Label[] r2 = r2.currentMethodLabels
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r0 = r7
            r1 = r18
            r2 = r19
            int r1 = r1 + r2
            r2 = r9
            org.objectweb.asm.Label[] r2 = r2.currentMethodLabels
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            goto L181
        L1ba:
            int r13 = r13 + 4
            goto L1ce
        L1c0:
            int r13 = r13 + 3
            goto L1ce
        L1c6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1ce:
            r0 = r7
            r1 = r13
            int r0 = r0.readByte(r1)
            r17 = r0
            r0 = r16
            r1 = 24
            int r0 = r0 >>> r1
            r1 = 66
            if (r0 != r1) goto L22e
            r0 = r17
            if (r0 != 0) goto L1e9
            r0 = 0
            goto L1f6
        L1e9:
            org.objectweb.asm.TypePath r0 = new org.objectweb.asm.TypePath
            r1 = r0
            r2 = r7
            byte[] r2 = r2.classFileBuffer
            r3 = r13
            r1.<init>(r2, r3)
        L1f6:
            r18 = r0
            r0 = r13
            r1 = 1
            r2 = 2
            r3 = r17
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
            r0 = r7
            r1 = r13
            r2 = r12
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r19 = r0
            int r13 = r13 + 2
            r0 = r7
            r1 = r8
            r2 = r16
            r3 = -256(0xffffffffffffff00, float:NaN)
            r2 = r2 & r3
            r3 = r18
            r4 = r19
            r5 = r11
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitTryCatchAnnotation(r2, r3, r4, r5)
            r2 = r13
            r3 = 1
            r4 = r12
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r13 = r0
            goto L245
        L22e:
            r0 = r13
            r1 = 3
            r2 = 2
            r3 = r17
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r13 = r0
            r0 = r7
            r1 = 0
            r2 = r13
            r3 = 1
            r4 = r12
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r13 = r0
        L245:
            int r15 = r15 + 1
            goto L19
        L24b:
            r0 = r14
            return r0
    }

    private int getTypeAnnotationBytecodeOffset(int[] r5, int r6) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L16
            r0 = r6
            r1 = r5
            int r1 = r1.length
            if (r0 >= r1) goto L16
            r0 = r4
            r1 = r5
            r2 = r6
            r1 = r1[r2]
            int r0 = r0.readByte(r1)
            r1 = 67
            if (r0 >= r1) goto L18
        L16:
            r0 = -1
            return r0
        L18:
            r0 = r4
            r1 = r5
            r2 = r6
            r1 = r1[r2]
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            return r0
    }

    private int readTypeAnnotationTarget(org.objectweb.asm.Context r7, int r8) {
            r6 = this;
            r0 = r8
            r9 = r0
            r0 = r6
            r1 = r8
            int r0 = r0.readInt(r1)
            r10 = r0
            r0 = r10
            r1 = 24
            int r0 = r0 >>> r1
            switch(r0) {
                case 0: goto L14c;
                case 1: goto L14c;
                case 2: goto L21d;
                case 3: goto L21d;
                case 4: goto L21d;
                case 5: goto L21d;
                case 6: goto L21d;
                case 7: goto L21d;
                case 8: goto L21d;
                case 9: goto L21d;
                case 10: goto L21d;
                case 11: goto L21d;
                case 12: goto L21d;
                case 13: goto L21d;
                case 14: goto L21d;
                case 15: goto L21d;
                case 16: goto L201;
                case 17: goto L201;
                case 18: goto L201;
                case 19: goto L15a;
                case 20: goto L15a;
                case 21: goto L15a;
                case 22: goto L14c;
                case 23: goto L201;
                case 24: goto L21d;
                case 25: goto L21d;
                case 26: goto L21d;
                case 27: goto L21d;
                case 28: goto L21d;
                case 29: goto L21d;
                case 30: goto L21d;
                case 31: goto L21d;
                case 32: goto L21d;
                case 33: goto L21d;
                case 34: goto L21d;
                case 35: goto L21d;
                case 36: goto L21d;
                case 37: goto L21d;
                case 38: goto L21d;
                case 39: goto L21d;
                case 40: goto L21d;
                case 41: goto L21d;
                case 42: goto L21d;
                case 43: goto L21d;
                case 44: goto L21d;
                case 45: goto L21d;
                case 46: goto L21d;
                case 47: goto L21d;
                case 48: goto L21d;
                case 49: goto L21d;
                case 50: goto L21d;
                case 51: goto L21d;
                case 52: goto L21d;
                case 53: goto L21d;
                case 54: goto L21d;
                case 55: goto L21d;
                case 56: goto L21d;
                case 57: goto L21d;
                case 58: goto L21d;
                case 59: goto L21d;
                case 60: goto L21d;
                case 61: goto L21d;
                case 62: goto L21d;
                case 63: goto L21d;
                case 64: goto L168;
                case 65: goto L168;
                case 66: goto L201;
                case 67: goto L20f;
                case 68: goto L20f;
                case 69: goto L20f;
                case 70: goto L20f;
                case 71: goto L1f3;
                case 72: goto L1f3;
                case 73: goto L1f3;
                case 74: goto L1f3;
                case 75: goto L1f3;
                default: goto L21d;
            }
        L14c:
            r0 = r10
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            r10 = r0
            int r9 = r9 + 2
            goto L225
        L15a:
            r0 = r10
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r10 = r0
            int r9 = r9 + 1
            goto L225
        L168:
            r0 = r10
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r10 = r0
            r0 = r6
            r1 = r9
            r2 = 1
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r11 = r0
            int r9 = r9 + 3
            r0 = r7
            r1 = r11
            org.objectweb.asm.Label[] r1 = new org.objectweb.asm.Label[r1]
            r0.currentLocalVariableAnnotationRangeStarts = r1
            r0 = r7
            r1 = r11
            org.objectweb.asm.Label[] r1 = new org.objectweb.asm.Label[r1]
            r0.currentLocalVariableAnnotationRangeEnds = r1
            r0 = r7
            r1 = r11
            int[] r1 = new int[r1]
            r0.currentLocalVariableAnnotationRangeIndices = r1
            r0 = 0
            r12 = r0
        L199:
            r0 = r12
            r1 = r11
            if (r0 >= r1) goto L1f0
            r0 = r6
            r1 = r9
            int r0 = r0.readUnsignedShort(r1)
            r13 = r0
            r0 = r6
            r1 = r9
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r14 = r0
            r0 = r6
            r1 = r9
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r15 = r0
            int r9 = r9 + 6
            r0 = r7
            org.objectweb.asm.Label[] r0 = r0.currentLocalVariableAnnotationRangeStarts
            r1 = r12
            r2 = r6
            r3 = r13
            r4 = r7
            org.objectweb.asm.Label[] r4 = r4.currentMethodLabels
            org.objectweb.asm.Label r2 = r2.createLabel(r3, r4)
            r0[r1] = r2
            r0 = r7
            org.objectweb.asm.Label[] r0 = r0.currentLocalVariableAnnotationRangeEnds
            r1 = r12
            r2 = r6
            r3 = r13
            r4 = r14
            int r3 = r3 + r4
            r4 = r7
            org.objectweb.asm.Label[] r4 = r4.currentMethodLabels
            org.objectweb.asm.Label r2 = r2.createLabel(r3, r4)
            r0[r1] = r2
            r0 = r7
            int[] r0 = r0.currentLocalVariableAnnotationRangeIndices
            r1 = r12
            r2 = r15
            r0[r1] = r2
            int r12 = r12 + 1
            goto L199
        L1f0:
            goto L225
        L1f3:
            r0 = r10
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            r10 = r0
            int r9 = r9 + 4
            goto L225
        L201:
            r0 = r10
            r1 = -256(0xffffffffffffff00, float:NaN)
            r0 = r0 & r1
            r10 = r0
            int r9 = r9 + 3
            goto L225
        L20f:
            r0 = r10
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r1
            r10 = r0
            int r9 = r9 + 3
            goto L225
        L21d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L225:
            r0 = r7
            r1 = r10
            r0.currentTypeAnnotationTarget = r1
            r0 = r6
            r1 = r9
            int r0 = r0.readByte(r1)
            r11 = r0
            r0 = r7
            r1 = r11
            if (r1 != 0) goto L23c
            r1 = 0
            goto L248
        L23c:
            org.objectweb.asm.TypePath r1 = new org.objectweb.asm.TypePath
            r2 = r1
            r3 = r6
            byte[] r3 = r3.classFileBuffer
            r4 = r9
            r2.<init>(r3, r4)
        L248:
            r0.currentTypeAnnotationTargetPath = r1
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            r2 = r11
            int r1 = r1 * r2
            int r0 = r0 + r1
            return r0
    }

    private void readParameterAnnotations(org.objectweb.asm.MethodVisitor r7, org.objectweb.asm.Context r8, int r9, boolean r10) {
            r6 = this;
            r0 = r9
            r11 = r0
            r0 = r6
            byte[] r0 = r0.classFileBuffer
            r1 = r11
            int r11 = r11 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r12 = r0
            r0 = r7
            r1 = r12
            r2 = r10
            r0.visitAnnotableParameterCount(r1, r2)
            r0 = r8
            char[] r0 = r0.charBuffer
            r13 = r0
            r0 = 0
            r14 = r0
        L24:
            r0 = r14
            r1 = r12
            if (r0 >= r1) goto L69
            r0 = r6
            r1 = r11
            int r0 = r0.readUnsignedShort(r1)
            r15 = r0
            int r11 = r11 + 2
        L36:
            r0 = r15
            int r15 = r15 + (-1)
            if (r0 <= 0) goto L63
            r0 = r6
            r1 = r11
            r2 = r13
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r16 = r0
            int r11 = r11 + 2
            r0 = r6
            r1 = r7
            r2 = r14
            r3 = r16
            r4 = r10
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitParameterAnnotation(r2, r3, r4)
            r2 = r11
            r3 = 1
            r4 = r13
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r11 = r0
            goto L36
        L63:
            int r14 = r14 + 1
            goto L24
        L69:
            return
    }

    private int readElementValues(org.objectweb.asm.AnnotationVisitor r7, int r8, boolean r9, char[] r10) {
            r6 = this;
            r0 = r8
            r11 = r0
            r0 = r6
            r1 = r11
            int r0 = r0.readUnsignedShort(r1)
            r12 = r0
            int r11 = r11 + 2
            r0 = r9
            if (r0 == 0) goto L36
        L12:
            r0 = r12
            int r12 = r12 + (-1)
            if (r0 <= 0) goto L4d
            r0 = r6
            r1 = r11
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r13 = r0
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = 2
            int r2 = r2 + r3
            r3 = r13
            r4 = r10
            int r0 = r0.readElementValue(r1, r2, r3, r4)
            r11 = r0
            goto L12
        L36:
            r0 = r12
            int r12 = r12 + (-1)
            if (r0 <= 0) goto L4d
            r0 = r6
            r1 = r7
            r2 = r11
            r3 = 0
            r4 = r10
            int r0 = r0.readElementValue(r1, r2, r3, r4)
            r11 = r0
            goto L36
        L4d:
            r0 = r7
            if (r0 == 0) goto L55
            r0 = r7
            r0.visitEnd()
        L55:
            r0 = r11
            return r0
    }

    private int readElementValue(org.objectweb.asm.AnnotationVisitor r9, int r10, java.lang.String r11, char[] r12) {
            r8 = this;
            r0 = r10
            r13 = r0
            r0 = r9
            if (r0 != 0) goto L58
            r0 = r8
            byte[] r0 = r0.classFileBuffer
            r1 = r13
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 64: goto L39;
                case 91: goto L46;
                case 101: goto L34;
                default: goto L53;
            }
        L34:
            r0 = r13
            r1 = 5
            int r0 = r0 + r1
            return r0
        L39:
            r0 = r8
            r1 = 0
            r2 = r13
            r3 = 3
            int r2 = r2 + r3
            r3 = 1
            r4 = r12
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            return r0
        L46:
            r0 = r8
            r1 = 0
            r2 = r13
            r3 = 1
            int r2 = r2 + r3
            r3 = 0
            r4 = r12
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            return r0
        L53:
            r0 = r13
            r1 = 3
            int r0 = r0 + r1
            return r0
        L58:
            r0 = r8
            byte[] r0 = r0.classFileBuffer
            r1 = r13
            int r13 = r13 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 64: goto L221;
                case 65: goto L4ca;
                case 66: goto L144;
                case 67: goto L162;
                case 68: goto L180;
                case 69: goto L4ca;
                case 70: goto L180;
                case 71: goto L4ca;
                case 72: goto L4ca;
                case 73: goto L180;
                case 74: goto L180;
                case 75: goto L4ca;
                case 76: goto L4ca;
                case 77: goto L4ca;
                case 78: goto L4ca;
                case 79: goto L4ca;
                case 80: goto L4ca;
                case 81: goto L4ca;
                case 82: goto L4ca;
                case 83: goto L197;
                case 84: goto L4ca;
                case 85: goto L4ca;
                case 86: goto L4ca;
                case 87: goto L4ca;
                case 88: goto L4ca;
                case 89: goto L4ca;
                case 90: goto L1b5;
                case 91: goto L23e;
                case 92: goto L4ca;
                case 93: goto L4ca;
                case 94: goto L4ca;
                case 95: goto L4ca;
                case 96: goto L4ca;
                case 97: goto L4ca;
                case 98: goto L4ca;
                case 99: goto L20b;
                case 100: goto L4ca;
                case 101: goto L1ee;
                case 102: goto L4ca;
                case 103: goto L4ca;
                case 104: goto L4ca;
                case 105: goto L4ca;
                case 106: goto L4ca;
                case 107: goto L4ca;
                case 108: goto L4ca;
                case 109: goto L4ca;
                case 110: goto L4ca;
                case 111: goto L4ca;
                case 112: goto L4ca;
                case 113: goto L4ca;
                case 114: goto L4ca;
                case 115: goto L1db;
                default: goto L4ca;
            }
        L144:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r0.visit(r1, r2)
            int r13 = r13 + 2
            goto L4d2
        L162:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            char r2 = (char) r2
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r0.visit(r1, r2)
            int r13 = r13 + 2
            goto L4d2
        L180:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r8
            r4 = r13
            int r3 = r3.readUnsignedShort(r4)
            r4 = r12
            java.lang.Object r2 = r2.readConst(r3, r4)
            r0.visit(r1, r2)
            int r13 = r13 + 2
            goto L4d2
        L197:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            short r2 = (short) r2
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            r0.visit(r1, r2)
            int r13 = r13 + 2
            goto L4d2
        L1b5:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            if (r2 != 0) goto L1cf
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            goto L1d2
        L1cf:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
        L1d2:
            r0.visit(r1, r2)
            int r13 = r13 + 2
            goto L4d2
        L1db:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r13
            r4 = r12
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r0.visit(r1, r2)
            int r13 = r13 + 2
            goto L4d2
        L1ee:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r13
            r4 = r12
            java.lang.String r2 = r2.readUTF8(r3, r4)
            r3 = r8
            r4 = r13
            r5 = 2
            int r4 = r4 + r5
            r5 = r12
            java.lang.String r3 = r3.readUTF8(r4, r5)
            r0.visitEnum(r1, r2, r3)
            int r13 = r13 + 4
            goto L4d2
        L20b:
            r0 = r9
            r1 = r11
            r2 = r8
            r3 = r13
            r4 = r12
            java.lang.String r2 = r2.readUTF8(r3, r4)
            org.objectweb.asm.Type r2 = org.objectweb.asm.Type.getType(r2)
            r0.visit(r1, r2)
            int r13 = r13 + 2
            goto L4d2
        L221:
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r8
            r4 = r13
            r5 = r12
            java.lang.String r3 = r3.readUTF8(r4, r5)
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitAnnotation(r2, r3)
            r2 = r13
            r3 = 2
            int r2 = r2 + r3
            r3 = 1
            r4 = r12
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r13 = r0
            goto L4d2
        L23e:
            r0 = r8
            r1 = r13
            int r0 = r0.readUnsignedShort(r1)
            r14 = r0
            int r13 = r13 + 2
            r0 = r14
            if (r0 != 0) goto L25f
            r0 = r8
            r1 = r9
            r2 = r11
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitArray(r2)
            r2 = r13
            r3 = 2
            int r2 = r2 - r3
            r3 = 0
            r4 = r12
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            return r0
        L25f:
            r0 = r8
            byte[] r0 = r0.classFileBuffer
            r1 = r13
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            switch(r0) {
                case 66: goto L2dc;
                case 67: goto L391;
                case 68: goto L479;
                case 69: goto L4b5;
                case 70: goto L43d;
                case 71: goto L4b5;
                case 72: goto L4b5;
                case 73: goto L3cb;
                case 74: goto L404;
                case 75: goto L4b5;
                case 76: goto L4b5;
                case 77: goto L4b5;
                case 78: goto L4b5;
                case 79: goto L4b5;
                case 80: goto L4b5;
                case 81: goto L4b5;
                case 82: goto L4b5;
                case 83: goto L357;
                case 84: goto L4b5;
                case 85: goto L4b5;
                case 86: goto L4b5;
                case 87: goto L4b5;
                case 88: goto L4b5;
                case 89: goto L4b5;
                case 90: goto L316;
                default: goto L4b5;
            }
        L2dc:
            r0 = r14
            byte[] r0 = new byte[r0]
            r15 = r0
            r0 = 0
            r16 = r0
        L2e5:
            r0 = r16
            r1 = r14
            if (r0 >= r1) goto L30c
            r0 = r15
            r1 = r16
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            byte r2 = (byte) r2
            r0[r1] = r2
            int r13 = r13 + 3
            int r16 = r16 + 1
            goto L2e5
        L30c:
            r0 = r9
            r1 = r11
            r2 = r15
            r0.visit(r1, r2)
            goto L4d2
        L316:
            r0 = r14
            boolean[] r0 = new boolean[r0]
            r16 = r0
            r0 = 0
            r17 = r0
        L31f:
            r0 = r17
            r1 = r14
            if (r0 >= r1) goto L34d
            r0 = r16
            r1 = r17
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            if (r2 == 0) goto L342
            r2 = 1
            goto L343
        L342:
            r2 = 0
        L343:
            r0[r1] = r2
            int r13 = r13 + 3
            int r17 = r17 + 1
            goto L31f
        L34d:
            r0 = r9
            r1 = r11
            r2 = r16
            r0.visit(r1, r2)
            goto L4d2
        L357:
            r0 = r14
            short[] r0 = new short[r0]
            r17 = r0
            r0 = 0
            r18 = r0
        L360:
            r0 = r18
            r1 = r14
            if (r0 >= r1) goto L387
            r0 = r17
            r1 = r18
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            short r2 = (short) r2
            r0[r1] = r2
            int r13 = r13 + 3
            int r18 = r18 + 1
            goto L360
        L387:
            r0 = r9
            r1 = r11
            r2 = r17
            r0.visit(r1, r2)
            goto L4d2
        L391:
            r0 = r14
            char[] r0 = new char[r0]
            r18 = r0
            r0 = 0
            r19 = r0
        L39a:
            r0 = r19
            r1 = r14
            if (r0 >= r1) goto L3c1
            r0 = r18
            r1 = r19
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            char r2 = (char) r2
            r0[r1] = r2
            int r13 = r13 + 3
            int r19 = r19 + 1
            goto L39a
        L3c1:
            r0 = r9
            r1 = r11
            r2 = r18
            r0.visit(r1, r2)
            goto L4d2
        L3cb:
            r0 = r14
            int[] r0 = new int[r0]
            r19 = r0
            r0 = 0
            r20 = r0
        L3d4:
            r0 = r20
            r1 = r14
            if (r0 >= r1) goto L3fa
            r0 = r19
            r1 = r20
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            r0[r1] = r2
            int r13 = r13 + 3
            int r20 = r20 + 1
            goto L3d4
        L3fa:
            r0 = r9
            r1 = r11
            r2 = r19
            r0.visit(r1, r2)
            goto L4d2
        L404:
            r0 = r14
            long[] r0 = new long[r0]
            r20 = r0
            r0 = 0
            r21 = r0
        L40d:
            r0 = r21
            r1 = r14
            if (r0 >= r1) goto L433
            r0 = r20
            r1 = r21
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            long r2 = r2.readLong(r3)
            r0[r1] = r2
            int r13 = r13 + 3
            int r21 = r21 + 1
            goto L40d
        L433:
            r0 = r9
            r1 = r11
            r2 = r20
            r0.visit(r1, r2)
            goto L4d2
        L43d:
            r0 = r14
            float[] r0 = new float[r0]
            r21 = r0
            r0 = 0
            r22 = r0
        L446:
            r0 = r22
            r1 = r14
            if (r0 >= r1) goto L46f
            r0 = r21
            r1 = r22
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            int r2 = r2.readInt(r3)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            r0[r1] = r2
            int r13 = r13 + 3
            int r22 = r22 + 1
            goto L446
        L46f:
            r0 = r9
            r1 = r11
            r2 = r21
            r0.visit(r1, r2)
            goto L4d2
        L479:
            r0 = r14
            double[] r0 = new double[r0]
            r22 = r0
            r0 = 0
            r23 = r0
        L482:
            r0 = r23
            r1 = r14
            if (r0 >= r1) goto L4ab
            r0 = r22
            r1 = r23
            r2 = r8
            r3 = r8
            int[] r3 = r3.cpInfoOffsets
            r4 = r8
            r5 = r13
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.readUnsignedShort(r5)
            r3 = r3[r4]
            long r2 = r2.readLong(r3)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            r0[r1] = r2
            int r13 = r13 + 3
            int r23 = r23 + 1
            goto L482
        L4ab:
            r0 = r9
            r1 = r11
            r2 = r22
            r0.visit(r1, r2)
            goto L4d2
        L4b5:
            r0 = r8
            r1 = r9
            r2 = r11
            org.objectweb.asm.AnnotationVisitor r1 = r1.visitArray(r2)
            r2 = r13
            r3 = 2
            int r2 = r2 - r3
            r3 = 0
            r4 = r12
            int r0 = r0.readElementValues(r1, r2, r3, r4)
            r13 = r0
            goto L4d2
        L4ca:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L4d2:
            r0 = r13
            return r0
    }

    private void computeImplicitFrame(org.objectweb.asm.Context r7) {
            r6 = this;
            r0 = r7
            java.lang.String r0 = r0.currentMethodDescriptor
            r8 = r0
            r0 = r7
            java.lang.Object[] r0 = r0.currentFrameLocalTypes
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r7
            int r0 = r0.currentMethodAccessFlags
            r1 = 8
            r0 = r0 & r1
            if (r0 != 0) goto L46
            java.lang.String r0 = "<init>"
            r1 = r7
            java.lang.String r1 = r1.currentMethodName
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L31
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS
            r0[r1] = r2
            goto L46
        L31:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r6
            r3 = r6
            int r3 = r3.header
            r4 = 2
            int r3 = r3 + r4
            r4 = r7
            char[] r4 = r4.charBuffer
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
        L46:
            r0 = 1
            r11 = r0
        L49:
            r0 = r11
            r12 = r0
            r0 = r8
            r1 = r11
            int r11 = r11 + 1
            char r0 = r0.charAt(r1)
            switch(r0) {
                case 66: goto Lcc;
                case 67: goto Lcc;
                case 68: goto Lf3;
                case 69: goto L16d;
                case 70: goto Ld9;
                case 71: goto L16d;
                case 72: goto L16d;
                case 73: goto Lcc;
                case 74: goto Le6;
                case 75: goto L16d;
                case 76: goto L145;
                case 77: goto L16d;
                case 78: goto L16d;
                case 79: goto L16d;
                case 80: goto L16d;
                case 81: goto L16d;
                case 82: goto L16d;
                case 83: goto Lcc;
                case 84: goto L16d;
                case 85: goto L16d;
                case 86: goto L16d;
                case 87: goto L16d;
                case 88: goto L16d;
                case 89: goto L16d;
                case 90: goto Lcc;
                case 91: goto L100;
                default: goto L16d;
            }
        Lcc:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.INTEGER
            r0[r1] = r2
            goto L174
        Ld9:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.FLOAT
            r0[r1] = r2
            goto L174
        Le6:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.LONG
            r0[r1] = r2
            goto L174
        Lf3:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.DOUBLE
            r0[r1] = r2
            goto L174
        L100:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 91
            if (r0 != r1) goto L111
            int r11 = r11 + 1
            goto L100
        L111:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 76
            if (r0 != r1) goto L130
            int r11 = r11 + 1
        L11f:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 == r1) goto L130
            int r11 = r11 + 1
            goto L11f
        L130:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r8
            r3 = r12
            int r11 = r11 + 1
            r4 = r11
            java.lang.String r2 = r2.substring(r3, r4)
            r0[r1] = r2
            goto L174
        L145:
            r0 = r8
            r1 = r11
            char r0 = r0.charAt(r1)
            r1 = 59
            if (r0 == r1) goto L156
            int r11 = r11 + 1
            goto L145
        L156:
            r0 = r9
            r1 = r10
            int r10 = r10 + 1
            r2 = r8
            r3 = r12
            r4 = 1
            int r3 = r3 + r4
            r4 = r11
            int r11 = r11 + 1
            java.lang.String r2 = r2.substring(r3, r4)
            r0[r1] = r2
            goto L174
        L16d:
            r0 = r7
            r1 = r10
            r0.currentFrameLocalCount = r1
            return
        L174:
            goto L49
    }

    private int readStackMapFrame(int r8, boolean r9, boolean r10, org.objectweb.asm.Context r11) {
            r7 = this;
            r0 = r8
            r12 = r0
            r0 = r11
            char[] r0 = r0.charBuffer
            r13 = r0
            r0 = r11
            org.objectweb.asm.Label[] r0 = r0.currentMethodLabels
            r14 = r0
            r0 = r9
            if (r0 == 0) goto L28
            r0 = r7
            byte[] r0 = r0.classFileBuffer
            r1 = r12
            int r12 = r12 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r15 = r0
            goto L33
        L28:
            r0 = 255(0xff, float:3.57E-43)
            r15 = r0
            r0 = r11
            r1 = -1
            r0.currentFrameOffset = r1
        L33:
            r0 = r11
            r1 = 0
            r0.currentFrameLocalCountDelta = r1
            r0 = r15
            r1 = 64
            if (r0 >= r1) goto L53
            r0 = r15
            r16 = r0
            r0 = r11
            r1 = 3
            r0.currentFrameType = r1
            r0 = r11
            r1 = 0
            r0.currentFrameStackCount = r1
            goto L1fa
        L53:
            r0 = r15
            r1 = 128(0x80, float:1.794E-43)
            if (r0 >= r1) goto L83
            r0 = r15
            r1 = 64
            int r0 = r0 - r1
            r16 = r0
            r0 = r7
            r1 = r12
            r2 = r11
            java.lang.Object[] r2 = r2.currentFrameStackTypes
            r3 = 0
            r4 = r13
            r5 = r14
            int r0 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            r12 = r0
            r0 = r11
            r1 = 4
            r0.currentFrameType = r1
            r0 = r11
            r1 = 1
            r0.currentFrameStackCount = r1
            goto L1fa
        L83:
            r0 = r15
            r1 = 247(0xf7, float:3.46E-43)
            if (r0 < r1) goto L1f2
            r0 = r7
            r1 = r12
            int r0 = r0.readUnsignedShort(r1)
            r16 = r0
            int r12 = r12 + 2
            r0 = r15
            r1 = 247(0xf7, float:3.46E-43)
            if (r0 != r1) goto Lbf
            r0 = r7
            r1 = r12
            r2 = r11
            java.lang.Object[] r2 = r2.currentFrameStackTypes
            r3 = 0
            r4 = r13
            r5 = r14
            int r0 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            r12 = r0
            r0 = r11
            r1 = 4
            r0.currentFrameType = r1
            r0 = r11
            r1 = 1
            r0.currentFrameStackCount = r1
            goto L1fa
        Lbf:
            r0 = r15
            r1 = 248(0xf8, float:3.48E-43)
            if (r0 < r1) goto Lf8
            r0 = r15
            r1 = 251(0xfb, float:3.52E-43)
            if (r0 >= r1) goto Lf8
            r0 = r11
            r1 = 2
            r0.currentFrameType = r1
            r0 = r11
            r1 = 251(0xfb, float:3.52E-43)
            r2 = r15
            int r1 = r1 - r2
            r0.currentFrameLocalCountDelta = r1
            r0 = r11
            r1 = r0
            int r1 = r1.currentFrameLocalCount
            r2 = r11
            int r2 = r2.currentFrameLocalCountDelta
            int r1 = r1 - r2
            r0.currentFrameLocalCount = r1
            r0 = r11
            r1 = 0
            r0.currentFrameStackCount = r1
            goto L1fa
        Lf8:
            r0 = r15
            r1 = 251(0xfb, float:3.52E-43)
            if (r0 != r1) goto L10f
            r0 = r11
            r1 = 3
            r0.currentFrameType = r1
            r0 = r11
            r1 = 0
            r0.currentFrameStackCount = r1
            goto L1fa
        L10f:
            r0 = r15
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= r1) goto L178
            r0 = r10
            if (r0 == 0) goto L123
            r0 = r11
            int r0 = r0.currentFrameLocalCount
            goto L124
        L123:
            r0 = 0
        L124:
            r17 = r0
            r0 = r15
            r1 = 251(0xfb, float:3.52E-43)
            int r0 = r0 - r1
            r18 = r0
        L12e:
            r0 = r18
            if (r0 <= 0) goto L14f
            r0 = r7
            r1 = r12
            r2 = r11
            java.lang.Object[] r2 = r2.currentFrameLocalTypes
            r3 = r17
            int r17 = r17 + 1
            r4 = r13
            r5 = r14
            int r0 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            r12 = r0
            int r18 = r18 + (-1)
            goto L12e
        L14f:
            r0 = r11
            r1 = 1
            r0.currentFrameType = r1
            r0 = r11
            r1 = r15
            r2 = 251(0xfb, float:3.52E-43)
            int r1 = r1 - r2
            r0.currentFrameLocalCountDelta = r1
            r0 = r11
            r1 = r0
            int r1 = r1.currentFrameLocalCount
            r2 = r11
            int r2 = r2.currentFrameLocalCountDelta
            int r1 = r1 + r2
            r0.currentFrameLocalCount = r1
            r0 = r11
            r1 = 0
            r0.currentFrameStackCount = r1
            goto L1fa
        L178:
            r0 = r7
            r1 = r12
            int r0 = r0.readUnsignedShort(r1)
            r17 = r0
            int r12 = r12 + 2
            r0 = r11
            r1 = 0
            r0.currentFrameType = r1
            r0 = r11
            r1 = r17
            r0.currentFrameLocalCountDelta = r1
            r0 = r11
            r1 = r17
            r0.currentFrameLocalCount = r1
            r0 = 0
            r18 = r0
        L19a:
            r0 = r18
            r1 = r17
            if (r0 >= r1) goto L1ba
            r0 = r7
            r1 = r12
            r2 = r11
            java.lang.Object[] r2 = r2.currentFrameLocalTypes
            r3 = r18
            r4 = r13
            r5 = r14
            int r0 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            r12 = r0
            int r18 = r18 + 1
            goto L19a
        L1ba:
            r0 = r7
            r1 = r12
            int r0 = r0.readUnsignedShort(r1)
            r18 = r0
            int r12 = r12 + 2
            r0 = r11
            r1 = r18
            r0.currentFrameStackCount = r1
            r0 = 0
            r19 = r0
        L1cf:
            r0 = r19
            r1 = r18
            if (r0 >= r1) goto L1ef
            r0 = r7
            r1 = r12
            r2 = r11
            java.lang.Object[] r2 = r2.currentFrameStackTypes
            r3 = r19
            r4 = r13
            r5 = r14
            int r0 = r0.readVerificationTypeInfo(r1, r2, r3, r4, r5)
            r12 = r0
            int r19 = r19 + 1
            goto L1cf
        L1ef:
            goto L1fa
        L1f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        L1fa:
            r0 = r11
            r1 = r0
            int r1 = r1.currentFrameOffset
            r2 = r16
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1 + r2
            r0.currentFrameOffset = r1
            r0 = r7
            r1 = r11
            int r1 = r1.currentFrameOffset
            r2 = r14
            org.objectweb.asm.Label r0 = r0.createLabel(r1, r2)
            r0 = r12
            return r0
    }

    private int readVerificationTypeInfo(int r7, java.lang.Object[] r8, int r9, char[] r10, org.objectweb.asm.Label[] r11) {
            r6 = this;
            r0 = r7
            r12 = r0
            r0 = r6
            byte[] r0 = r0.classFileBuffer
            r1 = r12
            int r12 = r12 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r13 = r0
            r0 = r13
            switch(r0) {
                case 0: goto L48;
                case 1: goto L51;
                case 2: goto L5a;
                case 3: goto L63;
                case 4: goto L6c;
                case 5: goto L75;
                case 6: goto L7e;
                case 7: goto L87;
                case 8: goto L98;
                default: goto Lad;
            }
        L48:
            r0 = r8
            r1 = r9
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.TOP
            r0[r1] = r2
            goto Lb5
        L51:
            r0 = r8
            r1 = r9
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.INTEGER
            r0[r1] = r2
            goto Lb5
        L5a:
            r0 = r8
            r1 = r9
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.FLOAT
            r0[r1] = r2
            goto Lb5
        L63:
            r0 = r8
            r1 = r9
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.DOUBLE
            r0[r1] = r2
            goto Lb5
        L6c:
            r0 = r8
            r1 = r9
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.LONG
            r0[r1] = r2
            goto Lb5
        L75:
            r0 = r8
            r1 = r9
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.NULL
            r0[r1] = r2
            goto Lb5
        L7e:
            r0 = r8
            r1 = r9
            java.lang.Integer r2 = org.objectweb.asm.Opcodes.UNINITIALIZED_THIS
            r0[r1] = r2
            goto Lb5
        L87:
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r12
            r4 = r10
            java.lang.String r2 = r2.readClass(r3, r4)
            r0[r1] = r2
            int r12 = r12 + 2
            goto Lb5
        L98:
            r0 = r8
            r1 = r9
            r2 = r6
            r3 = r6
            r4 = r12
            int r3 = r3.readUnsignedShort(r4)
            r4 = r11
            org.objectweb.asm.Label r2 = r2.createLabel(r3, r4)
            r0[r1] = r2
            int r12 = r12 + 2
            goto Lb5
        Lad:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
        Lb5:
            r0 = r12
            return r0
    }

    final int getFirstAttributeOffset() {
            r6 = this;
            r0 = r6
            int r0 = r0.header
            r1 = 8
            int r0 = r0 + r1
            r1 = r6
            r2 = r6
            int r2 = r2.header
            r3 = 6
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r2 = 2
            int r1 = r1 * r2
            int r0 = r0 + r1
            r7 = r0
            r0 = r6
            r1 = r7
            int r0 = r0.readUnsignedShort(r1)
            r8 = r0
            int r7 = r7 + 2
        L1f:
            r0 = r8
            int r8 = r8 + (-1)
            if (r0 <= 0) goto L4c
            r0 = r6
            r1 = r7
            r2 = 6
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r9 = r0
            int r7 = r7 + 8
        L32:
            r0 = r9
            int r9 = r9 + (-1)
            if (r0 <= 0) goto L49
            r0 = r7
            r1 = 6
            r2 = r6
            r3 = r7
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7 = r0
            goto L32
        L49:
            goto L1f
        L4c:
            r0 = r6
            r1 = r7
            int r0 = r0.readUnsignedShort(r1)
            r9 = r0
            int r7 = r7 + 2
        L55:
            r0 = r9
            int r9 = r9 + (-1)
            if (r0 <= 0) goto L84
            r0 = r6
            r1 = r7
            r2 = 6
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            r10 = r0
            int r7 = r7 + 8
        L69:
            r0 = r10
            int r10 = r10 + (-1)
            if (r0 <= 0) goto L81
            r0 = r7
            r1 = 6
            r2 = r6
            r3 = r7
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readInt(r3)
            int r1 = r1 + r2
            int r0 = r0 + r1
            r7 = r0
            goto L69
        L81:
            goto L55
        L84:
            r0 = r7
            r1 = 2
            int r0 = r0 + r1
            return r0
    }

    private int[] readBootstrapMethodsAttribute(int r7) {
            r6 = this;
            r0 = r7
            char[] r0 = new char[r0]
            r8 = r0
            r0 = r6
            int r0 = r0.getFirstAttributeOffset()
            r9 = r0
            r0 = r6
            r1 = r9
            r2 = 2
            int r1 = r1 - r2
            int r0 = r0.readUnsignedShort(r1)
            r10 = r0
        L12:
            r0 = r10
            if (r0 <= 0) goto L7b
            r0 = r6
            r1 = r9
            r2 = r8
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r11 = r0
            r0 = r6
            r1 = r9
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            r12 = r0
            int r9 = r9 + 6
            java.lang.String r0 = "BootstrapMethods"
            r1 = r11
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
            r0 = r6
            r1 = r9
            int r0 = r0.readUnsignedShort(r1)
            int[] r0 = new int[r0]
            r13 = r0
            r0 = r9
            r1 = 2
            int r0 = r0 + r1
            r14 = r0
            r0 = 0
            r15 = r0
        L47:
            r0 = r15
            r1 = r13
            int r1 = r1.length
            if (r0 >= r1) goto L6d
            r0 = r13
            r1 = r15
            r2 = r14
            r0[r1] = r2
            r0 = r14
            r1 = 4
            r2 = r6
            r3 = r14
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readUnsignedShort(r3)
            r3 = 2
            int r2 = r2 * r3
            int r1 = r1 + r2
            int r0 = r0 + r1
            r14 = r0
            int r15 = r15 + 1
            goto L47
        L6d:
            r0 = r13
            return r0
        L70:
            r0 = r9
            r1 = r12
            int r0 = r0 + r1
            r9 = r0
            int r10 = r10 + (-1)
            goto L12
        L7b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
    }

    private org.objectweb.asm.Attribute readAttribute(org.objectweb.asm.Attribute[] r9, java.lang.String r10, int r11, int r12, char[] r13, int r14, org.objectweb.asm.Label[] r15) {
            r8 = this;
            r0 = r9
            r16 = r0
            r0 = r16
            int r0 = r0.length
            r17 = r0
            r0 = 0
            r18 = r0
        Lb:
            r0 = r18
            r1 = r17
            if (r0 >= r1) goto L3b
            r0 = r16
            r1 = r18
            r0 = r0[r1]
            r19 = r0
            r0 = r19
            java.lang.String r0 = r0.type
            r1 = r10
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L35
            r0 = r19
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.objectweb.asm.Attribute r0 = r0.read(r1, r2, r3, r4, r5, r6)
            return r0
        L35:
            int r18 = r18 + 1
            goto Lb
        L3b:
            org.objectweb.asm.Attribute r0 = new org.objectweb.asm.Attribute
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = 0
            r5 = -1
            r6 = 0
            org.objectweb.asm.Attribute r0 = r0.read(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public int getItemCount() {
            r2 = this;
            r0 = r2
            int[] r0 = r0.cpInfoOffsets
            int r0 = r0.length
            return r0
    }

    public int getItem(int r4) {
            r3 = this;
            r0 = r3
            int[] r0 = r0.cpInfoOffsets
            r1 = r4
            r0 = r0[r1]
            return r0
    }

    public int getMaxStringLength() {
            r2 = this;
            r0 = r2
            int r0 = r0.maxStringLength
            return r0
    }

    public int readByte(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.classFileBuffer
            r1 = r4
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            return r0
    }

    public int readUnsignedShort(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.classFileBuffer
            r7 = r0
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r7
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public short readShort(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.classFileBuffer
            r7 = r0
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r7
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    public int readInt(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.classFileBuffer
            r7 = r0
            r0 = r7
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 << r1
            r1 = r7
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r2 = r6
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r7
            r2 = r6
            r3 = 3
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public long readLong(int r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            int r0 = r0.readInt(r1)
            long r0 = (long) r0
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = 4
            int r1 = r1 + r2
            int r0 = r0.readInt(r1)
            long r0 = (long) r0
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r1
            r9 = r0
            r0 = r7
            r1 = 32
            long r0 = r0 << r1
            r1 = r9
            long r0 = r0 | r1
            return r0
    }

    public java.lang.String readUTF8(int r5, char[] r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.readUnsignedShort(r1)
            r7 = r0
            r0 = r5
            if (r0 == 0) goto Le
            r0 = r7
            if (r0 != 0) goto L10
        Le:
            r0 = 0
            return r0
        L10:
            r0 = r4
            r1 = r7
            r2 = r6
            java.lang.String r0 = r0.readUtf(r1, r2)
            return r0
    }

    final java.lang.String readUtf(int r8, char[] r9) {
            r7 = this;
            r0 = r7
            java.lang.String[] r0 = r0.constantUtf8Values
            r1 = r8
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            if (r0 == 0) goto Ld
            r0 = r10
            return r0
        Ld:
            r0 = r7
            int[] r0 = r0.cpInfoOffsets
            r1 = r8
            r0 = r0[r1]
            r11 = r0
            r0 = r7
            java.lang.String[] r0 = r0.constantUtf8Values
            r1 = r8
            r2 = r7
            r3 = r11
            r4 = 2
            int r3 = r3 + r4
            r4 = r7
            r5 = r11
            int r4 = r4.readUnsignedShort(r5)
            r5 = r9
            java.lang.String r2 = r2.readUtf(r3, r4, r5)
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            return r0
    }

    private java.lang.String readUtf(int r7, int r8, char[] r9) {
            r6 = this;
            r0 = r7
            r10 = r0
            r0 = r10
            r1 = r8
            int r0 = r0 + r1
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r6
            byte[] r0 = r0.classFileBuffer
            r13 = r0
        L12:
            r0 = r10
            r1 = r11
            if (r0 >= r1) goto L95
            r0 = r13
            r1 = r10
            int r10 = r10 + 1
            r0 = r0[r1]
            r14 = r0
            r0 = r14
            r1 = 128(0x80, float:1.794E-43)
            r0 = r0 & r1
            if (r0 != 0) goto L3c
            r0 = r9
            r1 = r12
            int r12 = r12 + 1
            r2 = r14
            r3 = 127(0x7f, float:1.78E-43)
            r2 = r2 & r3
            char r2 = (char) r2
            r0[r1] = r2
            goto L92
        L3c:
            r0 = r14
            r1 = 224(0xe0, float:3.14E-43)
            r0 = r0 & r1
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L67
            r0 = r9
            r1 = r12
            int r12 = r12 + 1
            r2 = r14
            r3 = 31
            r2 = r2 & r3
            r3 = 6
            int r2 = r2 << r3
            r3 = r13
            r4 = r10
            int r10 = r10 + 1
            r3 = r3[r4]
            r4 = 63
            r3 = r3 & r4
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
            goto L92
        L67:
            r0 = r9
            r1 = r12
            int r12 = r12 + 1
            r2 = r14
            r3 = 15
            r2 = r2 & r3
            r3 = 12
            int r2 = r2 << r3
            r3 = r13
            r4 = r10
            int r10 = r10 + 1
            r3 = r3[r4]
            r4 = 63
            r3 = r3 & r4
            r4 = 6
            int r3 = r3 << r4
            int r2 = r2 + r3
            r3 = r13
            r4 = r10
            int r10 = r10 + 1
            r3 = r3[r4]
            r4 = 63
            r3 = r3 & r4
            int r2 = r2 + r3
            char r2 = (char) r2
            r0[r1] = r2
        L92:
            goto L12
        L95:
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r9
            r3 = 0
            r4 = r12
            r1.<init>(r2, r3, r4)
            return r0
    }

    private java.lang.String readStringish(int r6, char[] r7) {
            r5 = this;
            r0 = r5
            r1 = r5
            int[] r1 = r1.cpInfoOffsets
            r2 = r5
            r3 = r6
            int r2 = r2.readUnsignedShort(r3)
            r1 = r1[r2]
            r2 = r7
            java.lang.String r0 = r0.readUTF8(r1, r2)
            return r0
    }

    public java.lang.String readClass(int r5, char[] r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = r0.readStringish(r1, r2)
            return r0
    }

    public java.lang.String readModule(int r5, char[] r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = r0.readStringish(r1, r2)
            return r0
    }

    public java.lang.String readPackage(int r5, char[] r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            java.lang.String r0 = r0.readStringish(r1, r2)
            return r0
    }

    private org.objectweb.asm.ConstantDynamic readConstantDynamic(int r10, char[] r11) {
            r9 = this;
            r0 = r9
            org.objectweb.asm.ConstantDynamic[] r0 = r0.constantDynamicValues
            r1 = r10
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 == 0) goto Ld
            r0 = r12
            return r0
        Ld:
            r0 = r9
            int[] r0 = r0.cpInfoOffsets
            r1 = r10
            r0 = r0[r1]
            r13 = r0
            r0 = r9
            int[] r0 = r0.cpInfoOffsets
            r1 = r9
            r2 = r13
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r14 = r0
            r0 = r9
            r1 = r14
            r2 = r11
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r15 = r0
            r0 = r9
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r11
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r16 = r0
            r0 = r9
            int[] r0 = r0.bootstrapMethodOffsets
            r1 = r9
            r2 = r13
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r17 = r0
            r0 = r9
            r1 = r9
            r2 = r17
            int r1 = r1.readUnsignedShort(r2)
            r2 = r11
            java.lang.Object r0 = r0.readConst(r1, r2)
            org.objectweb.asm.Handle r0 = (org.objectweb.asm.Handle) r0
            r18 = r0
            r0 = r9
            r1 = r17
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readUnsignedShort(r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r19 = r0
            int r17 = r17 + 4
            r0 = 0
            r20 = r0
        L68:
            r0 = r20
            r1 = r19
            int r1 = r1.length
            if (r0 >= r1) goto L89
            r0 = r19
            r1 = r20
            r2 = r9
            r3 = r9
            r4 = r17
            int r3 = r3.readUnsignedShort(r4)
            r4 = r11
            java.lang.Object r2 = r2.readConst(r3, r4)
            r0[r1] = r2
            int r17 = r17 + 2
            int r20 = r20 + 1
            goto L68
        L89:
            r0 = r9
            org.objectweb.asm.ConstantDynamic[] r0 = r0.constantDynamicValues
            r1 = r10
            org.objectweb.asm.ConstantDynamic r2 = new org.objectweb.asm.ConstantDynamic
            r3 = r2
            r4 = r15
            r5 = r16
            r6 = r18
            r7 = r19
            r3.<init>(r4, r5, r6, r7)
            r3 = r2; r2 = r1; r1 = r0; r0 = r3; 
            r1[r2] = r3
            return r0
    }

    public java.lang.Object readConst(int r9, char[] r10) {
            r8 = this;
            r0 = r8
            int[] r0 = r0.cpInfoOffsets
            r1 = r9
            r0 = r0[r1]
            r11 = r0
            r0 = r8
            byte[] r0 = r0.classFileBuffer
            r1 = r11
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            switch(r0) {
                case 3: goto L58;
                case 4: goto L61;
                case 5: goto L6d;
                case 6: goto L76;
                case 7: goto L82;
                case 8: goto L8c;
                case 9: goto L10c;
                case 10: goto L10c;
                case 11: goto L10c;
                case 12: goto L10c;
                case 13: goto L10c;
                case 14: goto L10c;
                case 15: goto L9d;
                case 16: goto L93;
                case 17: goto L105;
                default: goto L10c;
            }
        L58:
            r0 = r8
            r1 = r11
            int r0 = r0.readInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L61:
            r0 = r8
            r1 = r11
            int r0 = r0.readInt(r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L6d:
            r0 = r8
            r1 = r11
            long r0 = r0.readLong(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L76:
            r0 = r8
            r1 = r11
            long r0 = r0.readLong(r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
        L82:
            r0 = r8
            r1 = r11
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getObjectType(r0)
            return r0
        L8c:
            r0 = r8
            r1 = r11
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            return r0
        L93:
            r0 = r8
            r1 = r11
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            org.objectweb.asm.Type r0 = org.objectweb.asm.Type.getMethodType(r0)
            return r0
        L9d:
            r0 = r8
            r1 = r11
            int r0 = r0.readByte(r1)
            r12 = r0
            r0 = r8
            int[] r0 = r0.cpInfoOffsets
            r1 = r8
            r2 = r11
            r3 = 1
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r13 = r0
            r0 = r8
            int[] r0 = r0.cpInfoOffsets
            r1 = r8
            r2 = r13
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readUnsignedShort(r2)
            r0 = r0[r1]
            r14 = r0
            r0 = r8
            r1 = r13
            r2 = r10
            java.lang.String r0 = r0.readClass(r1, r2)
            r15 = r0
            r0 = r8
            r1 = r14
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r16 = r0
            r0 = r8
            r1 = r14
            r2 = 2
            int r1 = r1 + r2
            r2 = r10
            java.lang.String r0 = r0.readUTF8(r1, r2)
            r17 = r0
            r0 = r8
            byte[] r0 = r0.classFileBuffer
            r1 = r13
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r1 = 11
            if (r0 != r1) goto Lf0
            r0 = 1
            goto Lf1
        Lf0:
            r0 = 0
        Lf1:
            r18 = r0
            org.objectweb.asm.Handle r0 = new org.objectweb.asm.Handle
            r1 = r0
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L105:
            r0 = r8
            r1 = r9
            r2 = r10
            org.objectweb.asm.ConstantDynamic r0 = r0.readConstantDynamic(r1, r2)
            return r0
        L10c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r1.<init>()
            throw r0
    }
}
