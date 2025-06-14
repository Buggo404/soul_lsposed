package com.google.gson.stream;

/* loaded from: classes.dex */
public class JsonWriter implements java.io.Closeable, java.io.Flushable {
    private static final java.lang.String[] HTML_SAFE_REPLACEMENT_CHARS = null;
    private static final java.lang.String[] REPLACEMENT_CHARS = null;
    private static final java.util.regex.Pattern VALID_JSON_NUMBER_PATTERN = null;
    private java.lang.String deferredName;
    private boolean htmlSafe;
    private java.lang.String indent;
    private boolean lenient;
    private final java.io.Writer out;
    private java.lang.String separator;
    private boolean serializeNulls;
    private int[] stack;
    private int stackSize;

    static {
            java.lang.String r0 = "-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.gson.stream.JsonWriter.VALID_JSON_NUMBER_PATTERN = r0
            r0 = 128(0x80, float:1.794E-43)
            java.lang.String[] r0 = new java.lang.String[r0]
            com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS = r0
            r0 = 0
            r1 = r0
        L10:
            r2 = 31
            if (r1 > r2) goto L2a
            java.lang.String[] r2 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3[r0] = r4
            java.lang.String r4 = "\\u%04x"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
        L2a:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
            r1 = 34
            java.lang.String r2 = "\\\""
            r0[r1] = r2
            r1 = 92
            java.lang.String r2 = "\\\\"
            r0[r1] = r2
            r1 = 9
            java.lang.String r2 = "\\t"
            r0[r1] = r2
            r1 = 8
            java.lang.String r2 = "\\b"
            r0[r1] = r2
            r1 = 10
            java.lang.String r2 = "\\n"
            r0[r1] = r2
            r1 = 13
            java.lang.String r2 = "\\r"
            r0[r1] = r2
            r1 = 12
            java.lang.String r2 = "\\f"
            r0[r1] = r2
            java.lang.Object r0 = r0.clone()
            java.lang.String[] r0 = (java.lang.String[]) r0
            com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS = r0
            r1 = 60
            java.lang.String r2 = "\\u003c"
            r0[r1] = r2
            r1 = 62
            java.lang.String r2 = "\\u003e"
            r0[r1] = r2
            r1 = 38
            java.lang.String r2 = "\\u0026"
            r0[r1] = r2
            r1 = 61
            java.lang.String r2 = "\\u003d"
            r0[r1] = r2
            r1 = 39
            java.lang.String r2 = "\\u0027"
            r0[r1] = r2
            return
    }

    public JsonWriter(java.io.Writer r2) {
            r1 = this;
            r1.<init>()
            r0 = 32
            int[] r0 = new int[r0]
            r1.stack = r0
            r0 = 0
            r1.stackSize = r0
            r0 = 6
            r1.push(r0)
            java.lang.String r0 = ":"
            r1.separator = r0
            r0 = 1
            r1.serializeNulls = r0
            if (r2 == 0) goto L1c
            r1.out = r2
            return
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "out == null"
            r2.<init>(r0)
            throw r2
    }

    private void beforeName() throws java.io.IOException {
            r2 = this;
            int r0 = r2.peek()
            r1 = 5
            if (r0 != r1) goto Lf
            java.io.Writer r0 = r2.out
            r1 = 44
            r0.write(r1)
            goto L12
        Lf:
            r1 = 3
            if (r0 != r1) goto L1a
        L12:
            r2.newline()
            r0 = 4
            r2.replaceTop(r0)
            return
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
    }

