package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;
    private final com.google.gson.internal.Excluder excluder;
    private final com.google.gson.FieldNamingStrategy fieldNamingPolicy;
    private final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    private final java.util.List<com.google.gson.ReflectionAccessFilter> reflectionFilters;


    public static final class Adapter<T> extends com.google.gson.TypeAdapter<T> {
        private final java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> boundFields;
        private final com.google.gson.internal.ObjectConstructor<T> constructor;

        Adapter(com.google.gson.internal.ObjectConstructor<T> r1, java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> r2) {
                r0 = this;
                r0.<init>()
                r0.constructor = r1
                r0.boundFields = r2
                return
        }

        @Override // com.google.gson.TypeAdapter
        public T read(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
                r3 = this;
                com.google.gson.stream.JsonToken r0 = r4.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r4.nextNull()
                r4 = 0
                return r4
            Ld:
                com.google.gson.internal.ObjectConstructor<T> r0 = r3.constructor
                java.lang.Object r0 = r0.construct()
                r4.beginObject()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
            L16:
                boolean r1 = r4.hasNext()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                if (r1 == 0) goto L37
                java.lang.String r1 = r4.nextName()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r2 = r3.boundFields     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                if (r1 == 0) goto L33
                boolean r2 = r1.deserialized     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                if (r2 != 0) goto L2f
                goto L33
            L2f:
                r1.read(r4, r0)     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                goto L16
            L33:
                r4.skipValue()     // Catch: java.lang.IllegalAccessException -> L3b java.lang.IllegalStateException -> L41
                goto L16
            L37:
                r4.endObject()
                return r0
            L3b:
                r4 = move-exception
                java.lang.RuntimeException r4 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r4)
                throw r4
            L41:
                r4 = move-exception
                com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
                r0.<init>(r4)
                throw r0
        }

        @Override // com.google.gson.TypeAdapter
        public void write(com.google.gson.stream.JsonWriter r3, T r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L6
                r3.nullValue()
                return
            L6:
                r3.beginObject()
                java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField> r0 = r2.boundFields     // Catch: java.lang.IllegalAccessException -> L27
                java.util.Collection r0 = r0.values()     // Catch: java.lang.IllegalAccessException -> L27
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.IllegalAccessException -> L27
            L13:
                boolean r1 = r0.hasNext()     // Catch: java.lang.IllegalAccessException -> L27
                if (r1 == 0) goto L23
                java.lang.Object r1 = r0.next()     // Catch: java.lang.IllegalAccessException -> L27
                com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r1 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r1     // Catch: java.lang.IllegalAccessException -> L27
                r1.write(r3, r4)     // Catch: java.lang.IllegalAccessException -> L27
                goto L13
            L23:
                r3.endObject()
                return
            L27:
                r3 = move-exception
                java.lang.RuntimeException r3 = com.google.gson.internal.reflect.ReflectionHelper.createExceptionForUnexpectedIllegalAccess(r3)
                throw r3
        }
    }

    static abstract class BoundField {
        final boolean deserialized;
        final java.lang.String name;
        final boolean serialized;

        protected BoundField(java.lang.String r1, boolean r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.serialized = r2
                r0.deserialized = r3
                return
        }

        abstract void read(com.google.gson.stream.JsonReader r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;

        abstract void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException, java.lang.IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1, com.google.gson.FieldNamingStrategy r2, com.google.gson.internal.Excluder r3, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r4, java.util.List<com.google.gson.ReflectionAccessFilter> r5) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            r0.fieldNamingPolicy = r2
            r0.excluder = r3
            r0.jsonAdapterFactory = r4
            r0.reflectionFilters = r5
            return
    }

    static /* synthetic */ void access$000(java.lang.Object r0, java.lang.reflect.Field r1) {
            checkAccessible(r0, r1)
            return
    }

    private static void checkAccessible(java.lang.Object r2, java.lang.reflect.Field r3) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto Lb
            r2 = 0
        Lb:
            boolean r2 = com.google.gson.internal.ReflectionAccessFilterHelper.canAccess(r3, r2)
            if (r2 == 0) goto L12
            return
        L12:
            com.google.gson.JsonIOException r2 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Field '"
            r0.<init>(r1)
            java.lang.Class r1 = r3.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = "' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField createBoundField(com.google.gson.Gson r15, java.lang.reflect.Field r16, java.lang.String r17, com.google.gson.reflect.TypeToken<?> r18, boolean r19, boolean r20, boolean r21) {
            r14 = this;
            r12 = r14
            r9 = r15
            r10 = r18
            java.lang.Class r0 = r18.getRawType()
            boolean r11 = com.google.gson.internal.Primitives.isPrimitive(r0)
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r0 = com.google.gson.annotations.JsonAdapter.class
            r6 = r16
            java.lang.annotation.Annotation r0 = r6.getAnnotation(r0)
            com.google.gson.annotations.JsonAdapter r0 = (com.google.gson.annotations.JsonAdapter) r0
            if (r0 == 0) goto L21
            com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory r1 = r12.jsonAdapterFactory
            com.google.gson.internal.ConstructorConstructor r2 = r12.constructorConstructor
            com.google.gson.TypeAdapter r0 = r1.getTypeAdapter(r2, r15, r10, r0)
            goto L22
        L21:
            r0 = 0
        L22:
            if (r0 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            r7 = r1
            if (r0 != 0) goto L2e
            com.google.gson.TypeAdapter r0 = r15.getAdapter(r10)
        L2e:
            r8 = r0
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1 r13 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$1
            r0 = r13
            r1 = r14
            r2 = r17
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r16
            r9 = r15
            r10 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
    }

    private java.util.Map<java.lang.String, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField> getBoundFields(com.google.gson.Gson r27, com.google.gson.reflect.TypeToken<?> r28, java.lang.Class<?> r29, boolean r30) {
            r26 = this;
            r8 = r26
            r9 = r29
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            boolean r0 = r29.isInterface()
            if (r0 == 0) goto L10
            return r10
        L10:
            java.lang.reflect.Type r11 = r28.getType()
            r12 = r28
            r0 = r30
            r13 = r9
        L19:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r13 == r1) goto L13b
            java.lang.reflect.Field[] r14 = r13.getDeclaredFields()
            r15 = 1
            r7 = 0
            if (r13 == r9) goto L5f
            int r1 = r14.length
            if (r1 <= 0) goto L5f
            java.util.List<com.google.gson.ReflectionAccessFilter> r0 = r8.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r0 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r0, r13)
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r0 == r1) goto L3a
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE
            if (r0 != r1) goto L38
            r0 = r15
            goto L5f
        L38:
            r0 = r7
            goto L5f
        L3a:
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ReflectionAccessFilter does not permit using reflection for "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r13)
            java.lang.String r2 = " (supertype of "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r2 = "). Register a TypeAdapter for this type or adjust the access filter."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5f:
            r16 = r0
            int r6 = r14.length
            r5 = r7
        L63:
            if (r5 >= r6) goto L11f
            r4 = r14[r5]
            boolean r0 = r8.includeField(r4, r15)
            boolean r17 = r8.includeField(r4, r7)
            if (r0 != 0) goto L7b
            if (r17 != 0) goto L7b
            r20 = r5
            r24 = r6
            r25 = r7
            goto Lf3
        L7b:
            if (r16 != 0) goto L80
            com.google.gson.internal.reflect.ReflectionHelper.makeAccessible(r4)
        L80:
            java.lang.reflect.Type r1 = r12.getType()
            java.lang.reflect.Type r2 = r4.getGenericType()
            java.lang.reflect.Type r18 = com.google.gson.internal.C$Gson$Types.resolve(r1, r13, r2)
            java.util.List r3 = r8.getFieldNames(r4)
            int r2 = r3.size()
            r1 = 0
            r15 = r7
        L96:
            if (r15 >= r2) goto Lea
            java.lang.Object r19 = r3.get(r15)
            r8 = r19
            java.lang.String r8 = (java.lang.String) r8
            if (r15 == 0) goto La5
            r19 = r7
            goto La7
        La5:
            r19 = r0
        La7:
            com.google.gson.reflect.TypeToken r20 = com.google.gson.reflect.TypeToken.get(r18)
            r0 = r26
            r9 = r1
            r1 = r27
            r21 = r2
            r2 = r4
            r22 = r3
            r3 = r8
            r23 = r4
            r4 = r20
            r20 = r5
            r5 = r19
            r24 = r6
            r6 = r17
            r25 = r7
            r7 = r16
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = r0.createBoundField(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.put(r8, r0)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$BoundField r0 = (com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.BoundField) r0
            if (r9 != 0) goto Ld4
            r1 = r0
            goto Ld5
        Ld4:
            r1 = r9
        Ld5:
            int r15 = r15 + 1
            r8 = r26
            r9 = r29
            r0 = r19
            r5 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r6 = r24
            r7 = r25
            goto L96
        Lea:
            r9 = r1
            r20 = r5
            r24 = r6
            r25 = r7
            if (r9 != 0) goto L100
        Lf3:
            int r5 = r20 + 1
            r8 = r26
            r9 = r29
            r6 = r24
            r7 = r25
            r15 = 1
            goto L63
        L100:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " declares multiple JSON fields named "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r9.name
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L11f:
            java.lang.reflect.Type r0 = r12.getType()
            java.lang.reflect.Type r1 = r13.getGenericSuperclass()
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.resolve(r0, r13, r1)
            com.google.gson.reflect.TypeToken r12 = com.google.gson.reflect.TypeToken.get(r0)
            java.lang.Class r13 = r12.getRawType()
            r8 = r26
            r9 = r29
            r0 = r16
            goto L19
        L13b:
            return r10
    }

    private java.util.List<java.lang.String> getFieldNames(java.lang.reflect.Field r5) {
            r4 = this;
            java.lang.Class<com.google.gson.annotations.SerializedName> r0 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r0 = r5.getAnnotation(r0)
            com.google.gson.annotations.SerializedName r0 = (com.google.gson.annotations.SerializedName) r0
            if (r0 != 0) goto L15
            com.google.gson.FieldNamingStrategy r0 = r4.fieldNamingPolicy
            java.lang.String r5 = r0.translateName(r5)
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L15:
            java.lang.String r5 = r0.value()
            java.lang.String[] r0 = r0.alternate()
            int r1 = r0.length
            if (r1 != 0) goto L25
            java.util.List r5 = java.util.Collections.singletonList(r5)
            return r5
        L25:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            int r2 = r2 + 1
            r1.<init>(r2)
            r1.add(r5)
            int r5 = r0.length
            r2 = 0
        L32:
            if (r2 >= r5) goto L3c
            r3 = r0[r2]
            r1.add(r3)
            int r2 = r2 + 1
            goto L32
        L3c:
            return r1
    }

    private boolean includeField(java.lang.reflect.Field r3, boolean r4) {
            r2 = this;
            com.google.gson.internal.Excluder r0 = r2.excluder
            java.lang.Class r1 = r3.getType()
            boolean r0 = r0.excludeClass(r1, r4)
            if (r0 != 0) goto L16
            com.google.gson.internal.Excluder r0 = r2.excluder
            boolean r3 = r0.excludeField(r3, r4)
            if (r3 != 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r5, com.google.gson.reflect.TypeToken<T> r6) {
            r4 = this;
            java.lang.Class r0 = r6.getRawType()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto Le
            r5 = 0
            return r5
        Le:
            java.util.List<com.google.gson.ReflectionAccessFilter> r1 = r4.reflectionFilters
            com.google.gson.ReflectionAccessFilter$FilterResult r1 = com.google.gson.internal.ReflectionAccessFilterHelper.getFilterResult(r1, r0)
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_ALL
            if (r1 == r2) goto L2f
            com.google.gson.ReflectionAccessFilter$FilterResult r2 = com.google.gson.ReflectionAccessFilter.FilterResult.BLOCK_INACCESSIBLE
            if (r1 != r2) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            com.google.gson.internal.ConstructorConstructor r2 = r4.constructorConstructor
            com.google.gson.internal.ObjectConstructor r2 = r2.get(r6)
            com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter r3 = new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory$Adapter
            java.util.Map r5 = r4.getBoundFields(r5, r6, r0, r1)
            r3.<init>(r2, r5)
            return r3
        L2f:
            com.google.gson.JsonIOException r5 = new com.google.gson.JsonIOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "ReflectionAccessFilter does not permit using reflection for "
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = ". Register a TypeAdapter for this type or adjust the access filter."
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }
}
