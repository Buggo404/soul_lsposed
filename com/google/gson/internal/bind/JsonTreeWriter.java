package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class JsonTreeWriter extends com.google.gson.stream.JsonWriter {
    private static final com.google.gson.JsonPrimitive SENTINEL_CLOSED = null;
    private static final java.io.Writer UNWRITABLE_WRITER = null;
    private java.lang.String pendingName;
    private com.google.gson.JsonElement product;
    private final java.util.List<com.google.gson.JsonElement> stack;


    static {
            com.google.gson.internal.bind.JsonTreeWriter$1 r0 = new com.google.gson.internal.bind.JsonTreeWriter$1
            r0.<init>()
            com.google.gson.internal.bind.JsonTreeWriter.UNWRITABLE_WRITER = r0
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            java.lang.String r1 = "closed"
            r0.<init>(r1)
            com.google.gson.internal.bind.JsonTreeWriter.SENTINEL_CLOSED = r0
            return
    }

    public JsonTreeWriter() {
            r1 = this;
            java.io.Writer r0 = com.google.gson.internal.bind.JsonTreeWriter.UNWRITABLE_WRITER
            r1.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.stack = r0
            com.google.gson.JsonNull r0 = com.google.gson.JsonNull.INSTANCE
            r1.product = r0
            return
    }

    private com.google.gson.JsonElement peek() {
            r2 = this;
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            return r0
    }

    private void put(com.google.gson.JsonElement r3) {
            r2 = this;
            java.lang.String r0 = r2.pendingName
            if (r0 == 0) goto L1f
            boolean r0 = r3.isJsonNull()
            if (r0 == 0) goto L10
            boolean r0 = r2.getSerializeNulls()
            if (r0 == 0) goto L1b
        L10:
            com.google.gson.JsonElement r0 = r2.peek()
            com.google.gson.JsonObject r0 = (com.google.gson.JsonObject) r0
            java.lang.String r1 = r2.pendingName
            r0.add(r1, r3)
        L1b:
            r3 = 0
            r2.pendingName = r3
            goto L37
        L1f:
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2a
            r2.product = r3
            goto L37
        L2a:
            com.google.gson.JsonElement r0 = r2.peek()
            boolean r1 = r0 instanceof com.google.gson.JsonArray
            if (r1 == 0) goto L38
            com.google.gson.JsonArray r0 = (com.google.gson.JsonArray) r0
            r0.add(r3)
        L37:
            return
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter beginArray() throws java.io.IOException {
            r2 = this;
            com.google.gson.JsonArray r0 = new com.google.gson.JsonArray
            r0.<init>()
            r2.put(r0)
            java.util.List<com.google.gson.JsonElement> r1 = r2.stack
            r1.add(r0)
            return r2
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter beginObject() throws java.io.IOException {
            r2 = this;
            com.google.gson.JsonObject r0 = new com.google.gson.JsonObject
            r0.<init>()
            r2.put(r0)
            java.util.List<com.google.gson.JsonElement> r1 = r2.stack
            r1.add(r0)
            return r2
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            com.google.gson.JsonPrimitive r1 = com.google.gson.internal.bind.JsonTreeWriter.SENTINEL_CLOSED
            r0.add(r1)
            return
        L10:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Incomplete document"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter endArray() throws java.io.IOException {
            r2 = this;
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.pendingName
            if (r0 != 0) goto L26
            com.google.gson.JsonElement r0 = r2.peek()
            boolean r0 = r0 instanceof com.google.gson.JsonArray
            if (r0 == 0) goto L20
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return r2
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter endObject() throws java.io.IOException {
            r2 = this;
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L26
            java.lang.String r0 = r2.pendingName
            if (r0 != 0) goto L26
            com.google.gson.JsonElement r0 = r2.peek()
            boolean r0 = r0 instanceof com.google.gson.JsonObject
            if (r0 == 0) goto L20
            java.util.List<com.google.gson.JsonElement> r0 = r2.stack
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return r2
        L20:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public void flush() throws java.io.IOException {
            r0 = this;
            return
    }

    public com.google.gson.JsonElement get() {
            r3 = this;
            java.util.List<com.google.gson.JsonElement> r0 = r3.stack
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            com.google.gson.JsonElement r0 = r3.product
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected one JSON element but was "
            r1.<init>(r2)
            java.util.List<com.google.gson.JsonElement> r2 = r3.stack
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter name(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            if (r2 == 0) goto L25
            java.util.List<com.google.gson.JsonElement> r0 = r1.stack
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            java.lang.String r0 = r1.pendingName
            if (r0 != 0) goto L1f
            com.google.gson.JsonElement r0 = r1.peek()
            boolean r0 = r0 instanceof com.google.gson.JsonObject
            if (r0 == 0) goto L19
            r1.pendingName = r2
            return r1
        L19:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L1f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L25:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "name == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter nullValue() throws java.io.IOException {
            r1 = this;
            com.google.gson.JsonNull r0 = com.google.gson.JsonNull.INSTANCE
            r1.put(r0)
            return r1
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter value(double r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.isLenient()
            if (r0 != 0) goto L28
            boolean r0 = java.lang.Double.isNaN(r4)
            if (r0 != 0) goto L13
            boolean r0 = java.lang.Double.isInfinite(r4)
            if (r0 != 0) goto L13
            goto L28
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON forbids NaN and infinities: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L28:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r0.<init>(r4)
            r3.put(r0)
            return r3
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter value(float r4) throws java.io.IOException {
            r3 = this;
            boolean r0 = r3.isLenient()
            if (r0 != 0) goto L28
            boolean r0 = java.lang.Float.isNaN(r4)
            if (r0 != 0) goto L13
            boolean r0 = java.lang.Float.isInfinite(r4)
            if (r0 != 0) goto L13
            goto L28
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON forbids NaN and infinities: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L28:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r0.<init>(r4)
            r3.put(r0)
            return r3
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter value(long r2) throws java.io.IOException {
            r1 = this;
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.<init>(r2)
            r1.put(r0)
            return r1
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter value(java.lang.Boolean r2) throws java.io.IOException {
            r1 = this;
            if (r2 != 0) goto L7
            com.google.gson.stream.JsonWriter r2 = r1.nullValue()
            return r2
        L7:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            r0.<init>(r2)
            r1.put(r0)
            return r1
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter value(java.lang.Number r4) throws java.io.IOException {
            r3 = this;
            if (r4 != 0) goto L7
            com.google.gson.stream.JsonWriter r4 = r3.nullValue()
            return r4
        L7:
            boolean r0 = r3.isLenient()
            if (r0 != 0) goto L33
            double r0 = r4.doubleValue()
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L1e
            boolean r0 = java.lang.Double.isInfinite(r0)
            if (r0 != 0) goto L1e
            goto L33
        L1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "JSON forbids NaN and infinities: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L33:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            r0.<init>(r4)
            r3.put(r0)
            return r3
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter value(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            if (r2 != 0) goto L7
            com.google.gson.stream.JsonWriter r2 = r1.nullValue()
            return r2
        L7:
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            r0.<init>(r2)
            r1.put(r0)
            return r1
    }

    @Override // com.google.gson.stream.JsonWriter
    public com.google.gson.stream.JsonWriter value(boolean r2) throws java.io.IOException {
            r1 = this;
            com.google.gson.JsonPrimitive r0 = new com.google.gson.JsonPrimitive
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.<init>(r2)
            r1.put(r0)
            return r1
    }
}
