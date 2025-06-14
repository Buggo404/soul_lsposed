package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    final boolean complexMapKeySerialization;
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    private final class Adapter<K, V> extends com.google.gson.TypeAdapter<java.util.Map<K, V>> {
        private final com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> constructor;
        private final com.google.gson.TypeAdapter<K> keyTypeAdapter;
        final /* synthetic */ com.google.gson.internal.bind.MapTypeAdapterFactory this$0;
        private final com.google.gson.TypeAdapter<V> valueTypeAdapter;

        public Adapter(com.google.gson.internal.bind.MapTypeAdapterFactory r1, com.google.gson.Gson r2, java.lang.reflect.Type r3, com.google.gson.TypeAdapter<K> r4, java.lang.reflect.Type r5, com.google.gson.TypeAdapter<V> r6, com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> r7) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r1 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper
                r1.<init>(r2, r4, r3)
                r0.keyTypeAdapter = r1
                com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r1 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper
                r1.<init>(r2, r6, r5)
                r0.valueTypeAdapter = r1
                r0.constructor = r7
                return
        }

        private java.lang.String keyToString(com.google.gson.JsonElement r2) {
                r1 = this;
                boolean r0 = r2.isJsonPrimitive()
                if (r0 == 0) goto L39
                com.google.gson.JsonPrimitive r2 = r2.getAsJsonPrimitive()
                boolean r0 = r2.isNumber()
                if (r0 == 0) goto L19
                java.lang.Number r2 = r2.getAsNumber()
                java.lang.String r2 = java.lang.String.valueOf(r2)
                return r2
            L19:
                boolean r0 = r2.isBoolean()
                if (r0 == 0) goto L28
                boolean r2 = r2.getAsBoolean()
                java.lang.String r2 = java.lang.Boolean.toString(r2)
                return r2
            L28:
                boolean r0 = r2.isString()
                if (r0 == 0) goto L33
                java.lang.String r2 = r2.getAsString()
                return r2
            L33:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L39:
                boolean r2 = r2.isJsonNull()
                if (r2 == 0) goto L42
                java.lang.String r2 = "null"
                return r2
            L42:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                java.util.Map r1 = r0.read(r1)
                return r1
        }

        @Override // com.google.gson.TypeAdapter
        public java.util.Map<K, V> read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
                r4 = this;
                com.google.gson.stream.JsonToken r0 = r5.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r5.nextNull()
                r5 = 0
                return r5
            Ld:
                com.google.gson.internal.ObjectConstructor<? extends java.util.Map<K, V>> r1 = r4.constructor
                java.lang.Object r1 = r1.construct()
                java.util.Map r1 = (java.util.Map) r1
                com.google.gson.stream.JsonToken r2 = com.google.gson.stream.JsonToken.BEGIN_ARRAY
                java.lang.String r3 = "duplicate key: "
                if (r0 != r2) goto L54
                r5.beginArray()
            L1e:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L50
                r5.beginArray()
                com.google.gson.TypeAdapter<K> r0 = r4.keyTypeAdapter
                java.lang.Object r0 = r0.read(r5)
                com.google.gson.TypeAdapter<V> r2 = r4.valueTypeAdapter
                java.lang.Object r2 = r2.read(r5)
                java.lang.Object r2 = r1.put(r0, r2)
                if (r2 != 0) goto L3d
                r5.endArray()
                goto L1e
            L3d:
                com.google.gson.JsonSyntaxException r5 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r3)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L50:
                r5.endArray()
                goto L8b
            L54:
                r5.beginObject()
            L57:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L88
                com.google.gson.internal.JsonReaderInternalAccess r0 = com.google.gson.internal.JsonReaderInternalAccess.INSTANCE
                r0.promoteNameToValue(r5)
                com.google.gson.TypeAdapter<K> r0 = r4.keyTypeAdapter
                java.lang.Object r0 = r0.read(r5)
                com.google.gson.TypeAdapter<V> r2 = r4.valueTypeAdapter
                java.lang.Object r2 = r2.read(r5)
                java.lang.Object r2 = r1.put(r0, r2)
                if (r2 != 0) goto L75
                goto L57
            L75:
                com.google.gson.JsonSyntaxException r5 = new com.google.gson.JsonSyntaxException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r3)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                throw r5
            L88:
                r5.endObject()
            L8b:
                return r1
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Map r2 = (java.util.Map) r2
                r0.write(r1, r2)
                return
        }

        public void write(com.google.gson.stream.JsonWriter r8, java.util.Map<K, V> r9) throws java.io.IOException {
                r7 = this;
                if (r9 != 0) goto L6
                r8.nullValue()
                return
            L6:
                com.google.gson.internal.bind.MapTypeAdapterFactory r0 = r7.this$0
                boolean r0 = r0.complexMapKeySerialization
                if (r0 != 0) goto L3c
                r8.beginObject()
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
            L17:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L38
                java.lang.Object r0 = r9.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r8.name(r1)
                com.google.gson.TypeAdapter<V> r1 = r7.valueTypeAdapter
                java.lang.Object r0 = r0.getValue()
                r1.write(r8, r0)
                goto L17
            L38:
                r8.endObject()
                return
            L3c:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r9.size()
                r0.<init>(r1)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r9.size()
                r1.<init>(r2)
                java.util.Set r9 = r9.entrySet()
                java.util.Iterator r9 = r9.iterator()
                r2 = 0
                r3 = r2
            L58:
                boolean r4 = r9.hasNext()
                if (r4 == 0) goto L8a
                java.lang.Object r4 = r9.next()
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                com.google.gson.TypeAdapter<K> r5 = r7.keyTypeAdapter
                java.lang.Object r6 = r4.getKey()
                com.google.gson.JsonElement r5 = r5.toJsonTree(r6)
                r0.add(r5)
                java.lang.Object r4 = r4.getValue()
                r1.add(r4)
                boolean r4 = r5.isJsonArray()
                if (r4 != 0) goto L87
                boolean r4 = r5.isJsonObject()
                if (r4 == 0) goto L85
                goto L87
            L85:
                r4 = r2
                goto L88
            L87:
                r4 = 1
            L88:
                r3 = r3 | r4
                goto L58
            L8a:
                if (r3 == 0) goto Lb4
                r8.beginArray()
                int r9 = r0.size()
            L93:
                if (r2 >= r9) goto Lb0
                r8.beginArray()
                java.lang.Object r3 = r0.get(r2)
                com.google.gson.JsonElement r3 = (com.google.gson.JsonElement) r3
                com.google.gson.internal.Streams.write(r3, r8)
                com.google.gson.TypeAdapter<V> r3 = r7.valueTypeAdapter
                java.lang.Object r4 = r1.get(r2)
                r3.write(r8, r4)
                r8.endArray()
                int r2 = r2 + 1
                goto L93
            Lb0:
                r8.endArray()
                goto Ld9
            Lb4:
                r8.beginObject()
                int r9 = r0.size()
            Lbb:
                if (r2 >= r9) goto Ld6
                java.lang.Object r3 = r0.get(r2)
                com.google.gson.JsonElement r3 = (com.google.gson.JsonElement) r3
                java.lang.String r3 = r7.keyToString(r3)
                r8.name(r3)
                com.google.gson.TypeAdapter<V> r3 = r7.valueTypeAdapter
                java.lang.Object r4 = r1.get(r2)
                r3.write(r8, r4)
                int r2 = r2 + 1
                goto Lbb
            Ld6:
                r8.endObject()
            Ld9:
                return
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            r0.complexMapKeySerialization = r2
            return
    }

    private com.google.gson.TypeAdapter<?> getKeyAdapter(com.google.gson.Gson r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r3 == r0) goto L12
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r3 != r0) goto L9
            goto L12
        L9:
            com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.get(r3)
            com.google.gson.TypeAdapter r2 = r2.getAdapter(r3)
            goto L14
        L12:
            com.google.gson.TypeAdapter<java.lang.Boolean> r2 = com.google.gson.internal.bind.TypeAdapters.BOOLEAN_AS_STRING
        L14:
            return r2
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r12, com.google.gson.reflect.TypeToken<T> r13) {
            r11 = this;
            java.lang.reflect.Type r0 = r13.getType()
            java.lang.Class r1 = r13.getRawType()
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 != 0) goto L12
            r12 = 0
            return r12
        L12:
            java.lang.reflect.Type[] r0 = com.google.gson.internal.C$Gson$Types.getMapKeyAndValueTypes(r0, r1)
            r1 = 0
            r2 = r0[r1]
            com.google.gson.TypeAdapter r7 = r11.getKeyAdapter(r12, r2)
            r2 = 1
            r3 = r0[r2]
            com.google.gson.reflect.TypeToken r3 = com.google.gson.reflect.TypeToken.get(r3)
            com.google.gson.TypeAdapter r9 = r12.getAdapter(r3)
            com.google.gson.internal.ConstructorConstructor r3 = r11.constructorConstructor
            com.google.gson.internal.ObjectConstructor r10 = r3.get(r13)
            com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter r13 = new com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter
            r6 = r0[r1]
            r8 = r0[r2]
            r3 = r13
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r13
    }
}