    private void beforeValue() throws java.io.IOException {
            r3 = this;
            int r0 = r3.peek()
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L43
            if (r0 == r2) goto L38
            r1 = 4
            if (r0 == r1) goto L2c
            r1 = 6
            r2 = 7
            if (r0 == r1) goto L28
            if (r0 != r2) goto L20
            boolean r0 = r3.lenient
            if (r0 == 0) goto L18
            goto L28
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JSON must have only one top-level value."
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Nesting problem."
            r0.<init>(r1)
            throw r0
        L28:
            r3.replaceTop(r2)
            goto L49
        L2c:
            java.io.Writer r0 = r3.out
            java.lang.String r1 = r3.separator
            r0.append(r1)
            r0 = 5
            r3.replaceTop(r0)
            goto L49
        L38:
            java.io.Writer r0 = r3.out
            r1 = 44
            r0.append(r1)
            r3.newline()
            goto L49
        L43:
            r3.replaceTop(r2)
            r3.newline()
        L49:
            return
    }

    private com.google.gson.stream.JsonWriter close(int r2, int r3, char r4) throws java.io.IOException {
            r1 = this;
            int r0 = r1.peek()
            if (r0 == r3) goto L11
            if (r0 != r2) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Nesting problem."
            r2.<init>(r3)
            throw r2
        L11:
            java.lang.String r2 = r1.deferredName
            if (r2 != 0) goto L26
            int r2 = r1.stackSize
            int r2 = r2 + (-1)
            r1.stackSize = r2
            if (r0 != r3) goto L20
            r1.newline()
        L20:
            java.io.Writer r2 = r1.out
            r2.write(r4)
            return r1
        L26:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Dangling name: "
            r3.<init>(r4)
            java.lang.String r4 = r1.deferredName
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private static boolean isTrustedNumberType(java.lang.Class<? extends java.lang.Number> r1) {
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r0 = java.util.concurrent.atomic.AtomicInteger.class
            if (r1 == r0) goto L2b
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r0 = java.util.concurrent.atomic.AtomicLong.class
            if (r1 != r0) goto L29
            goto L2b
        L29:
            r1 = 0
            goto L2c
        L2b:
            r1 = 1
        L2c:
            return r1
    }

    private void newline() throws java.io.IOException {
            r4 = this;
            java.lang.String r0 = r4.indent
            if (r0 != 0) goto L5
            return
        L5:
            java.io.Writer r0 = r4.out
            r1 = 10
            r0.write(r1)
            int r0 = r4.stackSize
            r1 = 1
        Lf:
            if (r1 >= r0) goto L1b
            java.io.Writer r2 = r4.out
            java.lang.String r3 = r4.indent
            r2.write(r3)
            int r1 = r1 + 1
            goto Lf
        L1b:
            return
    }

    private com.google.gson.stream.JsonWriter open(int r1, char r2) throws java.io.IOException {
            r0 = this;
            r0.beforeValue()
            r0.push(r1)
            java.io.Writer r1 = r0.out
            r1.write(r2)
            return r0
    }

    private int peek() {
            r2 = this;
            int r0 = r2.stackSize
            if (r0 == 0) goto Lb
            int[] r1 = r2.stack
            int r0 = r0 + (-1)
            r0 = r1[r0]
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    private void push(int r4) {
            r3 = this;
            int r0 = r3.stackSize
            int[] r1 = r3.stack
            int r2 = r1.length
            if (r0 != r2) goto Lf
            int r0 = r0 * 2
            int[] r0 = java.util.Arrays.copyOf(r1, r0)
            r3.stack = r0
        Lf:
            int[] r0 = r3.stack
            int r1 = r3.stackSize
            int r2 = r1 + 1
            r3.stackSize = r2
            r0[r1] = r4
            return
    }

    private void replaceTop(int r3) {
            r2 = this;
            int[] r0 = r2.stack
            int r1 = r2.stackSize
            int r1 = r1 + (-1)
            r0[r1] = r3
            return
    }

    private void string(java.lang.String r9) throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.htmlSafe
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.HTML_SAFE_REPLACEMENT_CHARS
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.JsonWriter.REPLACEMENT_CHARS
        L9:
            java.io.Writer r1 = r8.out
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.out
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.out
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.out
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.out
            r9.write(r2)
            return
    }

    private void writeDeferredName() throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.deferredName
            if (r0 == 0) goto Lf
            r1.beforeName()
            java.lang.String r0 = r1.deferredName
            r1.string(r0)
            r0 = 0
            r1.deferredName = r0
        Lf:
            return
    }

