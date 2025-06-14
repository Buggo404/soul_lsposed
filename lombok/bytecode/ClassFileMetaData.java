package lombok.bytecode;

/* loaded from: com.usidqw.qwerklj.apk:lombok/bytecode/ClassFileMetaData.SCL.lombok */
public class ClassFileMetaData {
    private static final byte UTF8 = 1;
    private static final byte INTEGER = 3;
    private static final byte FLOAT = 4;
    private static final byte LONG = 5;
    private static final byte DOUBLE = 6;
    private static final byte CLASS = 7;
    private static final byte STRING = 8;
    private static final byte FIELD = 9;
    private static final byte METHOD = 10;
    private static final byte INTERFACE_METHOD = 11;
    private static final byte NAME_TYPE = 12;
    private static final byte METHOD_HANDLE = 15;
    private static final byte METHOD_TYPE = 16;
    private static final byte DYNAMIC = 17;
    private static final byte INVOKE_DYNAMIC = 18;
    private static final byte MODULE = 19;
    private static final byte PACKAGE = 20;
    private static final int NOT_FOUND = -1;
    private static final int START_OF_CONSTANT_POOL = 8;
    private final byte[] byteCode;
    private final int maxPoolSize;
    private final int[] offsets;
    private final byte[] types;
    private final java.lang.String[] utf8s;
    private final int endOfPool;

    public ClassFileMetaData(byte[] r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r7
            r0.byteCode = r1
            r0 = r6
            r1 = r6
            r2 = 8
            int r1 = r1.readValue(r2)
            r0.maxPoolSize = r1
            r0 = r6
            r1 = r6
            int r1 = r1.maxPoolSize
            int[] r1 = new int[r1]
            r0.offsets = r1
            r0 = r6
            r1 = r6
            int r1 = r1.maxPoolSize
            byte[] r1 = new byte[r1]
            r0.types = r1
            r0 = r6
            r1 = r6
            int r1 = r1.maxPoolSize
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.utf8s = r1
            r0 = 10
            r8 = r0
            r0 = 1
            r9 = r0
            goto L10d
        L3a:
            r0 = r7
            r1 = r8
            r0 = r0[r1]
            r10 = r0
            r0 = r6
            byte[] r0 = r0.types
            r1 = r9
            r2 = r10
            r0[r1] = r2
            int r8 = r8 + 1
            r0 = r6
            int[] r0 = r0.offsets
            r1 = r9
            r2 = r8
            r0[r1] = r2
            r0 = r10
            switch(r0) {
                case 0: goto Lee;
                case 1: goto Lb4;
                case 2: goto Lf1;
                case 3: goto Ldf;
                case 4: goto Ldf;
                case 5: goto Le5;
                case 6: goto Le5;
                case 7: goto Ld3;
                case 8: goto Ld3;
                case 9: goto Ldf;
                case 10: goto Ldf;
                case 11: goto Ldf;
                case 12: goto Ldf;
                case 13: goto Lf1;
                case 14: goto Lf1;
                case 15: goto Ld9;
                case 16: goto Ld3;
                case 17: goto Ldf;
                case 18: goto Ldf;
                case 19: goto Ld3;
                case 20: goto Ld3;
                default: goto Lf1;
            }
        Lb4:
            r0 = r6
            r1 = r8
            int r0 = r0.readValue(r1)
            r11 = r0
            int r8 = r8 + 2
            r0 = r6
            java.lang.String[] r0 = r0.utf8s
            r1 = r9
            r2 = r6
            r3 = r8
            r4 = r11
            java.lang.String r2 = r2.decodeString(r3, r4)
            r0[r1] = r2
            r0 = r8
            r1 = r11
            int r0 = r0 + r1
            r8 = r0
            goto L10a
        Ld3:
            int r8 = r8 + 2
            goto L10a
        Ld9:
            int r8 = r8 + 3
            goto L10a
        Ldf:
            int r8 = r8 + 4
            goto L10a
        Le5:
            int r8 = r8 + 8
            int r9 = r9 + 1
            goto L10a
        Lee:
            goto L10a
        Lf1:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unknown constant pool type "
            r3.<init>(r4)
            r3 = r10
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L10a:
            int r9 = r9 + 1
        L10d:
            r0 = r9
            r1 = r6
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L3a
            r0 = r6
            r1 = r8
            r0.endOfPool = r1
            return
    }

