package retrofit2.converter.gson;

/* loaded from: classes.dex */
public final class GsonConverterFactory extends retrofit2.Converter.Factory {
    private final com.google.gson.Gson gson;

    private GsonConverterFactory(com.google.gson.Gson r1) {
            r0 = this;
            r0.<init>()
            r0.gson = r1
            return
    }

    public static retrofit2.converter.gson.GsonConverterFactory create() {
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            retrofit2.converter.gson.GsonConverterFactory r0 = create(r0)
            return r0
    }

    public static retrofit2.converter.gson.GsonConverterFactory create(com.google.gson.Gson r1) {
            if (r1 == 0) goto L8
            retrofit2.converter.gson.GsonConverterFactory r0 = new retrofit2.converter.gson.GsonConverterFactory
            r0.<init>(r1)
            return r0
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "gson == null"
            r1.<init>(r0)
            throw r1
    }

    @Override // retrofit2.Converter.Factory
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, retrofit2.Retrofit r4) {
            r0 = this;
            com.google.gson.Gson r2 = r0.gson
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r1 = r2.getAdapter(r1)
            retrofit2.converter.gson.GsonRequestBodyConverter r2 = new retrofit2.converter.gson.GsonRequestBodyConverter
            com.google.gson.Gson r3 = r0.gson
            r2.<init>(r3, r1)
            return r2
    }

    @Override // retrofit2.Converter.Factory
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3) {
            r0 = this;
            com.google.gson.Gson r2 = r0.gson
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r1 = r2.getAdapter(r1)
            retrofit2.converter.gson.GsonResponseBodyConverter r2 = new retrofit2.converter.gson.GsonResponseBodyConverter
            com.google.gson.Gson r3 = r0.gson
            r2.<init>(r3, r1)
            return r2
    }
}
