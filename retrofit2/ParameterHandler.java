package retrofit2;

/* loaded from: classes.dex */
abstract class ParameterHandler<T> {



    static final class Body<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, okhttp3.RequestBody> converter;
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f637p;

        Body(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, okhttp3.RequestBody> r3) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f637p = r2
                r0.converter = r3
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r6, @javax.annotation.Nullable T r7) {
                r5 = this;
                r0 = 0
                if (r7 == 0) goto L30
                retrofit2.Converter<T, okhttp3.RequestBody> r1 = r5.converter     // Catch: java.io.IOException -> Lf
                java.lang.Object r1 = r1.convert(r7)     // Catch: java.io.IOException -> Lf
                okhttp3.RequestBody r1 = (okhttp3.RequestBody) r1     // Catch: java.io.IOException -> Lf
                r6.setBody(r1)
                return
            Lf:
                r6 = move-exception
                java.lang.reflect.Method r1 = r5.method
                int r2 = r5.f637p
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unable to convert "
                r3.<init>(r4)
                java.lang.StringBuilder r7 = r3.append(r7)
                java.lang.String r3 = " to RequestBody"
                java.lang.StringBuilder r7 = r7.append(r3)
                java.lang.String r7 = r7.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r1, r6, r2, r7, r0)
                throw r6
            L30:
                java.lang.reflect.Method r6 = r5.method
                int r7 = r5.f637p
                java.lang.String r1 = "Body parameter value must not be null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r6 = retrofit2.Utils.parameterError(r6, r7, r1, r0)
                throw r6
        }
    }

    static final class Field<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Field(java.lang.String r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.name = r2
                r1.valueConverter = r3
                r1.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r2.valueConverter
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r2.name
                boolean r1 = r2.encoded
                r3.addFormField(r0, r4, r1)
                return
        }
    }

    static final class FieldMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean encoded;
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f638p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        FieldMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f638p = r2
                r0.valueConverter = r3
                r0.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.apply(r1, r2)
                return
        }

        void apply(retrofit2.RequestBuilder r7, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r8) throws java.io.IOException {
                r6 = this;
                r0 = 0
                if (r8 == 0) goto L9f
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Lb:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L9e
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L91
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L73
                retrofit2.Converter<T, java.lang.String> r4 = r6.valueConverter
                java.lang.Object r4 = r4.convert(r1)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L37
                boolean r1 = r6.encoded
                r7.addFormField(r2, r4, r1)
                goto Lb
            L37:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f638p
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Field map value '"
                r4.<init>(r5)
                java.lang.StringBuilder r1 = r4.append(r1)
                java.lang.String r4 = "' converted to null by "
                java.lang.StringBuilder r1 = r1.append(r4)
                retrofit2.Converter<T, java.lang.String> r4 = r6.valueConverter
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r4 = " for key '"
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L73:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f638p
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "Field map contained null value for key '"
                r1.<init>(r4)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L91:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f638p
                java.lang.String r1 = "Field map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L9e:
                return
            L9f:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f638p
                java.lang.String r1 = "Field map was null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
        }
    }

    static final class Header<T> extends retrofit2.ParameterHandler<T> {
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Header(java.lang.String r2, retrofit2.Converter<T, java.lang.String> r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.name = r2
                r1.valueConverter = r3
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r2, @javax.annotation.Nullable T r3) throws java.io.IOException {
                r1 = this;
                if (r3 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r1.valueConverter
                java.lang.Object r3 = r0.convert(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r1.name
                r2.addHeader(r0, r3)
                return
        }
    }

    static final class HeaderMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f639p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        HeaderMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, java.lang.String> r3) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f639p = r2
                r0.valueConverter = r3
                return
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.apply(r1, r2)
                return
        }

        void apply(retrofit2.RequestBuilder r5, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r6) throws java.io.IOException {
                r4 = this;
                r0 = 0
                if (r6 == 0) goto L5f
                java.util.Set r6 = r6.entrySet()
                java.util.Iterator r6 = r6.iterator()
            Lb:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L5e
                java.lang.Object r1 = r6.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L51
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L31
                retrofit2.Converter<T, java.lang.String> r3 = r4.valueConverter
                java.lang.Object r1 = r3.convert(r1)
                java.lang.String r1 = (java.lang.String) r1
                r5.addHeader(r2, r1)
                goto Lb
            L31:
                java.lang.reflect.Method r5 = r4.method
                int r6 = r4.f639p
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Header map contained null value for key '"
                r1.<init>(r3)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "'."
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r5, r6, r1, r0)
                throw r5
            L51:
                java.lang.reflect.Method r5 = r4.method
                int r6 = r4.f639p
                java.lang.String r1 = "Header map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r5, r6, r1, r0)
                throw r5
            L5e:
                return
            L5f:
                java.lang.reflect.Method r5 = r4.method
                int r6 = r4.f639p
                java.lang.String r1 = "Header map was null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r5, r6, r1, r0)
                throw r5
        }
    }

    static final class Headers extends retrofit2.ParameterHandler<okhttp3.Headers> {
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f640p;

        Headers(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f640p = r2
                return
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable okhttp3.Headers r2) throws java.io.IOException {
                r0 = this;
                okhttp3.Headers r2 = (okhttp3.Headers) r2
                r0.apply2(r1, r2)
                return
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        void apply2(retrofit2.RequestBuilder r3, @javax.annotation.Nullable okhttp3.Headers r4) {
                r2 = this;
                if (r4 == 0) goto L6
                r3.addHeaders(r4)
                return
            L6:
                java.lang.reflect.Method r3 = r2.method
                int r4 = r2.f640p
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "Headers parameter must not be null."
                java.lang.RuntimeException r3 = retrofit2.Utils.parameterError(r3, r4, r1, r0)
                throw r3
        }
    }

    static final class Part<T> extends retrofit2.ParameterHandler<T> {
        private final retrofit2.Converter<T, okhttp3.RequestBody> converter;
        private final okhttp3.Headers headers;
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f641p;

        Part(java.lang.reflect.Method r1, int r2, okhttp3.Headers r3, retrofit2.Converter<T, okhttp3.RequestBody> r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f641p = r2
                r0.headers = r3
                r0.converter = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r5, @javax.annotation.Nullable T r6) {
                r4 = this;
                if (r6 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, okhttp3.RequestBody> r0 = r4.converter     // Catch: java.io.IOException -> L11
                java.lang.Object r0 = r0.convert(r6)     // Catch: java.io.IOException -> L11
                okhttp3.RequestBody r0 = (okhttp3.RequestBody) r0     // Catch: java.io.IOException -> L11
                okhttp3.Headers r6 = r4.headers
                r5.addPart(r6, r0)
                return
            L11:
                r5 = move-exception
                java.lang.reflect.Method r0 = r4.method
                int r1 = r4.f641p
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to convert "
                r2.<init>(r3)
                java.lang.StringBuilder r6 = r2.append(r6)
                java.lang.String r2 = " to RequestBody"
                java.lang.StringBuilder r6 = r6.append(r2)
                java.lang.String r6 = r6.toString()
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                r2[r3] = r5
                java.lang.RuntimeException r5 = retrofit2.Utils.parameterError(r0, r1, r6, r2)
                throw r5
        }
    }

    static final class PartMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f642p;
        private final java.lang.String transferEncoding;
        private final retrofit2.Converter<T, okhttp3.RequestBody> valueConverter;

        PartMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, okhttp3.RequestBody> r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f642p = r2
                r0.valueConverter = r3
                r0.transferEncoding = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.apply(r1, r2)
                return
        }

        void apply(retrofit2.RequestBuilder r7, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r8) throws java.io.IOException {
                r6 = this;
                r0 = 0
                if (r8 == 0) goto L8c
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Lb:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L8b
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L7e
                java.lang.Object r1 = r1.getValue()
                if (r1 == 0) goto L5e
                r3 = 4
                java.lang.String[] r3 = new java.lang.String[r3]
                java.lang.String r4 = "Content-Disposition"
                r3[r0] = r4
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "form-data; name=\""
                r4.<init>(r5)
                java.lang.StringBuilder r2 = r4.append(r2)
                java.lang.String r4 = "\""
                java.lang.StringBuilder r2 = r2.append(r4)
                java.lang.String r2 = r2.toString()
                r4 = 1
                r3[r4] = r2
                r2 = 2
                java.lang.String r4 = "Content-Transfer-Encoding"
                r3[r2] = r4
                r2 = 3
                java.lang.String r4 = r6.transferEncoding
                r3[r2] = r4
                okhttp3.Headers r2 = okhttp3.Headers.m94of(r3)
                retrofit2.Converter<T, okhttp3.RequestBody> r3 = r6.valueConverter
                java.lang.Object r1 = r3.convert(r1)
                okhttp3.RequestBody r1 = (okhttp3.RequestBody) r1
                r7.addPart(r2, r1)
                goto Lb
            L5e:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f642p
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Part map contained null value for key '"
                r1.<init>(r3)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r2 = "'."
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L7e:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f642p
                java.lang.String r1 = "Part map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L8b:
                return
            L8c:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f642p
                java.lang.String r1 = "Part map was null."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
        }
    }

    static final class Path<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.reflect.Method method;
        private final java.lang.String name;

        /* renamed from: p */
        private final int f643p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Path(java.lang.reflect.Method r1, int r2, java.lang.String r3, retrofit2.Converter<T, java.lang.String> r4, boolean r5) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f643p = r2
                java.lang.String r1 = "name == null"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r3, r1)
                java.lang.String r1 = (java.lang.String) r1
                r0.name = r1
                r0.valueConverter = r4
                r0.encoded = r5
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 == 0) goto L12
                java.lang.String r0 = r2.name
                retrofit2.Converter<T, java.lang.String> r1 = r2.valueConverter
                java.lang.Object r4 = r1.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                boolean r1 = r2.encoded
                r3.addPathParam(r0, r4, r1)
                return
            L12:
                java.lang.reflect.Method r3 = r2.method
                int r4 = r2.f643p
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Path parameter \""
                r0.<init>(r1)
                java.lang.String r1 = r2.name
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "\" value must not be null."
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.RuntimeException r3 = retrofit2.Utils.parameterError(r3, r4, r0, r1)
                throw r3
        }
    }

    static final class Query<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final java.lang.String name;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        Query(java.lang.String r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "name == null"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.name = r2
                r1.valueConverter = r3
                r1.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r2.valueConverter
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 != 0) goto Le
                return
            Le:
                java.lang.String r0 = r2.name
                boolean r1 = r2.encoded
                r3.addQueryParam(r0, r4, r1)
                return
        }
    }

    static final class QueryMap<T> extends retrofit2.ParameterHandler<java.util.Map<java.lang.String, T>> {
        private final boolean encoded;
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f644p;
        private final retrofit2.Converter<T, java.lang.String> valueConverter;

        QueryMap(java.lang.reflect.Method r1, int r2, retrofit2.Converter<T, java.lang.String> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f644p = r2
                r0.valueConverter = r3
                r0.encoded = r4
                return
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.apply(r1, r2)
                return
        }

        void apply(retrofit2.RequestBuilder r7, @javax.annotation.Nullable java.util.Map<java.lang.String, T> r8) throws java.io.IOException {
                r6 = this;
                r0 = 0
                if (r8 == 0) goto L9f
                java.util.Set r8 = r8.entrySet()
                java.util.Iterator r8 = r8.iterator()
            Lb:
                boolean r1 = r8.hasNext()
                if (r1 == 0) goto L9e
                java.lang.Object r1 = r8.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L91
                java.lang.Object r1 = r1.getValue()
                java.lang.String r3 = "'."
                if (r1 == 0) goto L73
                retrofit2.Converter<T, java.lang.String> r4 = r6.valueConverter
                java.lang.Object r4 = r4.convert(r1)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L37
                boolean r1 = r6.encoded
                r7.addQueryParam(r2, r4, r1)
                goto Lb
            L37:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f644p
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Query map value '"
                r4.<init>(r5)
                java.lang.StringBuilder r1 = r4.append(r1)
                java.lang.String r4 = "' converted to null by "
                java.lang.StringBuilder r1 = r1.append(r4)
                retrofit2.Converter<T, java.lang.String> r4 = r6.valueConverter
                java.lang.Class r4 = r4.getClass()
                java.lang.String r4 = r4.getName()
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r4 = " for key '"
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L73:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f644p
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r4 = "Query map contained null value for key '"
                r1.<init>(r4)
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.StringBuilder r1 = r1.append(r3)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L91:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f644p
                java.lang.String r1 = "Query map contained null key."
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
            L9e:
                return
            L9f:
                java.lang.reflect.Method r7 = r6.method
                int r8 = r6.f644p
                java.lang.String r1 = "Query map was null"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.RuntimeException r7 = retrofit2.Utils.parameterError(r7, r8, r1, r0)
                throw r7
        }
    }

    static final class QueryName<T> extends retrofit2.ParameterHandler<T> {
        private final boolean encoded;
        private final retrofit2.Converter<T, java.lang.String> nameConverter;

        QueryName(retrofit2.Converter<T, java.lang.String> r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.nameConverter = r1
                r0.encoded = r2
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L3
                return
            L3:
                retrofit2.Converter<T, java.lang.String> r0 = r2.nameConverter
                java.lang.Object r4 = r0.convert(r4)
                java.lang.String r4 = (java.lang.String) r4
                r0 = 0
                boolean r1 = r2.encoded
                r3.addQueryParam(r4, r0, r1)
                return
        }
    }

    static final class RawPart extends retrofit2.ParameterHandler<okhttp3.MultipartBody.Part> {
        static final retrofit2.ParameterHandler.RawPart INSTANCE = null;

        static {
                retrofit2.ParameterHandler$RawPart r0 = new retrofit2.ParameterHandler$RawPart
                r0.<init>()
                retrofit2.ParameterHandler.RawPart.INSTANCE = r0
                return
        }

        private RawPart() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // retrofit2.ParameterHandler
        /* bridge */ /* synthetic */ void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable okhttp3.MultipartBody.Part r2) throws java.io.IOException {
                r0 = this;
                okhttp3.MultipartBody$Part r2 = (okhttp3.MultipartBody.Part) r2
                r0.apply2(r1, r2)
                return
        }

        /* renamed from: apply, reason: avoid collision after fix types in other method */
        void apply2(retrofit2.RequestBuilder r1, @javax.annotation.Nullable okhttp3.MultipartBody.Part r2) {
                r0 = this;
                if (r2 == 0) goto L5
                r1.addPart(r2)
            L5:
                return
        }
    }

    static final class RelativeUrl extends retrofit2.ParameterHandler<java.lang.Object> {
        private final java.lang.reflect.Method method;

        /* renamed from: p */
        private final int f645p;

        RelativeUrl(java.lang.reflect.Method r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.method = r1
                r0.f645p = r2
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r3, @javax.annotation.Nullable java.lang.Object r4) {
                r2 = this;
                if (r4 == 0) goto L6
                r3.setRelativeUrl(r4)
                return
            L6:
                java.lang.reflect.Method r3 = r2.method
                int r4 = r2.f645p
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = "@Url parameter is null."
                java.lang.RuntimeException r3 = retrofit2.Utils.parameterError(r3, r4, r1, r0)
                throw r3
        }
    }

    static final class Tag<T> extends retrofit2.ParameterHandler<T> {
        final java.lang.Class<T> cls;

        Tag(java.lang.Class<T> r1) {
                r0 = this;
                r0.<init>()
                r0.cls = r1
                return
        }

        @Override // retrofit2.ParameterHandler
        void apply(retrofit2.RequestBuilder r2, @javax.annotation.Nullable T r3) {
                r1 = this;
                java.lang.Class<T> r0 = r1.cls
                r2.addTag(r0, r3)
                return
        }
    }

    ParameterHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    abstract void apply(retrofit2.RequestBuilder r1, @javax.annotation.Nullable T r2) throws java.io.IOException;

    final retrofit2.ParameterHandler<java.lang.Object> array() {
            r1 = this;
            retrofit2.ParameterHandler$2 r0 = new retrofit2.ParameterHandler$2
            r0.<init>(r1)
            return r0
    }

    final retrofit2.ParameterHandler<java.lang.Iterable<T>> iterable() {
            r1 = this;
            retrofit2.ParameterHandler$1 r0 = new retrofit2.ParameterHandler$1
            r0.<init>(r1)
            return r0
    }
}