    private java.lang.String decodeString(int r7, int r8) {
            r6 = this;
            r0 = r7
            r1 = r8
            int r0 = r0 + r1
            r9 = r0
            r0 = r8
            char[] r0 = new char[r0]
            r10 = r0
            r0 = 0
            r11 = r0
            goto La3
        Lf:
            r0 = r6
            byte[] r0 = r0.byteCode
            r1 = r7
            int r7 = r7 + 1
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r12 = r0
            r0 = r12
            r1 = 128(0x80, float:1.794E-43)
            if (r0 >= r1) goto L34
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r12
            char r2 = (char) r2
            r0[r1] = r2
            goto La3
        L34:
            r0 = r12
            r1 = 224(0xe0, float:3.14E-43)
            r0 = r0 & r1
            r1 = 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L69
            r0 = r12
            r1 = 31
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 << r1
            r13 = r0
            r0 = r6
            byte[] r0 = r0.byteCode
            r1 = r7
            int r7 = r7 + 1
            r0 = r0[r1]
            r1 = 63
            r0 = r0 & r1
            r14 = r0
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r13
            r3 = r14
            r2 = r2 | r3
            char r2 = (char) r2
            r0[r1] = r2
            goto La3
        L69:
            r0 = r12
            r1 = 15
            r0 = r0 & r1
            r1 = 12
            int r0 = r0 << r1
            r13 = r0
            r0 = r6
            byte[] r0 = r0.byteCode
            r1 = r7
            int r7 = r7 + 1
            r0 = r0[r1]
            r1 = 63
            r0 = r0 & r1
            r1 = 6
            int r0 = r0 << r1
            r14 = r0
            r0 = r6
            byte[] r0 = r0.byteCode
            r1 = r7
            int r7 = r7 + 1
            r0 = r0[r1]
            r1 = 63
            r0 = r0 & r1
            r15 = r0
            r0 = r10
            r1 = r11
            int r11 = r11 + 1
            r2 = r13
            r3 = r14
            r2 = r2 | r3
            r3 = r15
            r2 = r2 | r3
            char r2 = (char) r2
            r0[r1] = r2
        La3:
            r0 = r7
            r1 = r9
            if (r0 < r1) goto Lf
            java.lang.String r0 = new java.lang.String
            r1 = r0
            r2 = r10
            r3 = 0
            r4 = r11
            r1.<init>(r2, r3, r4)
            return r0
    }

