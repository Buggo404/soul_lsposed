package com.google.gson.stream;

/* loaded from: classes.dex */
public class JsonReader implements java.io.Closeable {
    static final int BUFFER_SIZE = 1024;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final char[] buffer;

    /* renamed from: in */
    private final java.io.Reader f123in;
    private boolean lenient;
    private int limit;
    private int lineNumber;
    private int lineStart;
    private int[] pathIndices;
    private java.lang.String[] pathNames;
    int peeked;
    private long peekedLong;
    private int peekedNumberLength;
    private java.lang.String peekedString;
    private int pos;
    private int[] stack;
    private int stackSize;


    static {
            com.google.gson.stream.JsonReader$1 r0 = new com.google.gson.stream.JsonReader$1
            r0.<init>()
            com.google.gson.internal.JsonReaderInternalAccess.INSTANCE = r0
            return
    }

    public JsonReader(java.io.Reader r5) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.lenient = r0
            r1 = 1024(0x400, float:1.435E-42)
            char[] r1 = new char[r1]
            r4.buffer = r1
            r4.pos = r0
            r4.limit = r0
            r4.lineNumber = r0
            r4.lineStart = r0
            r4.peeked = r0
            r1 = 32
            int[] r2 = new int[r1]
            r4.stack = r2
            int r3 = r0 + 1
            r4.stackSize = r3
            r3 = 6
            r2[r0] = r3
            java.lang.String[] r0 = new java.lang.String[r1]
            r4.pathNames = r0
            int[] r0 = new int[r1]
            r4.pathIndices = r0
            if (r5 == 0) goto L30
            r4.f123in = r5
            return
        L30:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "in == null"
            r5.<init>(r0)
            throw r5
    }

    private void checkLenient() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.lenient
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            java.io.IOException r0 = r1.syntaxError(r0)
            throw r0
    }

    private void consumeNonExecutePrefix() throws java.io.IOException {
            r5 = this;
            r0 = 1
            r5.nextNonWhitespace(r0)
            int r1 = r5.pos
            int r1 = r1 - r0
            r5.pos = r1
            r0 = 5
            int r1 = r1 + r0
            int r2 = r5.limit
            if (r1 <= r2) goto L16
            boolean r1 = r5.fillBuffer(r0)
            if (r1 != 0) goto L16
            return
        L16:
            int r1 = r5.pos
            char[] r2 = r5.buffer
            char r3 = r2[r1]
            r4 = 41
            if (r3 != r4) goto L44
            int r3 = r1 + 1
            char r3 = r2[r3]
            r4 = 93
            if (r3 != r4) goto L44
            int r3 = r1 + 2
            char r3 = r2[r3]
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 != r4) goto L44
            int r3 = r1 + 3
            char r3 = r2[r3]
            r4 = 39
            if (r3 != r4) goto L44
            int r3 = r1 + 4
            char r2 = r2[r3]
            r3 = 10
            if (r2 == r3) goto L41
            goto L44
        L41:
            int r1 = r1 + r0
            r5.pos = r1
        L44:
            return
    }

    private boolean fillBuffer(int r8) throws java.io.IOException {
            r7 = this;
            char[] r0 = r7.buffer
            int r1 = r7.lineStart
            int r2 = r7.pos
            int r1 = r1 - r2
            r7.lineStart = r1
            int r1 = r7.limit
            r3 = 0
            if (r1 == r2) goto L15
            int r1 = r1 - r2
            r7.limit = r1
            java.lang.System.arraycopy(r0, r2, r0, r3, r1)
            goto L17
        L15:
            r7.limit = r3
        L17:
            r7.pos = r3
        L19:
            java.io.Reader r1 = r7.f123in
            int r2 = r7.limit
            int r4 = r0.length
            int r4 = r4 - r2
            int r1 = r1.read(r0, r2, r4)
            r2 = -1
            if (r1 == r2) goto L4b
            int r2 = r7.limit
            int r2 = r2 + r1
            r7.limit = r2
            int r1 = r7.lineNumber
            r4 = 1
            if (r1 != 0) goto L48
            int r1 = r7.lineStart
            if (r1 != 0) goto L48
            if (r2 <= 0) goto L48
            char r5 = r0[r3]
            r6 = 65279(0xfeff, float:9.1475E-41)
            if (r5 != r6) goto L48
            int r5 = r7.pos
            int r5 = r5 + r4
            r7.pos = r5
            int r1 = r1 + 1
            r7.lineStart = r1
            int r8 = r8 + 1
        L48:
            if (r2 < r8) goto L19
            return r4
        L4b:
            return r3
    }

    private java.lang.String getPath(boolean r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "$"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r5.stackSize
            if (r1 >= r2) goto L4f
            int[] r3 = r5.stack
            r3 = r3[r1]
            r4 = 1
            if (r3 == r4) goto L2f
            r4 = 2
            if (r3 == r4) goto L2f
            r2 = 3
            if (r3 == r2) goto L20
            r2 = 4
            if (r3 == r2) goto L20
            r2 = 5
            if (r3 == r2) goto L20
            goto L4c
        L20:
            r2 = 46
            r0.append(r2)
            java.lang.String[] r2 = r5.pathNames
            r2 = r2[r1]
            if (r2 == 0) goto L4c
            r0.append(r2)
            goto L4c
        L2f:
            int[] r3 = r5.pathIndices
            r3 = r3[r1]
            if (r6 == 0) goto L3d
            if (r3 <= 0) goto L3d
            int r2 = r2 + (-1)
            if (r1 != r2) goto L3d
            int r3 = r3 + (-1)
        L3d:
            r2 = 91
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 93
            r2.append(r3)
        L4c:
            int r1 = r1 + 1
            goto L8
        L4f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private boolean isLiteral(char r2) throws java.io.IOException {
            r1 = this;
            r0 = 9
            if (r2 == r0) goto L3c
            r0 = 10
            if (r2 == r0) goto L3c
            r0 = 12
            if (r2 == r0) goto L3c
            r0 = 13
            if (r2 == r0) goto L3c
            r0 = 32
            if (r2 == r0) goto L3c
            r0 = 35
            if (r2 == r0) goto L39
            r0 = 44
            if (r2 == r0) goto L3c
            r0 = 47
            if (r2 == r0) goto L39
            r0 = 61
            if (r2 == r0) goto L39
            r0 = 123(0x7b, float:1.72E-43)
            if (r2 == r0) goto L3c
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L3c
            r0 = 58
            if (r2 == r0) goto L3c
            r0 = 59
            if (r2 == r0) goto L39
            switch(r2) {
                case 91: goto L3c;
                case 92: goto L39;
                case 93: goto L3c;
                default: goto L37;
            }
        L37:
            r2 = 1
            return r2
        L39:
            r1.checkLenient()
        L3c:
            r2 = 0
            return r2
    }

    private int nextNonWhitespace(boolean r8) throws java.io.IOException {
            r7 = this;
            char[] r0 = r7.buffer
            int r1 = r7.pos
            int r2 = r7.limit
        L6:
            r3 = 1
            if (r1 != r2) goto L32
            r7.pos = r1
            boolean r1 = r7.fillBuffer(r3)
            if (r1 != 0) goto L2e
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End of input"
            r0.<init>(r1)
            java.lang.String r1 = r7.locationString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L2e:
            int r1 = r7.pos
            int r2 = r7.limit
        L32:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L43
            int r1 = r7.lineNumber
            int r1 = r1 + r3
            r7.lineNumber = r1
            r7.lineStart = r4
            goto Lb2
        L43:
            r5 = 32
            if (r1 == r5) goto Lb2
            r5 = 13
            if (r1 == r5) goto Lb2
            r5 = 9
            if (r1 != r5) goto L50
            goto Lb2
        L50:
            r5 = 47
            if (r1 != r5) goto L9d
            r7.pos = r4
            r6 = 2
            if (r4 != r2) goto L69
            int r4 = r4 + (-1)
            r7.pos = r4
            boolean r2 = r7.fillBuffer(r6)
            int r4 = r7.pos
            int r4 = r4 + r3
            r7.pos = r4
            if (r2 != 0) goto L69
            return r1
        L69:
            r7.checkLenient()
            int r2 = r7.pos
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L83
            if (r3 == r5) goto L77
            return r1
        L77:
            int r2 = r2 + 1
            r7.pos = r2
            r7.skipToEndOfLine()
            int r1 = r7.pos
            int r2 = r7.limit
            goto L6
        L83:
            int r2 = r2 + 1
            r7.pos = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.skipTo(r1)
            if (r1 == 0) goto L96
            int r1 = r7.pos
            int r1 = r1 + r6
            int r2 = r7.limit
            goto L6
        L96:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.syntaxError(r8)
            throw r8
        L9d:
            r2 = 35
            if (r1 != r2) goto Laf
            r7.pos = r4
            r7.checkLenient()
            r7.skipToEndOfLine()
            int r1 = r7.pos
            int r2 = r7.limit
            goto L6
        Laf:
            r7.pos = r4
            return r1
        Lb2:
            r1 = r4
            goto L6
    }

    private java.lang.String nextQuotedValue(char r10) throws java.io.IOException {
            r9 = this;
            char[] r0 = r9.buffer
            r1 = 0
        L3:
            int r2 = r9.pos
            int r3 = r9.limit
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.pos = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.pos = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.readEscapeCharacter()
            r1.append(r2)
            int r2 = r9.pos
            int r3 = r9.limit
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.lineNumber
            int r2 = r2 + r6
            r9.lineNumber = r2
            r9.lineStart = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.pos = r2
            boolean r2 = r9.fillBuffer(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.syntaxError(r10)
            throw r10
    }

    private java.lang.String nextUnquotedValue() throws java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.pos
            int r4 = r3 + r2
            int r5 = r6.limit
            if (r4 >= r5) goto L4e
            char[] r4 = r6.buffer
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.checkLenient()
            goto L5c
        L4e:
            char[] r3 = r6.buffer
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.fillBuffer(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r1 = r2
            goto L7e
        L5e:
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6b:
            char[] r3 = r6.buffer
            int r4 = r6.pos
            r0.append(r3, r4, r2)
            int r3 = r6.pos
            int r3 = r3 + r2
            r6.pos = r3
            r2 = 1
            boolean r2 = r6.fillBuffer(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r0 != 0) goto L8a
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.buffer
            int r3 = r6.pos
            r0.<init>(r2, r3, r1)
            goto L96
        L8a:
            char[] r2 = r6.buffer
            int r3 = r6.pos
            java.lang.StringBuilder r0 = r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L96:
            int r2 = r6.pos
            int r2 = r2 + r1
            r6.pos = r2
            return r0
    }

    private int peekKeyword() throws java.io.IOException {
            r8 = this;
            char[] r0 = r8.buffer
            int r1 = r8.pos
            char r0 = r0[r1]
            r1 = 116(0x74, float:1.63E-43)
            r2 = 0
            if (r0 == r1) goto L2f
            r1 = 84
            if (r0 != r1) goto L10
            goto L2f
        L10:
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L29
            r1 = 70
            if (r0 != r1) goto L19
            goto L29
        L19:
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L23
            r1 = 78
            if (r0 != r1) goto L22
            goto L23
        L22:
            return r2
        L23:
            java.lang.String r0 = "null"
            java.lang.String r1 = "NULL"
            r3 = 7
            goto L34
        L29:
            java.lang.String r0 = "false"
            java.lang.String r1 = "FALSE"
            r3 = 6
            goto L34
        L2f:
            java.lang.String r0 = "true"
            java.lang.String r1 = "TRUE"
            r3 = 5
        L34:
            int r4 = r0.length()
            r5 = 1
        L39:
            if (r5 >= r4) goto L62
            int r6 = r8.pos
            int r6 = r6 + r5
            int r7 = r8.limit
            if (r6 < r7) goto L4b
            int r6 = r5 + 1
            boolean r6 = r8.fillBuffer(r6)
            if (r6 != 0) goto L4b
            return r2
        L4b:
            char[] r6 = r8.buffer
            int r7 = r8.pos
            int r7 = r7 + r5
            char r6 = r6[r7]
            char r7 = r0.charAt(r5)
            if (r6 == r7) goto L5f
            char r7 = r1.charAt(r5)
            if (r6 == r7) goto L5f
            return r2
        L5f:
            int r5 = r5 + 1
            goto L39
        L62:
            int r0 = r8.pos
            int r0 = r0 + r4
            int r1 = r8.limit
            if (r0 < r1) goto L71
            int r0 = r4 + 1
            boolean r0 = r8.fillBuffer(r0)
            if (r0 == 0) goto L7f
        L71:
            char[] r0 = r8.buffer
            int r1 = r8.pos
            int r1 = r1 + r4
            char r0 = r0[r1]
            boolean r0 = r8.isLiteral(r0)
            if (r0 == 0) goto L7f
            return r2
        L7f:
            int r0 = r8.pos
            int r0 = r0 + r4
            r8.pos = r0
            r8.peeked = r3
            return r3
    }

    private int peekNumber() throws java.io.IOException {
            r18 = this;
            r0 = r18
            char[] r1 = r0.buffer
            int r2 = r0.pos
            int r3 = r0.limit
            r6 = 0
            r7 = 1
            r8 = r6
            r9 = r8
            r13 = r9
            r10 = r7
            r11 = 0
        L10:
            int r14 = r2 + r8
            r15 = 2
            if (r14 != r3) goto L27
            int r2 = r1.length
            if (r8 != r2) goto L19
            return r6
        L19:
            int r2 = r8 + 1
            boolean r2 = r0.fillBuffer(r2)
            if (r2 != 0) goto L23
            goto L93
        L23:
            int r2 = r0.pos
            int r3 = r0.limit
        L27:
            int r14 = r2 + r8
            char r14 = r1[r14]
            r6 = 43
            r5 = 5
            if (r14 == r6) goto Leb
            r6 = 69
            if (r14 == r6) goto Ldf
            r6 = 101(0x65, float:1.42E-43)
            if (r14 == r6) goto Ldf
            r6 = 45
            if (r14 == r6) goto Ld2
            r6 = 46
            r4 = 3
            if (r14 == r6) goto Lcb
            r6 = 48
            if (r14 < r6) goto L8d
            r6 = 57
            if (r14 <= r6) goto L4a
            goto L8d
        L4a:
            if (r9 == r7) goto L83
            if (r9 != 0) goto L4f
            goto L83
        L4f:
            if (r9 != r15) goto L76
            r16 = 0
            int r4 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r4 != 0) goto L59
            r4 = 0
            return r4
        L59:
            r4 = 10
            long r4 = r4 * r11
            int r14 = r14 + (-48)
            long r14 = (long) r14
            long r4 = r4 - r14
            r14 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r6 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r6 > 0) goto L72
            if (r6 != 0) goto L70
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 >= 0) goto L70
            goto L72
        L70:
            r6 = 0
            goto L73
        L72:
            r6 = r7
        L73:
            r10 = r10 & r6
            r11 = r4
            goto L88
        L76:
            if (r9 != r4) goto L7b
            r6 = 0
            r9 = 4
            goto L89
        L7b:
            if (r9 == r5) goto L80
            r4 = 6
            if (r9 != r4) goto L88
        L80:
            r6 = 0
            r9 = 7
            goto L89
        L83:
            int r14 = r14 + (-48)
            int r4 = -r14
            long r11 = (long) r4
            r9 = r15
        L88:
            r6 = 0
        L89:
            r16 = 0
            goto Lf2
        L8d:
            boolean r1 = r0.isLiteral(r14)
            if (r1 != 0) goto Lc9
        L93:
            if (r9 != r15) goto Lb7
            if (r10 == 0) goto Lb7
            r1 = -9223372036854775808
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 != 0) goto L9f
            if (r13 == 0) goto Lb7
        L9f:
            r16 = 0
            int r1 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r1 != 0) goto La7
            if (r13 != 0) goto Lb7
        La7:
            if (r13 == 0) goto Laa
            goto Lab
        Laa:
            long r11 = -r11
        Lab:
            r0.peekedLong = r11
            int r1 = r0.pos
            int r1 = r1 + r8
            r0.pos = r1
            r1 = 15
            r0.peeked = r1
            return r1
        Lb7:
            if (r9 == r15) goto Lc2
            r1 = 4
            if (r9 == r1) goto Lc2
            r1 = 7
            if (r9 != r1) goto Lc0
            goto Lc2
        Lc0:
            r6 = 0
            return r6
        Lc2:
            r0.peekedNumberLength = r8
            r1 = 16
            r0.peeked = r1
            return r1
        Lc9:
            r6 = 0
            return r6
        Lcb:
            r6 = 0
            r16 = 0
            if (r9 != r15) goto Ld1
            goto Lf1
        Ld1:
            return r6
        Ld2:
            r4 = 6
            r6 = 0
            r16 = 0
            if (r9 != 0) goto Ldb
            r9 = r7
            r13 = r9
            goto Lf2
        Ldb:
            if (r9 != r5) goto Lde
            goto Lf1
        Lde:
            return r6
        Ldf:
            r6 = 0
            r16 = 0
            if (r9 == r15) goto Le9
            r4 = 4
            if (r9 != r4) goto Le8
            goto Le9
        Le8:
            return r6
        Le9:
            r9 = r5
            goto Lf2
        Leb:
            r4 = 6
            r6 = 0
            r16 = 0
            if (r9 != r5) goto Lf6
        Lf1:
            r9 = r4
        Lf2:
            int r8 = r8 + 1
            goto L10
        Lf6:
            return r6
    }

    private void push(int r4) {
            r3 = this;
            int r0 = r3.stackSize
            int[] r1 = r3.stack
            int r2 = r1.length
            if (r0 != r2) goto L21
            int r0 = r0 * 2
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.stack = r1
            int[] r1 = r3.pathIndices
            int[] r1 = java.util.Arrays.copyOf(r1, r0)
            r3.pathIndices = r1
            java.lang.String[] r1 = r3.pathNames
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.pathNames = r0
        L21:
            int[] r0 = r3.stack
            int r1 = r3.stackSize
            int r2 = r1 + 1
            r3.stackSize = r2
            r0[r1] = r4
            return
    }

    private char readEscapeCharacter() throws java.io.IOException {
            r8 = this;
            int r0 = r8.pos
            int r1 = r8.limit
            java.lang.String r2 = "Unterminated escape sequence"
            r3 = 1
            if (r0 != r1) goto L15
            boolean r0 = r8.fillBuffer(r3)
            if (r0 == 0) goto L10
            goto L15
        L10:
            java.io.IOException r0 = r8.syntaxError(r2)
            throw r0
        L15:
            char[] r0 = r8.buffer
            int r1 = r8.pos
            int r4 = r1 + 1
            r8.pos = r4
            char r0 = r0[r1]
            r1 = 10
            if (r0 == r1) goto Lbf
            r3 = 34
            if (r0 == r3) goto Lc6
            r3 = 39
            if (r0 == r3) goto Lc6
            r3 = 47
            if (r0 == r3) goto Lc6
            r3 = 92
            if (r0 == r3) goto Lc6
            r3 = 98
            if (r0 == r3) goto Lbc
            r3 = 102(0x66, float:1.43E-43)
            if (r0 == r3) goto Lb9
            r5 = 110(0x6e, float:1.54E-43)
            if (r0 == r5) goto Lb8
            r5 = 114(0x72, float:1.6E-43)
            if (r0 == r5) goto Lb5
            r5 = 116(0x74, float:1.63E-43)
            if (r0 == r5) goto Lb2
            r5 = 117(0x75, float:1.64E-43)
            if (r0 != r5) goto Lab
            r0 = 4
            int r4 = r4 + r0
            int r5 = r8.limit
            if (r4 <= r5) goto L5d
            boolean r4 = r8.fillBuffer(r0)
            if (r4 == 0) goto L58
            goto L5d
        L58:
            java.io.IOException r0 = r8.syntaxError(r2)
            throw r0
        L5d:
            int r2 = r8.pos
            int r4 = r2 + 4
            r5 = 0
        L62:
            if (r2 >= r4) goto La5
            char[] r6 = r8.buffer
            char r6 = r6[r2]
            int r5 = r5 << 4
            char r5 = (char) r5
            r7 = 48
            if (r6 < r7) goto L78
            r7 = 57
            if (r6 > r7) goto L78
            int r6 = r6 + (-48)
        L75:
            int r5 = r5 + r6
            char r5 = (char) r5
            goto L8d
        L78:
            r7 = 97
            if (r6 < r7) goto L82
            if (r6 > r3) goto L82
            int r6 = r6 + (-97)
        L80:
            int r6 = r6 + r1
            goto L75
        L82:
            r7 = 65
            if (r6 < r7) goto L90
            r7 = 70
            if (r6 > r7) goto L90
            int r6 = r6 + (-65)
            goto L80
        L8d:
            int r2 = r2 + 1
            goto L62
        L90:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = new java.lang.String
            char[] r3 = r8.buffer
            int r4 = r8.pos
            r2.<init>(r3, r4, r0)
            java.lang.String r0 = "\\u"
            java.lang.String r0 = r0.concat(r2)
            r1.<init>(r0)
            throw r1
        La5:
            int r1 = r8.pos
            int r1 = r1 + r0
            r8.pos = r1
            return r5
        Lab:
            java.lang.String r0 = "Invalid escape sequence"
            java.io.IOException r0 = r8.syntaxError(r0)
            throw r0
        Lb2:
            r0 = 9
            return r0
        Lb5:
            r0 = 13
            return r0
        Lb8:
            return r1
        Lb9:
            r0 = 12
            return r0
        Lbc:
            r0 = 8
            return r0
        Lbf:
            int r1 = r8.lineNumber
            int r1 = r1 + r3
            r8.lineNumber = r1
            r8.lineStart = r4
        Lc6:
            return r0
    }

    private void skipQuotedValue(char r7) throws java.io.IOException {
            r6 = this;
            char[] r0 = r6.buffer
        L2:
            int r1 = r6.pos
            int r2 = r6.limit
        L6:
            r3 = 1
            if (r1 >= r2) goto L2d
            int r4 = r1 + 1
            char r1 = r0[r1]
            if (r1 != r7) goto L12
            r6.pos = r4
            return
        L12:
            r5 = 92
            if (r1 != r5) goto L20
            r6.pos = r4
            r6.readEscapeCharacter()
            int r1 = r6.pos
            int r2 = r6.limit
            goto L6
        L20:
            r5 = 10
            if (r1 != r5) goto L2b
            int r1 = r6.lineNumber
            int r1 = r1 + r3
            r6.lineNumber = r1
            r6.lineStart = r4
        L2b:
            r1 = r4
            goto L6
        L2d:
            r6.pos = r1
            boolean r1 = r6.fillBuffer(r3)
            if (r1 == 0) goto L36
            goto L2
        L36:
            java.lang.String r7 = "Unterminated string"
            java.io.IOException r7 = r6.syntaxError(r7)
            throw r7
    }

    private boolean skipTo(java.lang.String r7) throws java.io.IOException {
            r6 = this;
            int r0 = r7.length()
        L4:
            int r1 = r6.pos
            int r1 = r1 + r0
            int r2 = r6.limit
            r3 = 0
            if (r1 <= r2) goto L14
            boolean r1 = r6.fillBuffer(r0)
            if (r1 == 0) goto L13
            goto L14
        L13:
            return r3
        L14:
            char[] r1 = r6.buffer
            int r2 = r6.pos
            char r1 = r1[r2]
            r4 = 10
            r5 = 1
            if (r1 != r4) goto L29
            int r1 = r6.lineNumber
            int r1 = r1 + r5
            r6.lineNumber = r1
            int r2 = r2 + 1
            r6.lineStart = r2
            goto L38
        L29:
            if (r3 >= r0) goto L41
            char[] r1 = r6.buffer
            int r2 = r6.pos
            int r2 = r2 + r3
            char r1 = r1[r2]
            char r2 = r7.charAt(r3)
            if (r1 == r2) goto L3e
        L38:
            int r1 = r6.pos
            int r1 = r1 + r5
            r6.pos = r1
            goto L4
        L3e:
            int r3 = r3 + 1
            goto L29
        L41:
            return r5
    }

    private void skipToEndOfLine() throws java.io.IOException {
            r4 = this;
        L0:
            int r0 = r4.pos
            int r1 = r4.limit
            r2 = 1
            if (r0 < r1) goto Ld
            boolean r0 = r4.fillBuffer(r2)
            if (r0 == 0) goto L27
        Ld:
            char[] r0 = r4.buffer
            int r1 = r4.pos
            int r3 = r1 + 1
            r4.pos = r3
            char r0 = r0[r1]
            r1 = 10
            if (r0 != r1) goto L23
            int r0 = r4.lineNumber
            int r0 = r0 + r2
            r4.lineNumber = r0
            r4.lineStart = r3
            goto L27
        L23:
            r1 = 13
            if (r0 != r1) goto L0
        L27:
            return
    }

    private void skipUnquotedValue() throws java.io.IOException {
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.pos
            int r2 = r1 + r0
            int r3 = r4.limit
            if (r2 >= r3) goto L51
            char[] r2 = r4.buffer
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.checkLenient()
        L4b:
            int r1 = r4.pos
            int r1 = r1 + r0
            r4.pos = r1
            return
        L51:
            int r1 = r1 + r0
            r4.pos = r1
            r0 = 1
            boolean r0 = r4.fillBuffer(r0)
            if (r0 != 0) goto L0
            return
    }

    private java.io.IOException syntaxError(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.MalformedJsonException r0 = new com.google.gson.stream.MalformedJsonException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = r2.locationString()
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public void beginArray() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peeked
            if (r0 != 0) goto L8
            int r0 = r3.doPeek()
        L8:
            r1 = 3
            if (r0 != r1) goto L1a
            r0 = 1
            r3.push(r0)
            int[] r1 = r3.pathIndices
            int r2 = r3.stackSize
            int r2 = r2 - r0
            r0 = 0
            r1[r2] = r0
            r3.peeked = r0
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected BEGIN_ARRAY but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r3.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void beginObject() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peeked
            if (r0 != 0) goto L8
            int r0 = r3.doPeek()
        L8:
            r1 = 1
            if (r0 != r1) goto L13
            r0 = 3
            r3.push(r0)
            r0 = 0
            r3.peeked = r0
            return
        L13:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected BEGIN_OBJECT but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r3.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            r0 = 0
            r3.peeked = r0
            int[] r1 = r3.stack
            r2 = 8
            r1[r0] = r2
            r0 = 1
            r3.stackSize = r0
            java.io.Reader r0 = r3.f123in
            r0.close()
            return
    }

    int doPeek() throws java.io.IOException {
            r15 = this;
            int[] r0 = r15.stack
            int r1 = r15.stackSize
            int r2 = r1 + (-1)
            r2 = r0[r2]
            r3 = 8
            r4 = 39
            r5 = 34
            r6 = 93
            r7 = 3
            r8 = 7
            r9 = 59
            r10 = 44
            r11 = 4
            r12 = 2
            r13 = 1
            if (r2 != r13) goto L20
            int r1 = r1 - r13
            r0[r1] = r12
            goto La2
        L20:
            if (r2 != r12) goto L3a
            int r0 = r15.nextNonWhitespace(r13)
            if (r0 == r10) goto La2
            if (r0 == r9) goto L36
            if (r0 != r6) goto L2f
            r15.peeked = r11
            return r11
        L2f:
            java.lang.String r0 = "Unterminated array"
            java.io.IOException r0 = r15.syntaxError(r0)
            throw r0
        L36:
            r15.checkLenient()
            goto La2
        L3a:
            r14 = 5
            if (r2 == r7) goto L11b
            if (r2 != r14) goto L41
            goto L11b
        L41:
            if (r2 != r11) goto L76
            int r1 = r1 - r13
            r0[r1] = r14
            int r0 = r15.nextNonWhitespace(r13)
            r1 = 58
            if (r0 == r1) goto La2
            r1 = 61
            if (r0 != r1) goto L6f
            r15.checkLenient()
            int r0 = r15.pos
            int r1 = r15.limit
            if (r0 < r1) goto L61
            boolean r0 = r15.fillBuffer(r13)
            if (r0 == 0) goto La2
        L61:
            char[] r0 = r15.buffer
            int r1 = r15.pos
            char r0 = r0[r1]
            r14 = 62
            if (r0 != r14) goto La2
            int r1 = r1 + r13
            r15.pos = r1
            goto La2
        L6f:
            java.lang.String r0 = "Expected ':'"
            java.io.IOException r0 = r15.syntaxError(r0)
            throw r0
        L76:
            r0 = 6
            if (r2 != r0) goto L88
            boolean r0 = r15.lenient
            if (r0 == 0) goto L80
            r15.consumeNonExecutePrefix()
        L80:
            int[] r0 = r15.stack
            int r1 = r15.stackSize
            int r1 = r1 - r13
            r0[r1] = r8
            goto La2
        L88:
            if (r2 != r8) goto La0
            r0 = 0
            int r0 = r15.nextNonWhitespace(r0)
            r1 = -1
            if (r0 != r1) goto L97
            r0 = 17
            r15.peeked = r0
            return r0
        L97:
            r15.checkLenient()
            int r0 = r15.pos
            int r0 = r0 - r13
            r15.pos = r0
            goto La2
        La0:
            if (r2 == r3) goto L113
        La2:
            int r0 = r15.nextNonWhitespace(r13)
            if (r0 == r5) goto L10e
            if (r0 == r4) goto L108
            if (r0 == r10) goto Lf1
            if (r0 == r9) goto Lf1
            r1 = 91
            if (r0 == r1) goto Lee
            if (r0 == r6) goto Le9
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto Le6
            int r0 = r15.pos
            int r0 = r0 - r13
            r15.pos = r0
            int r0 = r15.peekKeyword()
            if (r0 == 0) goto Lc4
            return r0
        Lc4:
            int r0 = r15.peekNumber()
            if (r0 == 0) goto Lcb
            return r0
        Lcb:
            char[] r0 = r15.buffer
            int r1 = r15.pos
            char r0 = r0[r1]
            boolean r0 = r15.isLiteral(r0)
            if (r0 == 0) goto Ldf
            r15.checkLenient()
            r0 = 10
            r15.peeked = r0
            return r0
        Ldf:
            java.lang.String r0 = "Expected value"
            java.io.IOException r0 = r15.syntaxError(r0)
            throw r0
        Le6:
            r15.peeked = r13
            return r13
        Le9:
            if (r2 != r13) goto Lf1
            r15.peeked = r11
            return r11
        Lee:
            r15.peeked = r7
            return r7
        Lf1:
            if (r2 == r13) goto Lfd
            if (r2 != r12) goto Lf6
            goto Lfd
        Lf6:
            java.lang.String r0 = "Unexpected value"
            java.io.IOException r0 = r15.syntaxError(r0)
            throw r0
        Lfd:
            r15.checkLenient()
            int r0 = r15.pos
            int r0 = r0 - r13
            r15.pos = r0
            r15.peeked = r8
            return r8
        L108:
            r15.checkLenient()
            r15.peeked = r3
            return r3
        L10e:
            r0 = 9
            r15.peeked = r0
            return r0
        L113:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonReader is closed"
            r0.<init>(r1)
            throw r0
        L11b:
            int r1 = r1 - r13
            r0[r1] = r11
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 != r14) goto L139
            int r1 = r15.nextNonWhitespace(r13)
            if (r1 == r10) goto L139
            if (r1 == r9) goto L136
            if (r1 != r0) goto L12f
            r15.peeked = r12
            return r12
        L12f:
            java.lang.String r0 = "Unterminated object"
            java.io.IOException r0 = r15.syntaxError(r0)
            throw r0
        L136:
            r15.checkLenient()
        L139:
            int r1 = r15.nextNonWhitespace(r13)
            if (r1 == r5) goto L170
            if (r1 == r4) goto L168
            java.lang.String r3 = "Expected name"
            if (r1 == r0) goto L15e
            r15.checkLenient()
            int r0 = r15.pos
            int r0 = r0 - r13
            r15.pos = r0
            char r0 = (char) r1
            boolean r0 = r15.isLiteral(r0)
            if (r0 == 0) goto L159
            r0 = 14
            r15.peeked = r0
            return r0
        L159:
            java.io.IOException r0 = r15.syntaxError(r3)
            throw r0
        L15e:
            if (r2 == r14) goto L163
            r15.peeked = r12
            return r12
        L163:
            java.io.IOException r0 = r15.syntaxError(r3)
            throw r0
        L168:
            r15.checkLenient()
            r0 = 12
            r15.peeked = r0
            return r0
        L170:
            r0 = 13
            r15.peeked = r0
            return r0
    }

    public void endArray() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peeked
            if (r0 != 0) goto L8
            int r0 = r3.doPeek()
        L8:
            r1 = 4
            if (r0 != r1) goto L1f
            int r0 = r3.stackSize
            int r0 = r0 + (-1)
            r3.stackSize = r0
            int[] r1 = r3.pathIndices
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r3.peeked = r0
            return
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected END_ARRAY but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r3.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void endObject() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peeked
            if (r0 != 0) goto L8
            int r0 = r3.doPeek()
        L8:
            r1 = 2
            if (r0 != r1) goto L24
            int r0 = r3.stackSize
            int r0 = r0 + (-1)
            r3.stackSize = r0
            java.lang.String[] r1 = r3.pathNames
            r2 = 0
            r1[r0] = r2
            int[] r1 = r3.pathIndices
            int r0 = r0 + (-1)
            r2 = r1[r0]
            int r2 = r2 + 1
            r1[r0] = r2
            r0 = 0
            r3.peeked = r0
            return
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected END_OBJECT but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r3.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String getPath() {
            r1 = this;
            r0 = 0
            java.lang.String r0 = r1.getPath(r0)
            return r0
    }

    public java.lang.String getPreviousPath() {
            r1 = this;
            r0 = 1
            java.lang.String r0 = r1.getPath(r0)
            return r0
    }

    public boolean hasNext() throws java.io.IOException {
            r2 = this;
            int r0 = r2.peeked
            if (r0 != 0) goto L8
            int r0 = r2.doPeek()
        L8:
            r1 = 2
            if (r0 == r1) goto L14
            r1 = 4
            if (r0 == r1) goto L14
            r1 = 17
            if (r0 == r1) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public final boolean isLenient() {
            r1 = this;
            boolean r0 = r1.lenient
            return r0
    }

    java.lang.String locationString() {
            r4 = this;
            int r0 = r4.lineNumber
            int r0 = r0 + 1
            int r1 = r4.pos
            int r2 = r4.lineStart
            int r1 = r1 - r2
            int r1 = r1 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " at line "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = " column "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " path "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r4.getPath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean nextBoolean() throws java.io.IOException {
            r5 = this;
            int r0 = r5.peeked
            if (r0 != 0) goto L8
            int r0 = r5.doPeek()
        L8:
            r1 = 5
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L1a
            r5.peeked = r2
            int[] r0 = r5.pathIndices
            int r1 = r5.stackSize
            int r1 = r1 - r3
            r2 = r0[r1]
            int r2 = r2 + r3
            r0[r1] = r2
            return r3
        L1a:
            r1 = 6
            if (r0 != r1) goto L2a
            r5.peeked = r2
            int[] r0 = r5.pathIndices
            int r1 = r5.stackSize
            int r1 = r1 - r3
            r4 = r0[r1]
            int r4 = r4 + r3
            r0[r1] = r4
            return r2
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a boolean but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r5.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r5.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public double nextDouble() throws java.io.IOException {
            r6 = this;
            int r0 = r6.peeked
            if (r0 != 0) goto L8
            int r0 = r6.doPeek()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1f
            r6.peeked = r2
            int[] r0 = r6.pathIndices
            int r1 = r6.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r6.peekedLong
            double r0 = (double) r0
            return r0
        L1f:
            r1 = 16
            r3 = 11
            if (r0 != r1) goto L3a
            java.lang.String r0 = new java.lang.String
            char[] r1 = r6.buffer
            int r4 = r6.pos
            int r5 = r6.peekedNumberLength
            r0.<init>(r1, r4, r5)
            r6.peekedString = r0
            int r0 = r6.pos
            int r1 = r6.peekedNumberLength
            int r0 = r0 + r1
            r6.pos = r0
            goto L7f
        L3a:
            r1 = 8
            if (r0 == r1) goto L72
            r4 = 9
            if (r0 != r4) goto L43
            goto L72
        L43:
            r1 = 10
            if (r0 != r1) goto L4e
            java.lang.String r0 = r6.nextUnquotedValue()
            r6.peekedString = r0
            goto L7f
        L4e:
            if (r0 != r3) goto L51
            goto L7f
        L51:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a double but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r6.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L72:
            if (r0 != r1) goto L77
            r0 = 39
            goto L79
        L77:
            r0 = 34
        L79:
            java.lang.String r0 = r6.nextQuotedValue(r0)
            r6.peekedString = r0
        L7f:
            r6.peeked = r3
            java.lang.String r0 = r6.peekedString
            double r0 = java.lang.Double.parseDouble(r0)
            boolean r3 = r6.lenient
            if (r3 != 0) goto Lb5
            boolean r3 = java.lang.Double.isNaN(r0)
            if (r3 != 0) goto L98
            boolean r3 = java.lang.Double.isInfinite(r0)
            if (r3 != 0) goto L98
            goto Lb5
        L98:
            com.google.gson.stream.MalformedJsonException r2 = new com.google.gson.stream.MalformedJsonException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "JSON forbids NaN and infinities: "
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r1 = r6.locationString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        Lb5:
            r3 = 0
            r6.peekedString = r3
            r6.peeked = r2
            int[] r2 = r6.pathIndices
            int r3 = r6.stackSize
            int r3 = r3 + (-1)
            r4 = r2[r3]
            int r4 = r4 + 1
            r2[r3] = r4
            return r0
    }

    public int nextInt() throws java.io.IOException {
            r7 = this;
            int r0 = r7.peeked
            if (r0 != 0) goto L8
            int r0 = r7.doPeek()
        L8:
            r1 = 15
            java.lang.String r2 = "Expected an int but was "
            r3 = 0
            if (r0 != r1) goto L43
            long r0 = r7.peekedLong
            int r4 = (int) r0
            long r5 = (long) r4
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L26
            r7.peeked = r3
            int[] r0 = r7.pathIndices
            int r1 = r7.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return r4
        L26:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            long r2 = r7.peekedLong
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L43:
            r1 = 16
            if (r0 != r1) goto L5c
            java.lang.String r0 = new java.lang.String
            char[] r1 = r7.buffer
            int r4 = r7.pos
            int r5 = r7.peekedNumberLength
            r0.<init>(r1, r4, r5)
            r7.peekedString = r0
            int r0 = r7.pos
            int r1 = r7.peekedNumberLength
            int r0 = r0 + r1
            r7.pos = r0
            goto Lb3
        L5c:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L88
            r5 = 9
            if (r0 == r5) goto L88
            if (r0 != r1) goto L69
            goto L88
        L69:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r7.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L88:
            if (r0 != r1) goto L91
            java.lang.String r0 = r7.nextUnquotedValue()
            r7.peekedString = r0
            goto L9e
        L91:
            if (r0 != r4) goto L96
            r0 = 39
            goto L98
        L96:
            r0 = 34
        L98:
            java.lang.String r0 = r7.nextQuotedValue(r0)
            r7.peekedString = r0
        L9e:
            java.lang.String r0 = r7.peekedString     // Catch: java.lang.NumberFormatException -> Lb3
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lb3
            r7.peeked = r3     // Catch: java.lang.NumberFormatException -> Lb3
            int[] r1 = r7.pathIndices     // Catch: java.lang.NumberFormatException -> Lb3
            int r4 = r7.stackSize     // Catch: java.lang.NumberFormatException -> Lb3
            int r4 = r4 + (-1)
            r5 = r1[r4]     // Catch: java.lang.NumberFormatException -> Lb3
            int r5 = r5 + 1
            r1[r4] = r5     // Catch: java.lang.NumberFormatException -> Lb3
            return r0
        Lb3:
            r0 = 11
            r7.peeked = r0
            java.lang.String r0 = r7.peekedString
            double r0 = java.lang.Double.parseDouble(r0)
            int r4 = (int) r0
            double r5 = (double) r4
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto Ld5
            r0 = 0
            r7.peekedString = r0
            r7.peeked = r3
            int[] r0 = r7.pathIndices
            int r1 = r7.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return r4
        Ld5:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = r7.peekedString
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r7.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public long nextLong() throws java.io.IOException {
            r8 = this;
            int r0 = r8.peeked
            if (r0 != 0) goto L8
            int r0 = r8.doPeek()
        L8:
            r1 = 15
            r2 = 0
            if (r0 != r1) goto L1e
            r8.peeked = r2
            int[] r0 = r8.pathIndices
            int r1 = r8.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            long r0 = r8.peekedLong
            return r0
        L1e:
            r1 = 16
            java.lang.String r3 = "Expected a long but was "
            if (r0 != r1) goto L39
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.buffer
            int r4 = r8.pos
            int r5 = r8.peekedNumberLength
            r0.<init>(r1, r4, r5)
            r8.peekedString = r0
            int r0 = r8.pos
            int r1 = r8.peekedNumberLength
            int r0 = r0 + r1
            r8.pos = r0
            goto L90
        L39:
            r1 = 10
            r4 = 8
            if (r0 == r4) goto L65
            r5 = 9
            if (r0 == r5) goto L65
            if (r0 != r1) goto L46
            goto L65
        L46:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            com.google.gson.stream.JsonToken r2 = r8.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r8.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L65:
            if (r0 != r1) goto L6e
            java.lang.String r0 = r8.nextUnquotedValue()
            r8.peekedString = r0
            goto L7b
        L6e:
            if (r0 != r4) goto L73
            r0 = 39
            goto L75
        L73:
            r0 = 34
        L75:
            java.lang.String r0 = r8.nextQuotedValue(r0)
            r8.peekedString = r0
        L7b:
            java.lang.String r0 = r8.peekedString     // Catch: java.lang.NumberFormatException -> L90
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L90
            r8.peeked = r2     // Catch: java.lang.NumberFormatException -> L90
            int[] r4 = r8.pathIndices     // Catch: java.lang.NumberFormatException -> L90
            int r5 = r8.stackSize     // Catch: java.lang.NumberFormatException -> L90
            int r5 = r5 + (-1)
            r6 = r4[r5]     // Catch: java.lang.NumberFormatException -> L90
            int r6 = r6 + 1
            r4[r5] = r6     // Catch: java.lang.NumberFormatException -> L90
            return r0
        L90:
            r0 = 11
            r8.peeked = r0
            java.lang.String r0 = r8.peekedString
            double r0 = java.lang.Double.parseDouble(r0)
            long r4 = (long) r0
            double r6 = (double) r4
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto Lb2
            r0 = 0
            r8.peekedString = r0
            r8.peeked = r2
            int[] r0 = r8.pathIndices
            int r1 = r8.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return r4
        Lb2:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r8.peekedString
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r8.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String nextName() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peeked
            if (r0 != 0) goto L8
            int r0 = r3.doPeek()
        L8:
            r1 = 14
            if (r0 != r1) goto L11
            java.lang.String r0 = r3.nextUnquotedValue()
            goto L26
        L11:
            r1 = 12
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r3.nextQuotedValue(r0)
            goto L26
        L1c:
            r1 = 13
            if (r0 != r1) goto L32
            r0 = 34
            java.lang.String r0 = r3.nextQuotedValue(r0)
        L26:
            r1 = 0
            r3.peeked = r1
            java.lang.String[] r1 = r3.pathNames
            int r2 = r3.stackSize
            int r2 = r2 + (-1)
            r1[r2] = r0
            return r0
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a name but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r3.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void nextNull() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peeked
            if (r0 != 0) goto L8
            int r0 = r3.doPeek()
        L8:
            r1 = 7
            if (r0 != r1) goto L1b
            r0 = 0
            r3.peeked = r0
            int[] r0 = r3.pathIndices
            int r1 = r3.stackSize
            int r1 = r1 + (-1)
            r2 = r0[r1]
            int r2 = r2 + 1
            r0[r1] = r2
            return
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected null but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r3.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String nextString() throws java.io.IOException {
            r4 = this;
            int r0 = r4.peeked
            if (r0 != 0) goto L8
            int r0 = r4.doPeek()
        L8:
            r1 = 10
            if (r0 != r1) goto L11
            java.lang.String r0 = r4.nextUnquotedValue()
            goto L52
        L11:
            r1 = 8
            if (r0 != r1) goto L1c
            r0 = 39
            java.lang.String r0 = r4.nextQuotedValue(r0)
            goto L52
        L1c:
            r1 = 9
            if (r0 != r1) goto L27
            r0 = 34
            java.lang.String r0 = r4.nextQuotedValue(r0)
            goto L52
        L27:
            r1 = 11
            if (r0 != r1) goto L31
            java.lang.String r0 = r4.peekedString
            r1 = 0
            r4.peekedString = r1
            goto L52
        L31:
            r1 = 15
            if (r0 != r1) goto L3c
            long r0 = r4.peekedLong
            java.lang.String r0 = java.lang.Long.toString(r0)
            goto L52
        L3c:
            r1 = 16
            if (r0 != r1) goto L62
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.buffer
            int r2 = r4.pos
            int r3 = r4.peekedNumberLength
            r0.<init>(r1, r2, r3)
            int r1 = r4.pos
            int r2 = r4.peekedNumberLength
            int r1 = r1 + r2
            r4.pos = r1
        L52:
            r1 = 0
            r4.peeked = r1
            int[] r1 = r4.pathIndices
            int r2 = r4.stackSize
            int r2 = r2 + (-1)
            r3 = r1[r2]
            int r3 = r3 + 1
            r1[r2] = r3
            return r0
        L62:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a string but was "
            r1.<init>(r2)
            com.google.gson.stream.JsonToken r2 = r4.peek()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r4.locationString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public com.google.gson.stream.JsonToken peek() throws java.io.IOException {
            r1 = this;
            int r0 = r1.peeked
            if (r0 != 0) goto L8
            int r0 = r1.doPeek()
        L8:
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L29;
                case 3: goto L26;
                case 4: goto L23;
                case 5: goto L20;
                case 6: goto L20;
                case 7: goto L1d;
                case 8: goto L1a;
                case 9: goto L1a;
                case 10: goto L1a;
                case 11: goto L1a;
                case 12: goto L17;
                case 13: goto L17;
                case 14: goto L17;
                case 15: goto L14;
                case 16: goto L14;
                case 17: goto L11;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L11:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_DOCUMENT
            return r0
        L14:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NUMBER
            return r0
        L17:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NAME
            return r0
        L1a:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.STRING
            return r0
        L1d:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.NULL
            return r0
        L20:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BOOLEAN
            return r0
        L23:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_ARRAY
            return r0
        L26:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
            return r0
        L29:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.END_OBJECT
            return r0
        L2c:
            com.google.gson.stream.JsonToken r0 = com.google.gson.stream.JsonToken.BEGIN_OBJECT
            return r0
    }

    public final void setLenient(boolean r1) {
            r0 = this;
            r0.lenient = r1
            return
    }

    public void skipValue() throws java.io.IOException {
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.peeked
            if (r2 != 0) goto La
            int r2 = r5.doPeek()
        La:
            r3 = 3
            r4 = 1
            if (r2 != r3) goto L14
            r5.push(r4)
        L11:
            int r1 = r1 + 1
            goto L64
        L14:
            if (r2 != r4) goto L1a
            r5.push(r3)
            goto L11
        L1a:
            r3 = 4
            if (r2 != r3) goto L25
            int r2 = r5.stackSize
            int r2 = r2 - r4
            r5.stackSize = r2
        L22:
            int r1 = r1 + (-1)
            goto L64
        L25:
            r3 = 2
            if (r2 != r3) goto L2e
            int r2 = r5.stackSize
            int r2 = r2 - r4
            r5.stackSize = r2
            goto L22
        L2e:
            r3 = 14
            if (r2 == r3) goto L61
            r3 = 10
            if (r2 != r3) goto L37
            goto L61
        L37:
            r3 = 8
            if (r2 == r3) goto L5b
            r3 = 12
            if (r2 != r3) goto L40
            goto L5b
        L40:
            r3 = 9
            if (r2 == r3) goto L55
            r3 = 13
            if (r2 != r3) goto L49
            goto L55
        L49:
            r3 = 16
            if (r2 != r3) goto L64
            int r2 = r5.pos
            int r3 = r5.peekedNumberLength
            int r2 = r2 + r3
            r5.pos = r2
            goto L64
        L55:
            r2 = 34
            r5.skipQuotedValue(r2)
            goto L64
        L5b:
            r2 = 39
            r5.skipQuotedValue(r2)
            goto L64
        L61:
            r5.skipUnquotedValue()
        L64:
            r5.peeked = r0
            if (r1 != 0) goto L2
            int[] r0 = r5.pathIndices
            int r1 = r5.stackSize
            int r2 = r1 + (-1)
            r3 = r0[r2]
            int r3 = r3 + r4
            r0[r2] = r3
            java.lang.String[] r0 = r5.pathNames
            int r1 = r1 - r4
            java.lang.String r2 = "null"
            r0[r1] = r2
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.locationString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
