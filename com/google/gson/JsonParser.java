package com.google.gson;

/* loaded from: classes.dex */
public final class JsonParser {
    @java.lang.Deprecated
    public JsonParser() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.gson.JsonElement parseReader(com.google.gson.stream.JsonReader r6) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            java.lang.String r0 = " to Json"
            java.lang.String r1 = "Failed parsing JSON source: "
            boolean r2 = r6.isLenient()
            r3 = 1
            r6.setLenient(r3)
            com.google.gson.JsonElement r0 = com.google.gson.internal.Streams.parse(r6)     // Catch: java.lang.Throwable -> L14 java.lang.OutOfMemoryError -> L16 java.lang.StackOverflowError -> L2e
            r6.setLenient(r2)
            return r0
        L14:
            r0 = move-exception
            goto L46
        L16:
            r3 = move-exception
            com.google.gson.JsonParseException r4 = new com.google.gson.JsonParseException     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r1 = r5.append(r6)     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L14
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L2e:
            r3 = move-exception
            com.google.gson.JsonParseException r4 = new com.google.gson.JsonParseException     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r1 = r5.append(r6)     // Catch: java.lang.Throwable -> L14
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L14
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L14
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L14
            throw r4     // Catch: java.lang.Throwable -> L14
        L46:
            r6.setLenient(r2)
            throw r0
    }

    public static com.google.gson.JsonElement parseReader(java.io.Reader r2) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            r0.<init>(r2)     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            com.google.gson.JsonElement r2 = parseReader(r0)     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            boolean r1 = r2.isJsonNull()     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            if (r1 != 0) goto L20
            com.google.gson.stream.JsonToken r0 = r0.peek()     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            if (r0 != r1) goto L18
            goto L20
        L18:
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            java.lang.String r0 = "Did not consume the entire document."
            r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
            throw r2     // Catch: java.lang.NumberFormatException -> L21 java.io.IOException -> L28 com.google.gson.stream.MalformedJsonException -> L2f
        L20:
            return r2
        L21:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
        L28:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>(r2)
            throw r0
        L2f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>(r2)
            throw r0
    }

    public static com.google.gson.JsonElement parseString(java.lang.String r1) throws com.google.gson.JsonSyntaxException {
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r1)
            com.google.gson.JsonElement r1 = parseReader(r0)
            return r1
    }

    @java.lang.Deprecated
    public com.google.gson.JsonElement parse(com.google.gson.stream.JsonReader r1) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.JsonElement r1 = parseReader(r1)
            return r1
    }

    @java.lang.Deprecated
    public com.google.gson.JsonElement parse(java.io.Reader r1) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.JsonElement r1 = parseReader(r1)
            return r1
    }

    @java.lang.Deprecated
    public com.google.gson.JsonElement parse(java.lang.String r1) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.JsonElement r1 = parseString(r1)
            return r1
    }
}