    public boolean containsUtf8(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.findUtf8(r1)
            r1 = -1
            if (r0 == r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean usesClass(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.findClass(r1)
            r1 = -1
            if (r0 == r1) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean usesField(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.findClass(r1)
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r4
            r1 = r6
            int r0 = r0.findUtf8(r1)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L1c
            r0 = 0
            return r0
        L1c:
            r0 = 1
            r9 = r0
            goto L61
        L22:
            r0 = r4
            byte[] r0 = r0.types
            r1 = r9
            r0 = r0[r1]
            r1 = 9
            if (r0 != r1) goto L5e
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r9
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r7
            if (r0 != r1) goto L5e
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r9
            r1 = r1[r2]
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readValue(r1)
            r10 = r0
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r10
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r8
            if (r0 != r1) goto L5e
            r0 = 1
            return r0
        L5e:
            int r9 = r9 + 1
        L61:
            r0 = r9
            r1 = r4
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L22
            r0 = 0
            return r0
    }

    public boolean usesMethod(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.findClass(r1)
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = r4
            r1 = r6
            int r0 = r0.findUtf8(r1)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L1c
            r0 = 0
            return r0
        L1c:
            r0 = 1
            r9 = r0
            goto L5e
        L22:
            r0 = r4
            r1 = r9
            boolean r0 = r0.isMethod(r1)
            if (r0 == 0) goto L5b
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r9
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r7
            if (r0 != r1) goto L5b
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r9
            r1 = r1[r2]
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readValue(r1)
            r10 = r0
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r10
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r8
            if (r0 != r1) goto L5b
            r0 = 1
            return r0
        L5b:
            int r9 = r9 + 1
        L5e:
            r0 = r9
            r1 = r4
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L22
            r0 = 0
            return r0
    }

    public boolean usesMethod(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.findClass(r1)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto Lf
            r0 = 0
            return r0
        Lf:
            r0 = r4
            r1 = r6
            r2 = r7
            int r0 = r0.findNameAndType(r1, r2)
            r9 = r0
            r0 = r9
            r1 = -1
            if (r0 != r1) goto L1f
            r0 = 0
            return r0
        L1f:
            r0 = 1
            r10 = r0
            goto L55
        L25:
            r0 = r4
            r1 = r10
            boolean r0 = r0.isMethod(r1)
            if (r0 == 0) goto L52
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r10
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r8
            if (r0 != r1) goto L52
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r10
            r1 = r1[r2]
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readValue(r1)
            r1 = r9
            if (r0 != r1) goto L52
            r0 = 1
            return r0
        L52:
            int r10 = r10 + 1
        L55:
            r0 = r10
            r1 = r4
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L25
            r0 = 0
            return r0
    }

    public boolean containsStringConstant(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.findUtf8(r1)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = 0
            return r0
        Ld:
            r0 = 1
            r7 = r0
            goto L30
        L12:
            r0 = r4
            byte[] r0 = r0.types
            r1 = r7
            r0 = r0[r1]
            r1 = 8
            if (r0 != r1) goto L2d
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r7
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r6
            if (r0 != r1) goto L2d
            r0 = 1
            return r0
        L2d:
            int r7 = r7 + 1
        L30:
            r0 = r7
            r1 = r4
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L12
            r0 = 0
            return r0
    }

    public boolean containsLong(long r6) {
            r5 = this;
            r0 = 1
            r8 = r0
            goto L1e
        L5:
            r0 = r5
            byte[] r0 = r0.types
            r1 = r8
            r0 = r0[r1]
            r1 = 5
            if (r0 != r1) goto L1b
            r0 = r5
            r1 = r8
            long r0 = r0.readLong(r1)
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1b
            r0 = 1
            return r0
        L1b:
            int r8 = r8 + 1
        L1e:
            r0 = r8
            r1 = r5
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L5
            r0 = 0
            return r0
    }

    public boolean containsDouble(double r6) {
            r5 = this;
            r0 = r6
            boolean r0 = java.lang.Double.isNaN(r0)
            r8 = r0
            r0 = 1
            r9 = r0
            goto L37
        Lb:
            r0 = r5
            byte[] r0 = r0.types
            r1 = r9
            r0 = r0[r1]
            r1 = 6
            if (r0 != r1) goto L34
            r0 = r5
            r1 = r9
            double r0 = r0.readDouble(r1)
            r10 = r0
            r0 = r10
            r1 = r6
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L32
            r0 = r8
            if (r0 == 0) goto L34
            r0 = r10
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto L34
        L32:
            r0 = 1
            return r0
        L34:
            int r9 = r9 + 1
        L37:
            r0 = r9
            r1 = r5
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto Lb
            r0 = 0
            return r0
    }

    public boolean containsInteger(int r4) {
            r3 = this;
            r0 = 1
            r5 = r0
            goto L1d
        L5:
            r0 = r3
            byte[] r0 = r0.types
            r1 = r5
            r0 = r0[r1]
            r1 = 3
            if (r0 != r1) goto L1a
            r0 = r3
            r1 = r5
            int r0 = r0.readInteger(r1)
            r1 = r4
            if (r0 != r1) goto L1a
            r0 = 1
            return r0
        L1a:
            int r5 = r5 + 1
        L1d:
            r0 = r5
            r1 = r3
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L5
            r0 = 0
            return r0
    }

    public boolean containsFloat(float r4) {
            r3 = this;
            r0 = r4
            boolean r0 = java.lang.Float.isNaN(r0)
            r5 = r0
            r0 = 1
            r6 = r0
            goto L33
        La:
            r0 = r3
            byte[] r0 = r0.types
            r1 = r6
            r0 = r0[r1]
            r1 = 4
            if (r0 != r1) goto L30
            r0 = r3
            r1 = r6
            float r0 = r0.readFloat(r1)
            r7 = r0
            r0 = r7
            r1 = r4
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L2e
            r0 = r5
            if (r0 == 0) goto L30
            r0 = r7
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L30
        L2e:
            r0 = 1
            return r0
        L30:
            int r6 = r6 + 1
        L33:
            r0 = r6
            r1 = r3
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto La
            r0 = 0
            return r0
    }

    private long readLong(int r8) {
            r7 = this;
            r0 = r7
            int[] r0 = r0.offsets
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r7
            r1 = r9
            int r0 = r0.read32(r1)
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r7
            r2 = r9
            r3 = 4
            int r2 = r2 + r3
            int r1 = r1.read32(r2)
            long r1 = (long) r1
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r2
            long r0 = r0 | r1
            return r0
    }

    private double readDouble(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            long r0 = r0.readLong(r1)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    private int readInteger(int r5) {
            r4 = this;
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r5
            r1 = r1[r2]
            int r0 = r0.read32(r1)
            return r0
    }

    private float readFloat(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            int r0 = r0.readInteger(r1)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    private int read32(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.byteCode
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 << r1
            r1 = r5
            byte[] r1 = r1.byteCode
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 16
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r5
            byte[] r1 = r1.byteCode
            r2 = r6
            r3 = 2
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r2 = 8
            int r1 = r1 << r2
            r0 = r0 | r1
            r1 = r5
            byte[] r1 = r1.byteCode
            r2 = r6
            r3 = 3
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }

    public java.lang.String getClassName() {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r5
            int r2 = r2.endOfPool
            r3 = 2
            int r2 = r2 + r3
            int r1 = r1.readValue(r2)
            java.lang.String r0 = r0.getClassName(r1)
            return r0
    }

    public java.lang.String getSuperClassName() {
            r5 = this;
            r0 = r5
            r1 = r5
            r2 = r5
            int r2 = r2.endOfPool
            r3 = 4
            int r2 = r2 + r3
            int r1 = r1.readValue(r2)
            java.lang.String r0 = r0.getClassName(r1)
            return r0
    }

    public java.util.List<java.lang.String> getInterfaces() {
            r7 = this;
            r0 = r7
            r1 = r7
            int r1 = r1.endOfPool
            r2 = 6
            int r1 = r1 + r2
            int r0 = r0.readValue(r1)
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L14
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r9 = r0
            r0 = 0
            r10 = r0
            goto L3e
        L21:
            r0 = r9
            r1 = r7
            r2 = r7
            r3 = r7
            int r3 = r3.endOfPool
            r4 = 8
            int r3 = r3 + r4
            r4 = r10
            r5 = 2
            int r4 = r4 * r5
            int r3 = r3 + r4
            int r2 = r2.readValue(r3)
            java.lang.String r1 = r1.getClassName(r2)
            boolean r0 = r0.add(r1)
            int r10 = r10 + 1
        L3e:
            r0 = r10
            r1 = r8
            if (r0 < r1) goto L21
            r0 = r9
            return r0
    }

    public java.lang.String poolContent() {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = 1
            r9 = r0
            goto L183
        Ld:
            r0 = r8
            java.lang.String r1 = "#%02x: "
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r9
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r3[r4] = r5
            java.lang.String r1 = java.lang.String.format(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r7
            int[] r0 = r0.offsets
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r7
            byte[] r0 = r0.types
            r1 = r9
            r0 = r0[r1]
            switch(r0) {
                case 0: goto L170;
                case 1: goto L88;
                case 2: goto L178;
                case 3: goto Lcb;
                case 4: goto Lde;
                case 5: goto L11e;
                case 6: goto L131;
                case 7: goto L9b;
                case 8: goto Lad;
                case 9: goto Lf1;
                case 10: goto L100;
                case 11: goto L100;
                case 12: goto L10f;
                case 13: goto L178;
                case 14: goto L178;
                case 15: goto L144;
                case 16: goto L14f;
                case 17: goto L15a;
                case 18: goto L165;
                default: goto L178;
            }
        L88:
            r0 = r8
            java.lang.String r1 = "Utf8 "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String[] r1 = r1.utf8s
            r2 = r9
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        L9b:
            r0 = r8
            java.lang.String r1 = "Class "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            r2 = r9
            java.lang.String r1 = r1.getClassName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        Lad:
            r0 = r8
            java.lang.String r1 = "String \""
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.String[] r1 = r1.utf8s
            r2 = r7
            r3 = r10
            int r2 = r2.readValue(r3)
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        Lcb:
            r0 = r8
            java.lang.String r1 = "int "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            r2 = r9
            int r1 = r1.readInteger(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        Lde:
            r0 = r8
            java.lang.String r1 = "float "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            r2 = r9
            float r1 = r1.readFloat(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        Lf1:
            r0 = r7
            r1 = r8
            java.lang.String r2 = "Field "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            r0.appendAccess(r1, r2)
            goto L178
        L100:
            r0 = r7
            r1 = r8
            java.lang.String r2 = "Method "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            r0.appendAccess(r1, r2)
            goto L178
        L10f:
            r0 = r7
            r1 = r8
            java.lang.String r2 = "Name&Type "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            r0.appendNameAndType(r1, r2)
            goto L178
        L11e:
            r0 = r8
            java.lang.String r1 = "long "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            r2 = r9
            long r1 = r1.readLong(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        L131:
            r0 = r8
            java.lang.String r1 = "double "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            r2 = r9
            double r1 = r1.readDouble(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        L144:
            r0 = r8
            java.lang.String r1 = "MethodHandle..."
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        L14f:
            r0 = r8
            java.lang.String r1 = "MethodType..."
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        L15a:
            r0 = r8
            java.lang.String r1 = "Dynamic..."
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        L165:
            r0 = r8
            java.lang.String r1 = "InvokeDynamic..."
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L178
        L170:
            r0 = r8
            java.lang.String r1 = "(cont.)"
            java.lang.StringBuilder r0 = r0.append(r1)
        L178:
            r0 = r8
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r9 = r9 + 1
        L183:
            r0 = r9
            r1 = r7
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto Ld
            r0 = r8
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void appendAccess(java.lang.StringBuilder r7, int r8) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.offsets
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r7
            r1 = r6
            r2 = r6
            r3 = r9
            int r2 = r2.readValue(r3)
            java.lang.String r1 = r1.getClassName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = r9
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readValue(r3)
            r0.appendNameAndType(r1, r2)
            return
    }

    private void appendNameAndType(java.lang.StringBuilder r7, int r8) {
            r6 = this;
            r0 = r6
            int[] r0 = r0.offsets
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r7
            r1 = r6
            java.lang.String[] r1 = r1.utf8s
            r2 = r6
            r3 = r9
            int r2 = r2.readValue(r3)
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ":"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String[] r1 = r1.utf8s
            r2 = r6
            r3 = r9
            r4 = 2
            int r3 = r3 + r4
            int r2 = r2.readValue(r3)
            r1 = r1[r2]
            java.lang.StringBuilder r0 = r0.append(r1)
            return
    }

    private java.lang.String getClassName(int r6) {
            r5 = this;
            r0 = r6
            r1 = 1
            if (r0 >= r1) goto L7
            r0 = 0
            return r0
        L7:
            r0 = r5
            java.lang.String[] r0 = r0.utf8s
            r1 = r5
            r2 = r5
            int[] r2 = r2.offsets
            r3 = r6
            r2 = r2[r3]
            int r1 = r1.readValue(r2)
            r0 = r0[r1]
            return r0
    }

    private boolean isMethod(int r4) {
            r3 = this;
            r0 = r3
            byte[] r0 = r0.types
            r1 = r4
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            r1 = 10
            if (r0 == r1) goto L15
            r0 = r5
            r1 = 11
            if (r0 == r1) goto L15
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    private int findNameAndType(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.findUtf8(r1)
            r7 = r0
            r0 = r7
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = -1
            return r0
        Ld:
            r0 = r4
            r1 = r6
            int r0 = r0.findUtf8(r1)
            r8 = r0
            r0 = r8
            r1 = -1
            if (r0 != r1) goto L1c
            r0 = -1
            return r0
        L1c:
            r0 = 1
            r9 = r0
            goto L55
        L22:
            r0 = r4
            byte[] r0 = r0.types
            r1 = r9
            r0 = r0[r1]
            r1 = 12
            if (r0 != r1) goto L52
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r9
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r7
            if (r0 != r1) goto L52
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r9
            r1 = r1[r2]
            r2 = 2
            int r1 = r1 + r2
            int r0 = r0.readValue(r1)
            r1 = r8
            if (r0 != r1) goto L52
            r0 = r9
            return r0
        L52:
            int r9 = r9 + 1
        L55:
            r0 = r9
            r1 = r4
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L22
            r0 = -1
            return r0
    }

    private int findUtf8(java.lang.String r5) {
            r4 = this;
            r0 = 1
            r6 = r0
            goto L17
        L5:
            r0 = r5
            r1 = r4
            java.lang.String[] r1 = r1.utf8s
            r2 = r6
            r1 = r1[r2]
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            r0 = r6
            return r0
        L14:
            int r6 = r6 + 1
        L17:
            r0 = r6
            r1 = r4
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L5
            r0 = -1
            return r0
    }

    private int findClass(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            int r0 = r0.findUtf8(r1)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 != r1) goto Ld
            r0 = -1
            return r0
        Ld:
            r0 = 1
            r7 = r0
            goto L30
        L12:
            r0 = r4
            byte[] r0 = r0.types
            r1 = r7
            r0 = r0[r1]
            r1 = 7
            if (r0 != r1) goto L2d
            r0 = r4
            r1 = r4
            int[] r1 = r1.offsets
            r2 = r7
            r1 = r1[r2]
            int r0 = r0.readValue(r1)
            r1 = r6
            if (r0 != r1) goto L2d
            r0 = r7
            return r0
        L2d:
            int r7 = r7 + 1
        L30:
            r0 = r7
            r1 = r4
            int r1 = r1.maxPoolSize
            if (r0 < r1) goto L12
            r0 = -1
            return r0
    }

    private int readValue(int r6) {
            r5 = this;
            r0 = r5
            byte[] r0 = r0.byteCode
            r1 = r6
            r0 = r0[r1]
            r1 = 255(0xff, float:3.57E-43)
            r0 = r0 & r1
            r1 = 8
            int r0 = r0 << r1
            r1 = r5
            byte[] r1 = r1.byteCode
            r2 = r6
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            r0 = r0 | r1
            return r0
    }
}