    public com.google.gson.stream.JsonWriter beginArray() throws java.io.IOException {
            r2 = this;
            r2.writeDeferredName()
            r0 = 1
            r1 = 91
            com.google.gson.stream.JsonWriter r0 = r2.open(r0, r1)
            return r0
    }

    public com.google.gson.stream.JsonWriter beginObject() throws java.io.IOException {
            r2 = this;
            r2.writeDeferredName()
            r0 = 3
            r1 = 123(0x7b, float:1.72E-43)
            com.google.gson.stream.JsonWriter r0 = r2.open(r0, r1)
            return r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            java.io.Writer r0 = r3.out
            r0.close()
            int r0 = r3.stackSize
            r1 = 1
            if (r0 > r1) goto L18
            if (r0 != r1) goto L14
            int[] r2 = r3.stack
            int r0 = r0 - r1
            r0 = r2[r0]
            r1 = 7
            if (r0 != r1) goto L18
        L14:
            r0 = 0
            r3.stackSize = r0
            return
        L18:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Incomplete document"
            r0.<init>(r1)
            throw r0
    }

    public com.google.gson.stream.JsonWriter endArray() throws java.io.IOException {
            r3 = this;
            r0 = 2
            r1 = 93
            r2 = 1
            com.google.gson.stream.JsonWriter r0 = r3.close(r2, r0, r1)
            return r0
    }

    public com.google.gson.stream.JsonWriter endObject() throws java.io.IOException {
            r3 = this;
            r0 = 5
            r1 = 125(0x7d, float:1.75E-43)
            r2 = 3
            com.google.gson.stream.JsonWriter r0 = r3.close(r2, r0, r1)
            return r0
    }

    public void flush() throws java.io.IOException {
            r2 = this;
            int r0 = r2.stackSize
            if (r0 == 0) goto La
            java.io.Writer r0 = r2.out
            r0.flush()
            return
        La:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "JsonWriter is closed."
            r0.<init>(r1)
            throw r0
    }

    public final boolean getSerializeNulls() {
            r1 = this;
            boolean r0 = r1.serializeNulls
            return r0
    }

    public final boolean isHtmlSafe() {
            r1 = this;
            boolean r0 = r1.htmlSafe
            return r0
    }

    public boolean isLenient() {
            r1 = this;
            boolean r0 = r1.lenient
            return r0
    }

    public com.google.gson.stream.JsonWriter jsonValue(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            if (r2 != 0) goto L7
            com.google.gson.stream.JsonWriter r2 = r1.nullValue()
            return r2
        L7:
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            r0.append(r2)
            return r1
    }

    public com.google.gson.stream.JsonWriter name(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            if (r2 == 0) goto L1b
            java.lang.String r0 = r1.deferredName
            if (r0 != 0) goto L15
            int r0 = r1.stackSize
            if (r0 == 0) goto Ld
            r1.deferredName = r2
            return r1
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonWriter is closed."
            r2.<init>(r0)
            throw r2
        L15:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L1b:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "name == null"
            r2.<init>(r0)
            throw r2
    }

