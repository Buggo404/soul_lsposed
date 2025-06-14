package com.google.gson;

/* loaded from: classes.dex */
public final class JsonStreamParser implements java.util.Iterator<com.google.gson.JsonElement> {
    private final java.lang.Object lock;
    private final com.google.gson.stream.JsonReader parser;

    public JsonStreamParser(java.io.Reader r2) {
            r1 = this;
            r1.<init>()
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader
            r0.<init>(r2)
            r1.parser = r0
            r2 = 1
            r0.setLenient(r2)
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.lock = r2
            return
    }

    public JsonStreamParser(java.lang.String r2) {
            r1 = this;
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r3 = this;
            java.lang.Object r0 = r3.lock
            monitor-enter(r0)
            com.google.gson.stream.JsonReader r1 = r3.parser     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 com.google.gson.stream.MalformedJsonException -> L1b
            com.google.gson.stream.JsonToken r1 = r1.peek()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 com.google.gson.stream.MalformedJsonException -> L1b
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L14 com.google.gson.stream.MalformedJsonException -> L1b
            if (r1 == r2) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            goto L22
        L14:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L12
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L1b:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L12
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L22:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public com.google.gson.JsonElement next() throws com.google.gson.JsonParseException {
            r3 = this;
            java.lang.String r0 = "Failed parsing JSON source to Json"
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            com.google.gson.stream.JsonReader r1 = r3.parser     // Catch: com.google.gson.JsonParseException -> Lf java.lang.OutOfMemoryError -> L1e java.lang.StackOverflowError -> L25
            com.google.gson.JsonElement r0 = com.google.gson.internal.Streams.parse(r1)     // Catch: com.google.gson.JsonParseException -> Lf java.lang.OutOfMemoryError -> L1e java.lang.StackOverflowError -> L25
            return r0
        Lf:
            r0 = move-exception
            java.lang.Throwable r1 = r0.getCause()
            boolean r1 = r1 instanceof java.io.EOFException
            if (r1 == 0) goto L1d
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
        L1d:
            throw r0
        L1e:
            r1 = move-exception
            com.google.gson.JsonParseException r2 = new com.google.gson.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L25:
            r1 = move-exception
            com.google.gson.JsonParseException r2 = new com.google.gson.JsonParseException
            r2.<init>(r0, r1)
            throw r2
        L2c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ com.google.gson.JsonElement next() {
            r1 = this;
            com.google.gson.JsonElement r0 = r1.next()
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
