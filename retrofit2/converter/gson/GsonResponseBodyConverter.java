package retrofit2.converter.gson;

/* loaded from: classes.dex */
final class GsonResponseBodyConverter<T> implements retrofit2.Converter<okhttp3.ResponseBody, T> {
    private final com.google.gson.TypeAdapter<T> adapter;
    private final com.google.gson.Gson gson;

    GsonResponseBodyConverter(com.google.gson.Gson r1, com.google.gson.TypeAdapter<T> r2) {
            r0 = this;
            r0.<init>()
            r0.gson = r1
            r0.adapter = r2
            return
    }

    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ java.lang.Object convert(okhttp3.ResponseBody r1) throws java.io.IOException {
            r0 = this;
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
            java.lang.Object r1 = r0.convert2(r1)
            return r1
    }

    /* renamed from: convert, reason: avoid collision after fix types in other method */
    public T convert2(okhttp3.ResponseBody r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.Gson r0 = r3.gson
            java.io.Reader r1 = r4.charStream()
            com.google.gson.stream.JsonReader r0 = r0.newJsonReader(r1)
            com.google.gson.TypeAdapter<T> r1 = r3.adapter     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r1.read(r0)     // Catch: java.lang.Throwable -> L24
            com.google.gson.stream.JsonToken r0 = r0.peek()     // Catch: java.lang.Throwable -> L24
            com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.lang.Throwable -> L24
            if (r0 != r2) goto L1c
            r4.close()
            return r1
        L1c:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "JSON document was not fully consumed."
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L24
            throw r0     // Catch: java.lang.Throwable -> L24
        L24:
            r0 = move-exception
            r4.close()
            throw r0
    }
}
