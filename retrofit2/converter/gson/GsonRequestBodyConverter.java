package retrofit2.converter.gson;

/* loaded from: classes.dex */
final class GsonRequestBodyConverter<T> implements retrofit2.Converter<T, okhttp3.RequestBody> {
    private static final okhttp3.MediaType MEDIA_TYPE = null;
    private static final java.nio.charset.Charset UTF_8 = null;
    private final com.google.gson.TypeAdapter<T> adapter;
    private final com.google.gson.Gson gson;

    static {
            java.lang.String r0 = "application/json; charset=UTF-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.get(r0)
            retrofit2.converter.gson.GsonRequestBodyConverter.MEDIA_TYPE = r0
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            retrofit2.converter.gson.GsonRequestBodyConverter.UTF_8 = r0
            return
    }

    GsonRequestBodyConverter(com.google.gson.Gson r1, com.google.gson.TypeAdapter<T> r2) {
            r0 = this;
            r0.<init>()
            r0.gson = r1
            r0.adapter = r2
            return
    }

    @Override // retrofit2.Converter
    public /* bridge */ /* synthetic */ okhttp3.RequestBody convert(java.lang.Object r1) throws java.io.IOException {
            r0 = this;
            okhttp3.RequestBody r1 = r0.convert2(r1)
            return r1
    }

    @Override // retrofit2.Converter
    /* renamed from: convert, reason: avoid collision after fix types in other method */
    public okhttp3.RequestBody convert2(T r5) throws java.io.IOException {
            r4 = this;
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.OutputStream r2 = r0.outputStream()
            java.nio.charset.Charset r3 = retrofit2.converter.gson.GsonRequestBodyConverter.UTF_8
            r1.<init>(r2, r3)
            com.google.gson.Gson r2 = r4.gson
            com.google.gson.stream.JsonWriter r1 = r2.newJsonWriter(r1)
            com.google.gson.TypeAdapter<T> r2 = r4.adapter
            r2.write(r1, r5)
            r1.close()
            okhttp3.MediaType r5 = retrofit2.converter.gson.GsonRequestBodyConverter.MEDIA_TYPE
            okio.ByteString r0 = r0.readByteString()
            okhttp3.RequestBody r5 = okhttp3.RequestBody.create(r5, r0)
            return r5
    }
}
