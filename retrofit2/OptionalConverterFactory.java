package retrofit2;

/* loaded from: classes.dex */
final class OptionalConverterFactory extends retrofit2.Converter.Factory {
    static final retrofit2.Converter.Factory INSTANCE = null;

    static final class OptionalConverter<T> implements retrofit2.Converter<okhttp3.ResponseBody, java.util.Optional<T>> {
        final retrofit2.Converter<okhttp3.ResponseBody, T> delegate;

        OptionalConverter(retrofit2.Converter<okhttp3.ResponseBody, T> r1) {
                r0 = this;
                r0.<init>()
                r0.delegate = r1
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Object convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.util.Optional r1 = r0.convert2(r1)
                return r1
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public java.util.Optional<T> convert2(okhttp3.ResponseBody r2) throws java.io.IOException {
                r1 = this;
                retrofit2.Converter<okhttp3.ResponseBody, T> r0 = r1.delegate
                java.lang.Object r2 = r0.convert(r2)
                java.util.Optional r2 = java.util.Optional.ofNullable(r2)
                return r2
        }
    }

    static {
            retrofit2.OptionalConverterFactory r0 = new retrofit2.OptionalConverterFactory
            r0.<init>()
            retrofit2.OptionalConverterFactory.INSTANCE = r0
            return
    }

    OptionalConverterFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r3, java.lang.annotation.Annotation[] r4, retrofit2.Retrofit r5) {
            r2 = this;
            java.lang.Class r0 = getRawType(r3)
            java.lang.Class<java.util.Optional> r1 = java.util.Optional.class
            if (r0 == r1) goto La
            r3 = 0
            return r3
        La:
            r0 = 0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = getParameterUpperBound(r0, r3)
            retrofit2.Converter r3 = r5.responseBodyConverter(r3, r4)
            retrofit2.OptionalConverterFactory$OptionalConverter r4 = new retrofit2.OptionalConverterFactory$OptionalConverter
            r4.<init>(r3)
            return r4
    }
}
