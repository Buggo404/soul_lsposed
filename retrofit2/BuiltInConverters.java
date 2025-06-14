package retrofit2;

/* loaded from: classes.dex */
final class BuiltInConverters extends retrofit2.Converter.Factory {
    private boolean checkForKotlinUnit;

    static final class BufferingResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, okhttp3.ResponseBody> {
        static final retrofit2.BuiltInConverters.BufferingResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.BuiltInConverters$BufferingResponseBodyConverter r0 = new retrofit2.BuiltInConverters$BufferingResponseBodyConverter
                r0.<init>()
                retrofit2.BuiltInConverters.BufferingResponseBodyConverter.INSTANCE = r0
                return
        }

        BufferingResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ okhttp3.ResponseBody convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                okhttp3.ResponseBody r1 = r0.convert2(r1)
                return r1
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public okhttp3.ResponseBody convert2(okhttp3.ResponseBody r2) throws java.io.IOException {
                r1 = this;
                okhttp3.ResponseBody r0 = retrofit2.Utils.buffer(r2)     // Catch: java.lang.Throwable -> L8
                r2.close()
                return r0
            L8:
                r0 = move-exception
                r2.close()
                throw r0
        }
    }

    static final class RequestBodyConverter implements retrofit2.Converter<okhttp3.RequestBody, okhttp3.RequestBody> {
        static final retrofit2.BuiltInConverters.RequestBodyConverter INSTANCE = null;

        static {
                retrofit2.BuiltInConverters$RequestBodyConverter r0 = new retrofit2.BuiltInConverters$RequestBodyConverter
                r0.<init>()
                retrofit2.BuiltInConverters.RequestBodyConverter.INSTANCE = r0
                return
        }

        RequestBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ okhttp3.RequestBody convert(okhttp3.RequestBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.RequestBody r1 = (okhttp3.RequestBody) r1
                okhttp3.RequestBody r1 = r0.convert2(r1)
                return r1
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public okhttp3.RequestBody convert2(okhttp3.RequestBody r1) {
                r0 = this;
                return r1
        }
    }

    static final class StreamingResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, okhttp3.ResponseBody> {
        static final retrofit2.BuiltInConverters.StreamingResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.BuiltInConverters$StreamingResponseBodyConverter r0 = new retrofit2.BuiltInConverters$StreamingResponseBodyConverter
                r0.<init>()
                retrofit2.BuiltInConverters.StreamingResponseBodyConverter.INSTANCE = r0
                return
        }

        StreamingResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ okhttp3.ResponseBody convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                okhttp3.ResponseBody r1 = r0.convert2(r1)
                return r1
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public okhttp3.ResponseBody convert2(okhttp3.ResponseBody r1) {
                r0 = this;
                return r1
        }
    }

    static final class ToStringConverter implements retrofit2.Converter<java.lang.Object, java.lang.String> {
        static final retrofit2.BuiltInConverters.ToStringConverter INSTANCE = null;

        static {
                retrofit2.BuiltInConverters$ToStringConverter r0 = new retrofit2.BuiltInConverters$ToStringConverter
                r0.<init>()
                retrofit2.BuiltInConverters.ToStringConverter.INSTANCE = r0
                return
        }

        ToStringConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.String convert(java.lang.Object r1) throws java.io.IOException {
                r0 = this;
                java.lang.String r1 = r0.convert2(r1)
                return r1
        }

        @Override // retrofit2.Converter
        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.String convert2(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                return r1
        }
    }

    static final class UnitResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, kotlin.Unit> {
        static final retrofit2.BuiltInConverters.UnitResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.BuiltInConverters$UnitResponseBodyConverter r0 = new retrofit2.BuiltInConverters$UnitResponseBodyConverter
                r0.<init>()
                retrofit2.BuiltInConverters.UnitResponseBodyConverter.INSTANCE = r0
                return
        }

        UnitResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ kotlin.Unit convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                kotlin.Unit r1 = r0.convert2(r1)
                return r1
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public kotlin.Unit convert2(okhttp3.ResponseBody r1) {
                r0 = this;
                r1.close()
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    static final class VoidResponseBodyConverter implements retrofit2.Converter<okhttp3.ResponseBody, java.lang.Void> {
        static final retrofit2.BuiltInConverters.VoidResponseBodyConverter INSTANCE = null;

        static {
                retrofit2.BuiltInConverters$VoidResponseBodyConverter r0 = new retrofit2.BuiltInConverters$VoidResponseBodyConverter
                r0.<init>()
                retrofit2.BuiltInConverters.VoidResponseBodyConverter.INSTANCE = r0
                return
        }

        VoidResponseBodyConverter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.Converter
        public /* bridge */ /* synthetic */ java.lang.Void convert(okhttp3.ResponseBody r1) throws java.io.IOException {
                r0 = this;
                okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
                java.lang.Void r1 = r0.convert2(r1)
                return r1
        }

        /* renamed from: convert, reason: avoid collision after fix types in other method */
        public java.lang.Void convert2(okhttp3.ResponseBody r1) {
                r0 = this;
                r1.close()
                r1 = 0
                return r1
        }
    }

    BuiltInConverters() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.checkForKotlinUnit = r0
            return
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<?, okhttp3.RequestBody> requestBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, java.lang.annotation.Annotation[] r3, retrofit2.Retrofit r4) {
            r0 = this;
            java.lang.Class<okhttp3.RequestBody> r2 = okhttp3.RequestBody.class
            java.lang.Class r1 = retrofit2.Utils.getRawType(r1)
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto Lf
            retrofit2.BuiltInConverters$RequestBodyConverter r1 = retrofit2.BuiltInConverters.RequestBodyConverter.INSTANCE
            return r1
        Lf:
            r1 = 0
            return r1
    }

    @Override // retrofit2.Converter.Factory
    @javax.annotation.Nullable
    public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(java.lang.reflect.Type r1, java.lang.annotation.Annotation[] r2, retrofit2.Retrofit r3) {
            r0 = this;
            java.lang.Class<okhttp3.ResponseBody> r3 = okhttp3.ResponseBody.class
            if (r1 != r3) goto L12
            java.lang.Class<retrofit2.http.Streaming> r1 = retrofit2.http.Streaming.class
            boolean r1 = retrofit2.Utils.isAnnotationPresent(r2, r1)
            if (r1 == 0) goto Lf
            retrofit2.BuiltInConverters$StreamingResponseBodyConverter r1 = retrofit2.BuiltInConverters.StreamingResponseBodyConverter.INSTANCE
            goto L11
        Lf:
            retrofit2.BuiltInConverters$BufferingResponseBodyConverter r1 = retrofit2.BuiltInConverters.BufferingResponseBodyConverter.INSTANCE
        L11:
            return r1
        L12:
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            if (r1 != r2) goto L19
            retrofit2.BuiltInConverters$VoidResponseBodyConverter r1 = retrofit2.BuiltInConverters.VoidResponseBodyConverter.INSTANCE
            return r1
        L19:
            boolean r2 = r0.checkForKotlinUnit
            if (r2 == 0) goto L27
            java.lang.Class<kotlin.Unit> r2 = kotlin.Unit.class
            if (r1 != r2) goto L27
            retrofit2.BuiltInConverters$UnitResponseBodyConverter r1 = retrofit2.BuiltInConverters.UnitResponseBodyConverter.INSTANCE     // Catch: java.lang.NoClassDefFoundError -> L24
            return r1
        L24:
            r1 = 0
            r0.checkForKotlinUnit = r1
        L27:
            r1 = 0
            return r1
    }
}
