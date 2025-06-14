package com.google.gson;

/* loaded from: classes.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final java.lang.String DEFAULT_DATE_PATTERN = null;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final com.google.gson.FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = null;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_LENIENT = false;
    static final com.google.gson.ToNumberStrategy DEFAULT_NUMBER_TO_NUMBER_STRATEGY = null;
    static final com.google.gson.ToNumberStrategy DEFAULT_OBJECT_TO_NUMBER_STRATEGY = null;
    static final boolean DEFAULT_PRETTY_PRINT = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    private static final java.lang.String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    private static final com.google.gson.reflect.TypeToken<?> NULL_KEY_SURROGATE = null;
    final java.util.List<com.google.gson.TypeAdapterFactory> builderFactories;
    final java.util.List<com.google.gson.TypeAdapterFactory> builderHierarchyFactories;
    private final java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson.FutureTypeAdapter<?>>> calls;
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    final java.lang.String datePattern;
    final int dateStyle;
    final com.google.gson.internal.Excluder excluder;
    final java.util.List<com.google.gson.TypeAdapterFactory> factories;
    final com.google.gson.FieldNamingStrategy fieldNamingStrategy;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> instanceCreators;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final boolean lenient;
    final com.google.gson.LongSerializationPolicy longSerializationPolicy;
    final com.google.gson.ToNumberStrategy numberToNumberStrategy;
    final com.google.gson.ToNumberStrategy objectToNumberStrategy;
    final boolean prettyPrinting;
    final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final int timeStyle;
    private final java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> typeTokenCache;
    final boolean useJdkUnsafe;






    static class FutureTypeAdapter<T> extends com.google.gson.TypeAdapter<T> {
        private com.google.gson.TypeAdapter<T> delegate;

        FutureTypeAdapter() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r2) throws java.io.IOException {
                r1 = this;
                com.google.gson.TypeAdapter<T> r0 = r1.delegate
                if (r0 == 0) goto L9
                java.lang.Object r2 = r0.read(r2)
                return r2
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }

        public void setDelegate(com.google.gson.TypeAdapter<T> r2) {
                r1 = this;
                com.google.gson.TypeAdapter<T> r0 = r1.delegate
                if (r0 != 0) goto L7
                r1.delegate = r2
                return
            L7:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r2, T r3) throws java.io.IOException {
                r1 = this;
                com.google.gson.TypeAdapter<T> r0 = r1.delegate
                if (r0 == 0) goto L8
                r0.write(r2, r3)
                return
            L8:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }
    }

    static {
            com.google.gson.FieldNamingPolicy r0 = com.google.gson.FieldNamingPolicy.IDENTITY
            com.google.gson.Gson.DEFAULT_FIELD_NAMING_STRATEGY = r0
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY = r0
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER
            com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.Gson.NULL_KEY_SURROGATE = r0
            return
    }

    public Gson() {
            r22 = this;
            r0 = r22
            com.google.gson.internal.Excluder r1 = com.google.gson.internal.Excluder.DEFAULT
            com.google.gson.FieldNamingStrategy r2 = com.google.gson.Gson.DEFAULT_FIELD_NAMING_STRATEGY
            java.util.Map r3 = java.util.Collections.emptyMap()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            com.google.gson.LongSerializationPolicy r12 = com.google.gson.LongSerializationPolicy.DEFAULT
            java.lang.String r13 = com.google.gson.Gson.DEFAULT_DATE_PATTERN
            r14 = 2
            r15 = 2
            java.util.List r16 = java.util.Collections.emptyList()
            java.util.List r17 = java.util.Collections.emptyList()
            java.util.List r18 = java.util.Collections.emptyList()
            com.google.gson.ToNumberStrategy r19 = com.google.gson.Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY
            com.google.gson.ToNumberStrategy r20 = com.google.gson.Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY
            java.util.List r21 = java.util.Collections.emptyList()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
    }

    Gson(com.google.gson.internal.Excluder r14, com.google.gson.FieldNamingStrategy r15, java.util.Map<java.lang.reflect.Type, com.google.gson.InstanceCreator<?>> r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, com.google.gson.LongSerializationPolicy r25, java.lang.String r26, int r27, int r28, java.util.List<com.google.gson.TypeAdapterFactory> r29, java.util.List<com.google.gson.TypeAdapterFactory> r30, java.util.List<com.google.gson.TypeAdapterFactory> r31, com.google.gson.ToNumberStrategy r32, com.google.gson.ToNumberStrategy r33, java.util.List<com.google.gson.ReflectionAccessFilter> r34) {
            r13 = this;
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r18
            r4 = r23
            r5 = r24
            r6 = r34
            r13.<init>()
            java.lang.ThreadLocal r7 = new java.lang.ThreadLocal
            r7.<init>()
            r0.calls = r7
            java.util.concurrent.ConcurrentHashMap r7 = new java.util.concurrent.ConcurrentHashMap
            r7.<init>()
            r0.typeTokenCache = r7
            r0.excluder = r1
            r7 = r15
            r0.fieldNamingStrategy = r7
            r0.instanceCreators = r2
            com.google.gson.internal.ConstructorConstructor r8 = new com.google.gson.internal.ConstructorConstructor
            r8.<init>(r2, r5, r6)
            r0.constructorConstructor = r8
            r2 = r17
            r0.serializeNulls = r2
            r0.complexMapKeySerialization = r3
            r2 = r19
            r0.generateNonExecutableJson = r2
            r2 = r20
            r0.htmlSafe = r2
            r2 = r21
            r0.prettyPrinting = r2
            r2 = r22
            r0.lenient = r2
            r0.serializeSpecialFloatingPointValues = r4
            r0.useJdkUnsafe = r5
            r2 = r25
            r0.longSerializationPolicy = r2
            r5 = r26
            r0.datePattern = r5
            r5 = r27
            r0.dateStyle = r5
            r5 = r28
            r0.timeStyle = r5
            r5 = r29
            r0.builderFactories = r5
            r5 = r30
            r0.builderHierarchyFactories = r5
            r5 = r32
            r0.objectToNumberStrategy = r5
            r9 = r33
            r0.numberToNumberStrategy = r9
            r0.reflectionFilters = r6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.google.gson.TypeAdapterFactory r11 = com.google.gson.internal.bind.TypeAdapters.JSON_ELEMENT_FACTORY
            r10.add(r11)
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.ObjectTypeAdapter.getFactory(r32)
            r10.add(r5)
            r10.add(r14)
            r5 = r31
            r10.addAll(r5)
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.TypeAdapters.STRING_FACTORY
            r10.add(r5)
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.TypeAdapters.INTEGER_FACTORY
            r10.add(r5)
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_FACTORY
            r10.add(r5)
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.TypeAdapters.BYTE_FACTORY
            r10.add(r5)
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.TypeAdapters.SHORT_FACTORY
            r10.add(r5)
            com.google.gson.TypeAdapter r2 = longAdapter(r25)
            java.lang.Class r5 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r11 = java.lang.Long.class
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.TypeAdapters.newFactory(r5, r11, r2)
            r10.add(r5)
            java.lang.Class r5 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r11 = java.lang.Double.class
            com.google.gson.TypeAdapter r12 = r13.doubleAdapter(r4)
            com.google.gson.TypeAdapterFactory r5 = com.google.gson.internal.bind.TypeAdapters.newFactory(r5, r11, r12)
            r10.add(r5)
            java.lang.Class r5 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r11 = java.lang.Float.class
            com.google.gson.TypeAdapter r4 = r13.floatAdapter(r4)
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.bind.TypeAdapters.newFactory(r5, r11, r4)
            r10.add(r4)
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.bind.NumberTypeAdapter.getFactory(r33)
            r10.add(r4)
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_FACTORY
            r10.add(r4)
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_BOOLEAN_FACTORY
            r10.add(r4)
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r4 = java.util.concurrent.atomic.AtomicLong.class
            com.google.gson.TypeAdapter r5 = atomicLongAdapter(r2)
            com.google.gson.TypeAdapterFactory r4 = com.google.gson.internal.bind.TypeAdapters.newFactory(r4, r5)
            r10.add(r4)
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r4 = java.util.concurrent.atomic.AtomicLongArray.class
            com.google.gson.TypeAdapter r2 = atomicLongArrayAdapter(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r4, r2)
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.CHARACTER_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.STRING_BUILDER_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.STRING_BUFFER_FACTORY
            r10.add(r2)
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            com.google.gson.TypeAdapter<java.math.BigDecimal> r4 = com.google.gson.internal.bind.TypeAdapters.BIG_DECIMAL
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r4)
            r10.add(r2)
            java.lang.Class<java.math.BigInteger> r2 = java.math.BigInteger.class
            com.google.gson.TypeAdapter<java.math.BigInteger> r4 = com.google.gson.internal.bind.TypeAdapters.BIG_INTEGER
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r4)
            r10.add(r2)
            java.lang.Class<com.google.gson.internal.LazilyParsedNumber> r2 = com.google.gson.internal.LazilyParsedNumber.class
            com.google.gson.TypeAdapter<com.google.gson.internal.LazilyParsedNumber> r4 = com.google.gson.internal.bind.TypeAdapters.LAZILY_PARSED_NUMBER
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.newFactory(r2, r4)
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.URL_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.URI_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.UUID_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.CURRENCY_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.LOCALE_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.INET_ADDRESS_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.BIT_SET_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.DateTypeAdapter.FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.CALENDAR_FACTORY
            r10.add(r2)
            boolean r2 = com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES
            if (r2 == 0) goto L166
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY
            r10.add(r2)
        L166:
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.ArrayTypeAdapter.FACTORY
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r2 = com.google.gson.internal.bind.TypeAdapters.CLASS_FACTORY
            r10.add(r2)
            com.google.gson.internal.bind.CollectionTypeAdapterFactory r2 = new com.google.gson.internal.bind.CollectionTypeAdapterFactory
            r2.<init>(r8)
            r10.add(r2)
            com.google.gson.internal.bind.MapTypeAdapterFactory r2 = new com.google.gson.internal.bind.MapTypeAdapterFactory
            r2.<init>(r8, r3)
            r10.add(r2)
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r2 = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory
            r2.<init>(r8)
            r0.jsonAdapterFactory = r2
            r10.add(r2)
            com.google.gson.TypeAdapterFactory r3 = com.google.gson.internal.bind.TypeAdapters.ENUM_FACTORY
            r10.add(r3)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory r3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory
            r16 = r3
            r17 = r8
            r18 = r15
            r19 = r14
            r20 = r2
            r21 = r34
            r16.<init>(r17, r18, r19, r20, r21)
            r10.add(r3)
            java.util.List r1 = java.util.Collections.unmodifiableList(r10)
            r0.factories = r1
            return
    }

    private static void assertFullConsumption(java.lang.Object r0, com.google.gson.stream.JsonReader r1) {
            if (r0 == 0) goto L21
            com.google.gson.stream.JsonToken r0 = r1.peek()     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.END_DOCUMENT     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            if (r0 != r1) goto Lb
            goto L21
        Lb:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            java.lang.String r1 = "JSON document was not fully consumed."
            r0.<init>(r1)     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
            throw r0     // Catch: java.io.IOException -> L13 com.google.gson.stream.MalformedJsonException -> L1a
        L13:
            r0 = move-exception
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            r1.<init>(r0)
            throw r1
        L1a:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException
            r1.<init>(r0)
            throw r1
        L21:
            return
    }

    private static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLong> atomicLongAdapter(com.google.gson.TypeAdapter<java.lang.Number> r1) {
            com.google.gson.Gson$4 r0 = new com.google.gson.Gson$4
            r0.<init>(r1)
            com.google.gson.TypeAdapter r1 = r0.nullSafe()
            return r1
    }

    private static com.google.gson.TypeAdapter<java.util.concurrent.atomic.AtomicLongArray> atomicLongArrayAdapter(com.google.gson.TypeAdapter<java.lang.Number> r1) {
            com.google.gson.Gson$5 r0 = new com.google.gson.Gson$5
            r0.<init>(r1)
            com.google.gson.TypeAdapter r1 = r0.nullSafe()
            return r1
    }

    static void checkValidFloatingPoint(double r2) {
            boolean r0 = java.lang.Double.isNaN(r2)
            if (r0 != 0) goto Ld
            boolean r0 = java.lang.Double.isInfinite(r2)
            if (r0 != 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r3 = " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }

    private com.google.gson.TypeAdapter<java.lang.Number> doubleAdapter(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.google.gson.TypeAdapter<java.lang.Number> r1 = com.google.gson.internal.bind.TypeAdapters.DOUBLE
            return r1
        L5:
            com.google.gson.Gson$1 r1 = new com.google.gson.Gson$1
            r1.<init>(r0)
            return r1
    }

    private com.google.gson.TypeAdapter<java.lang.Number> floatAdapter(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            com.google.gson.TypeAdapter<java.lang.Number> r1 = com.google.gson.internal.bind.TypeAdapters.FLOAT
            return r1
        L5:
            com.google.gson.Gson$2 r1 = new com.google.gson.Gson$2
            r1.<init>(r0)
            return r1
    }

    private static com.google.gson.TypeAdapter<java.lang.Number> longAdapter(com.google.gson.LongSerializationPolicy r1) {
            com.google.gson.LongSerializationPolicy r0 = com.google.gson.LongSerializationPolicy.DEFAULT
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapter<java.lang.Number> r1 = com.google.gson.internal.bind.TypeAdapters.LONG
            return r1
        L7:
            com.google.gson.Gson$3 r1 = new com.google.gson.Gson$3
            r1.<init>()
            return r1
    }

    @java.lang.Deprecated
    public com.google.gson.internal.Excluder excluder() {
            r1 = this;
            com.google.gson.internal.Excluder r0 = r1.excluder
            return r0
    }

    public com.google.gson.FieldNamingStrategy fieldNamingStrategy() {
            r1 = this;
            com.google.gson.FieldNamingStrategy r0 = r1.fieldNamingStrategy
            return r0
    }

    public <T> T fromJson(com.google.gson.JsonElement r1, java.lang.Class<T> r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            java.lang.Object r1 = r0.fromJson(r1, r2)
            java.lang.Class r2 = com.google.gson.internal.Primitives.wrap(r2)
            java.lang.Object r1 = r2.cast(r1)
            return r1
    }

    public <T> T fromJson(com.google.gson.JsonElement r2, java.lang.reflect.Type r3) throws com.google.gson.JsonSyntaxException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.google.gson.internal.bind.JsonTreeReader r0 = new com.google.gson.internal.bind.JsonTreeReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.fromJson(r0, r3)
            return r2
    }

    public <T> T fromJson(com.google.gson.stream.JsonReader r5, java.lang.reflect.Type r6) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r4 = this;
            java.lang.String r0 = "AssertionError (GSON 2.9.1): "
            boolean r1 = r5.isLenient()
            r2 = 1
            r5.setLenient(r2)
            r5.peek()     // Catch: java.lang.Throwable -> L1e java.lang.AssertionError -> L20 java.io.IOException -> L3b java.lang.IllegalStateException -> L42 java.io.EOFException -> L49
            r2 = 0
            com.google.gson.reflect.TypeToken r6 = com.google.gson.reflect.TypeToken.get(r6)     // Catch: java.lang.Throwable -> L1e java.lang.AssertionError -> L20 java.io.IOException -> L3b java.lang.IllegalStateException -> L42 java.io.EOFException -> L49
            com.google.gson.TypeAdapter r6 = r4.getAdapter(r6)     // Catch: java.lang.Throwable -> L1e java.lang.AssertionError -> L20 java.io.IOException -> L3b java.lang.IllegalStateException -> L42 java.io.EOFException -> L49
            java.lang.Object r6 = r6.read(r5)     // Catch: java.lang.Throwable -> L1e java.lang.AssertionError -> L20 java.io.IOException -> L3b java.lang.IllegalStateException -> L42 java.io.EOFException -> L49
            r5.setLenient(r1)
            return r6
        L1e:
            r6 = move-exception
            goto L57
        L20:
            r6 = move-exception
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L1e
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1e
            r2.initCause(r6)     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        L3b:
            r6 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L42:
            r6 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L49:
            r6 = move-exception
            if (r2 == 0) goto L51
            r5.setLenient(r1)
            r5 = 0
            return r5
        L51:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> L1e
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        L57:
            r5.setLenient(r1)
            throw r6
    }

    public <T> T fromJson(java.io.Reader r2, java.lang.Class<T> r3) throws com.google.gson.JsonSyntaxException, com.google.gson.JsonIOException {
            r1 = this;
            com.google.gson.stream.JsonReader r2 = r1.newJsonReader(r2)
            java.lang.Object r0 = r1.fromJson(r2, r3)
            assertFullConsumption(r0, r2)
            java.lang.Class r2 = com.google.gson.internal.Primitives.wrap(r3)
            java.lang.Object r2 = r2.cast(r0)
            return r2
    }

    public <T> T fromJson(java.io.Reader r1, java.lang.reflect.Type r2) throws com.google.gson.JsonIOException, com.google.gson.JsonSyntaxException {
            r0 = this;
            com.google.gson.stream.JsonReader r1 = r0.newJsonReader(r1)
            java.lang.Object r2 = r0.fromJson(r1, r2)
            assertFullConsumption(r2, r1)
            return r2
    }

    public <T> T fromJson(java.lang.String r1, java.lang.Class<T> r2) throws com.google.gson.JsonSyntaxException {
            r0 = this;
            java.lang.Object r1 = r0.fromJson(r1, r2)
            java.lang.Class r2 = com.google.gson.internal.Primitives.wrap(r2)
            java.lang.Object r1 = r2.cast(r1)
            return r1
    }

    public <T> T fromJson(java.lang.String r2, java.lang.reflect.Type r3) throws com.google.gson.JsonSyntaxException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r2)
            java.lang.Object r2 = r1.fromJson(r0, r3)
            return r2
    }

    public <T> com.google.gson.TypeAdapter<T> getAdapter(com.google.gson.reflect.TypeToken<T> r6) {
            r5 = this;
            java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r0 = r5.typeTokenCache
            if (r6 != 0) goto L7
            com.google.gson.reflect.TypeToken<?> r1 = com.google.gson.Gson.NULL_KEY_SURROGATE
            goto L8
        L7:
            r1 = r6
        L8:
            java.lang.Object r0 = r0.get(r1)
            com.google.gson.TypeAdapter r0 = (com.google.gson.TypeAdapter) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r0 = r5.calls
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L27
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r1 = r5.calls
            r1.set(r0)
            r1 = 1
            goto L28
        L27:
            r1 = 0
        L28:
            java.lang.Object r2 = r0.get(r6)
            com.google.gson.Gson$FutureTypeAdapter r2 = (com.google.gson.Gson.FutureTypeAdapter) r2
            if (r2 == 0) goto L31
            return r2
        L31:
            com.google.gson.Gson$FutureTypeAdapter r2 = new com.google.gson.Gson$FutureTypeAdapter     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            r0.put(r6, r2)     // Catch: java.lang.Throwable -> L7d
            java.util.List<com.google.gson.TypeAdapterFactory> r3 = r5.factories     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L7d
        L3f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L64
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L7d
            com.google.gson.TypeAdapterFactory r4 = (com.google.gson.TypeAdapterFactory) r4     // Catch: java.lang.Throwable -> L7d
            com.google.gson.TypeAdapter r4 = r4.create(r5, r6)     // Catch: java.lang.Throwable -> L7d
            if (r4 == 0) goto L3f
            r2.setDelegate(r4)     // Catch: java.lang.Throwable -> L7d
            java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.TypeAdapter<?>> r2 = r5.typeTokenCache     // Catch: java.lang.Throwable -> L7d
            r2.put(r6, r4)     // Catch: java.lang.Throwable -> L7d
            r0.remove(r6)
            if (r1 == 0) goto L63
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r6 = r5.calls
            r6.remove()
        L63:
            return r4
        L64:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r3.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "GSON (2.9.1) cannot handle "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L7d
            java.lang.StringBuilder r3 = r3.append(r6)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L7d
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L7d
            throw r2     // Catch: java.lang.Throwable -> L7d
        L7d:
            r2 = move-exception
            r0.remove(r6)
            if (r1 == 0) goto L88
            java.lang.ThreadLocal<java.util.Map<com.google.gson.reflect.TypeToken<?>, com.google.gson.Gson$FutureTypeAdapter<?>>> r6 = r5.calls
            r6.remove()
        L88:
            throw r2
    }

    public <T> com.google.gson.TypeAdapter<T> getAdapter(java.lang.Class<T> r1) {
            r0 = this;
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r1 = r0.getAdapter(r1)
            return r1
    }

    public <T> com.google.gson.TypeAdapter<T> getDelegateAdapter(com.google.gson.TypeAdapterFactory r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r3.factories
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto La
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r4 = r3.jsonAdapterFactory
        La:
            java.util.List<com.google.gson.TypeAdapterFactory> r0 = r3.factories
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r0.next()
            com.google.gson.TypeAdapterFactory r2 = (com.google.gson.TypeAdapterFactory) r2
            if (r1 != 0) goto L23
            if (r2 != r4) goto L11
            r1 = 1
            goto L11
        L23:
            com.google.gson.TypeAdapter r2 = r2.create(r3, r5)
            if (r2 == 0) goto L11
            return r2
        L2a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GSON cannot serialize "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public boolean htmlSafe() {
            r1 = this;
            boolean r0 = r1.htmlSafe
            return r0
    }

    public com.google.gson.GsonBuilder newBuilder() {
            r1 = this;
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder
            r0.<init>(r1)
            return r0
    }

    public com.google.gson.stream.JsonReader newJsonReader(java.io.Reader r2) {
            r1 = this;
            com.google.gson.stream.JsonReader r0 = new com.google.gson.stream.JsonReader
            r0.<init>(r2)
            boolean r2 = r1.lenient
            r0.setLenient(r2)
            return r0
    }

    public com.google.gson.stream.JsonWriter newJsonWriter(java.io.Writer r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.generateNonExecutableJson
            if (r0 == 0) goto L9
            java.lang.String r0 = ")]}'\n"
            r2.write(r0)
        L9:
            com.google.gson.stream.JsonWriter r0 = new com.google.gson.stream.JsonWriter
            r0.<init>(r2)
            boolean r2 = r1.prettyPrinting
            if (r2 == 0) goto L17
            java.lang.String r2 = "  "
            r0.setIndent(r2)
        L17:
            boolean r2 = r1.htmlSafe
            r0.setHtmlSafe(r2)
            boolean r2 = r1.lenient
            r0.setLenient(r2)
            boolean r2 = r1.serializeNulls
            r0.setSerializeNulls(r2)
            return r0
    }

    public boolean serializeNulls() {
            r1 = this;
            boolean r0 = r1.serializeNulls
            return r0
    }

    public java.lang.String toJson(com.google.gson.JsonElement r2) {
            r1 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1.toJson(r2, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public java.lang.String toJson(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L9
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            java.lang.String r2 = r1.toJson(r2)
            return r2
        L9:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r2 = r1.toJson(r2, r0)
            return r2
    }

    public java.lang.String toJson(java.lang.Object r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            r1.toJson(r2, r3, r0)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void toJson(com.google.gson.JsonElement r7, com.google.gson.stream.JsonWriter r8) throws com.google.gson.JsonIOException {
            r6 = this;
            java.lang.String r0 = "AssertionError (GSON 2.9.1): "
            boolean r1 = r8.isLenient()
            r2 = 1
            r8.setLenient(r2)
            boolean r2 = r8.isHtmlSafe()
            boolean r3 = r6.htmlSafe
            r8.setHtmlSafe(r3)
            boolean r3 = r8.getSerializeNulls()
            boolean r4 = r6.serializeNulls
            r8.setSerializeNulls(r4)
            com.google.gson.internal.Streams.write(r7, r8)     // Catch: java.lang.Throwable -> L29 java.lang.AssertionError -> L2b java.io.IOException -> L46
            r8.setLenient(r1)
            r8.setHtmlSafe(r2)
            r8.setSerializeNulls(r3)
            return
        L29:
            r7 = move-exception
            goto L4d
        L2b:
            r7 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r7.getMessage()     // Catch: java.lang.Throwable -> L29
            java.lang.StringBuilder r0 = r5.append(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L29
            r4.initCause(r7)     // Catch: java.lang.Throwable -> L29
            throw r4     // Catch: java.lang.Throwable -> L29
        L46:
            r7 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L29
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L29
            throw r0     // Catch: java.lang.Throwable -> L29
        L4d:
            r8.setLenient(r1)
            r8.setHtmlSafe(r2)
            r8.setSerializeNulls(r3)
            throw r7
    }

    public void toJson(com.google.gson.JsonElement r1, java.lang.Appendable r2) throws com.google.gson.JsonIOException {
            r0 = this;
            java.io.Writer r2 = com.google.gson.internal.Streams.writerForAppendable(r2)     // Catch: java.io.IOException -> Lc
            com.google.gson.stream.JsonWriter r2 = r0.newJsonWriter(r2)     // Catch: java.io.IOException -> Lc
            r0.toJson(r1, r2)     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
    }

    public void toJson(java.lang.Object r2, java.lang.Appendable r3) throws com.google.gson.JsonIOException {
            r1 = this;
            if (r2 == 0) goto La
            java.lang.Class r0 = r2.getClass()
            r1.toJson(r2, r0, r3)
            goto Lf
        La:
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            r1.toJson(r2, r3)
        Lf:
            return
    }

    public void toJson(java.lang.Object r6, java.lang.reflect.Type r7, com.google.gson.stream.JsonWriter r8) throws com.google.gson.JsonIOException {
            r5 = this;
            java.lang.String r0 = "AssertionError (GSON 2.9.1): "
            com.google.gson.reflect.TypeToken r7 = com.google.gson.reflect.TypeToken.get(r7)
            com.google.gson.TypeAdapter r7 = r5.getAdapter(r7)
            boolean r1 = r8.isLenient()
            r2 = 1
            r8.setLenient(r2)
            boolean r2 = r8.isHtmlSafe()
            boolean r3 = r5.htmlSafe
            r8.setHtmlSafe(r3)
            boolean r3 = r8.getSerializeNulls()
            boolean r4 = r5.serializeNulls
            r8.setSerializeNulls(r4)
            r7.write(r8, r6)     // Catch: java.lang.Throwable -> L31 java.lang.AssertionError -> L33 java.io.IOException -> L4e
            r8.setLenient(r1)
            r8.setHtmlSafe(r2)
            r8.setSerializeNulls(r3)
            return
        L31:
            r6 = move-exception
            goto L55
        L33:
            r6 = move-exception
            java.lang.AssertionError r7 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r6.getMessage()     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r0 = r4.append(r0)     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L31
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L31
            r7.initCause(r6)     // Catch: java.lang.Throwable -> L31
            throw r7     // Catch: java.lang.Throwable -> L31
        L4e:
            r6 = move-exception
            com.google.gson.JsonIOException r7 = new com.google.gson.JsonIOException     // Catch: java.lang.Throwable -> L31
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L31
            throw r7     // Catch: java.lang.Throwable -> L31
        L55:
            r8.setLenient(r1)
            r8.setHtmlSafe(r2)
            r8.setSerializeNulls(r3)
            throw r6
    }

    public void toJson(java.lang.Object r1, java.lang.reflect.Type r2, java.lang.Appendable r3) throws com.google.gson.JsonIOException {
            r0 = this;
            java.io.Writer r3 = com.google.gson.internal.Streams.writerForAppendable(r3)     // Catch: java.io.IOException -> Lc
            com.google.gson.stream.JsonWriter r3 = r0.newJsonWriter(r3)     // Catch: java.io.IOException -> Lc
            r0.toJson(r1, r2, r3)     // Catch: java.io.IOException -> Lc
            return
        Lc:
            r1 = move-exception
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            r2.<init>(r1)
            throw r2
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L5
            com.google.gson.JsonNull r2 = com.google.gson.JsonNull.INSTANCE
            return r2
        L5:
            java.lang.Class r0 = r2.getClass()
            com.google.gson.JsonElement r2 = r1.toJsonTree(r2, r0)
            return r2
    }

    public com.google.gson.JsonElement toJsonTree(java.lang.Object r2, java.lang.reflect.Type r3) {
            r1 = this;
            com.google.gson.internal.bind.JsonTreeWriter r0 = new com.google.gson.internal.bind.JsonTreeWriter
            r0.<init>()
            r1.toJson(r2, r3, r0)
            com.google.gson.JsonElement r2 = r0.get()
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "{serializeNulls:"
            r0.<init>(r1)
            boolean r1 = r2.serializeNulls
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",factories:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<com.google.gson.TypeAdapterFactory> r1 = r2.factories
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",instanceCreators:"
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.gson.internal.ConstructorConstructor r1 = r2.constructorConstructor
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