    public com.google.gson.stream.JsonWriter nullValue() throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = r2.deferredName
            if (r0 == 0) goto L10
            boolean r0 = r2.serializeNulls
            if (r0 == 0) goto Lc
            r2.writeDeferredName()
            goto L10
        Lc:
            r0 = 0
            r2.deferredName = r0
            return r2
        L10:
            r2.beforeValue()
            java.io.Writer r0 = r2.out
            java.lang.String r1 = "null"
            r0.write(r1)
            return r2
    }

    public final void setHtmlSafe(boolean r1) {
            r0 = this;
            r0.htmlSafe = r1
            return
    }

    public final void setIndent(java.lang.String r2) {
            r1 = this;
            int r0 = r2.length()
            if (r0 != 0) goto Le
            r2 = 0
            r1.indent = r2
            java.lang.String r2 = ":"
            r1.separator = r2
            goto L14
        Le:
            r1.indent = r2
            java.lang.String r2 = ": "
            r1.separator = r2
        L14:
            return
    }

    public final void setLenient(boolean r1) {
            r0 = this;
            r0.lenient = r1
            return
    }

    public final void setSerializeNulls(boolean r1) {
            r0 = this;
            r0.serializeNulls = r1
            return
    }

    public com.google.gson.stream.JsonWriter value(double r4) throws java.io.IOException {
            r3 = this;
            r3.writeDeferredName()
            boolean r0 = r3.lenient
            if (r0 != 0) goto L29
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L14
            boolean r0 = java.lang.Double.isInfinite(r4)
            if (r0 != 0) goto L14
            goto L29
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Numeric values must be finite, but was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L29:
            r3.beforeValue()
            java.io.Writer r0 = r3.out
            java.lang.String r4 = java.lang.Double.toString(r4)
            r0.append(r4)
            return r3
    }

    public com.google.gson.stream.JsonWriter value(float r4) throws java.io.IOException {
            r3 = this;
            r3.writeDeferredName()
            boolean r0 = r3.lenient
            if (r0 != 0) goto L29
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 != 0) goto L14
            boolean r0 = java.lang.Float.isInfinite(r4)
            if (r0 != 0) goto L14
            goto L29
        L14:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Numeric values must be finite, but was "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L29:
            r3.beforeValue()
            java.io.Writer r0 = r3.out
            java.lang.String r4 = java.lang.Float.toString(r4)
            r0.append(r4)
            return r3
    }

    public com.google.gson.stream.JsonWriter value(long r2) throws java.io.IOException {
            r1 = this;
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            java.lang.String r2 = java.lang.Long.toString(r2)
            r0.write(r2)
            return r1
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Boolean r2) throws java.io.IOException {
            r1 = this;
            if (r2 != 0) goto L7
            com.google.gson.stream.JsonWriter r2 = r1.nullValue()
            return r2
        L7:
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L18
            java.lang.String r2 = "true"
            goto L1a
        L18:
            java.lang.String r2 = "false"
        L1a:
            r0.write(r2)
            return r1
    }

    public com.google.gson.stream.JsonWriter value(java.lang.Number r5) throws java.io.IOException {
            r4 = this;
            if (r5 != 0) goto L7
            com.google.gson.stream.JsonWriter r5 = r4.nullValue()
            return r5
        L7:
            r4.writeDeferredName()
            java.lang.String r0 = r5.toString()
            java.lang.String r1 = "-Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "Infinity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5d
            java.lang.String r1 = "NaN"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L27
            goto L5d
        L27:
            java.lang.Class r5 = r5.getClass()
            boolean r1 = isTrustedNumberType(r5)
            if (r1 != 0) goto L61
            java.util.regex.Pattern r1 = com.google.gson.stream.JsonWriter.VALID_JSON_NUMBER_PATTERN
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L3e
            goto L61
        L3e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "String created by "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = " is not a valid JSON number: "
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L5d:
            boolean r5 = r4.lenient
            if (r5 == 0) goto L6a
        L61:
            r4.beforeValue()
            java.io.Writer r5 = r4.out
            r5.append(r0)
            return r4
        L6a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Numeric values must be finite, but was "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public com.google.gson.stream.JsonWriter value(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            if (r1 != 0) goto L7
            com.google.gson.stream.JsonWriter r1 = r0.nullValue()
            return r1
        L7:
            r0.writeDeferredName()
            r0.beforeValue()
            r0.string(r1)
            return r0
    }

    public com.google.gson.stream.JsonWriter value(boolean r2) throws java.io.IOException {
            r1 = this;
            r1.writeDeferredName()
            r1.beforeValue()
            java.io.Writer r0 = r1.out
            if (r2 == 0) goto Ld
            java.lang.String r2 = "true"
            goto Lf
        Ld:
            java.lang.String r2 = "false"
        Lf:
            r0.write(r2)
            return r1
    }
}
