package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class TreeTypeAdapter<T> extends com.google.gson.TypeAdapter<T> {
    private final com.google.gson.internal.bind.TreeTypeAdapter<T>.GsonContextImpl context;
    private volatile com.google.gson.TypeAdapter<T> delegate;
    private final com.google.gson.JsonDeserializer<T> deserializer;
    final com.google.gson.Gson gson;
    private final com.google.gson.JsonSerializer<T> serializer;
    private final com.google.gson.TypeAdapterFactory skipPast;
    private final com.google.gson.reflect.TypeToken<T> typeToken;

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$1 */
    static /* synthetic */ class C08181 {
    }

    private final class GsonContextImpl implements com.google.gson.JsonSerializationContext, com.google.gson.JsonDeserializationContext {
        final /* synthetic */ com.google.gson.internal.bind.TreeTypeAdapter this$0;

        private GsonContextImpl(com.google.gson.internal.bind.TreeTypeAdapter r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ GsonContextImpl(com.google.gson.internal.bind.TreeTypeAdapter r1, com.google.gson.internal.bind.TreeTypeAdapter.C08181 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.gson.JsonDeserializationContext
        public <R> R deserialize(com.google.gson.JsonElement r2, java.lang.reflect.Type r3) throws com.google.gson.JsonParseException {
                r1 = this;
                com.google.gson.internal.bind.TreeTypeAdapter r0 = r1.this$0
                com.google.gson.Gson r0 = r0.gson
                java.lang.Object r2 = r0.fromJson(r2, r3)
                return r2
        }

        @Override // com.google.gson.JsonSerializationContext
        public com.google.gson.JsonElement serialize(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.bind.TreeTypeAdapter r0 = r1.this$0
                com.google.gson.Gson r0 = r0.gson
                com.google.gson.JsonElement r2 = r0.toJsonTree(r2)
                return r2
        }

        @Override // com.google.gson.JsonSerializationContext
        public com.google.gson.JsonElement serialize(java.lang.Object r2, java.lang.reflect.Type r3) {
                r1 = this;
                com.google.gson.internal.bind.TreeTypeAdapter r0 = r1.this$0
                com.google.gson.Gson r0 = r0.gson
                com.google.gson.JsonElement r2 = r0.toJsonTree(r2, r3)
                return r2
        }
    }

    private static final class SingleTypeFactory implements com.google.gson.TypeAdapterFactory {
        private final com.google.gson.JsonDeserializer<?> deserializer;
        private final com.google.gson.reflect.TypeToken<?> exactType;
        private final java.lang.Class<?> hierarchyType;
        private final boolean matchRawType;
        private final com.google.gson.JsonSerializer<?> serializer;

        SingleTypeFactory(java.lang.Object r4, com.google.gson.reflect.TypeToken<?> r5, boolean r6, java.lang.Class<?> r7) {
                r3 = this;
                r3.<init>()
                boolean r0 = r4 instanceof com.google.gson.JsonSerializer
                r1 = 0
                if (r0 == 0) goto Lc
                r0 = r4
                com.google.gson.JsonSerializer r0 = (com.google.gson.JsonSerializer) r0
                goto Ld
            Lc:
                r0 = r1
            Ld:
                r3.serializer = r0
                boolean r2 = r4 instanceof com.google.gson.JsonDeserializer
                if (r2 == 0) goto L16
                r1 = r4
                com.google.gson.JsonDeserializer r1 = (com.google.gson.JsonDeserializer) r1
            L16:
                r3.deserializer = r1
                if (r0 != 0) goto L1f
                if (r1 == 0) goto L1d
                goto L1f
            L1d:
                r4 = 0
                goto L20
            L1f:
                r4 = 1
            L20:
                com.google.gson.internal.C$Gson$Preconditions.checkArgument(r4)
                r3.exactType = r5
                r3.matchRawType = r6
                r3.hierarchyType = r7
                return
        }

        @Override // com.google.gson.TypeAdapterFactory
        public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r8, com.google.gson.reflect.TypeToken<T> r9) {
                r7 = this;
                com.google.gson.reflect.TypeToken<?> r0 = r7.exactType
                if (r0 == 0) goto L1f
                boolean r0 = r0.equals(r9)
                if (r0 != 0) goto L1d
                boolean r0 = r7.matchRawType
                if (r0 == 0) goto L1b
                com.google.gson.reflect.TypeToken<?> r0 = r7.exactType
                java.lang.reflect.Type r0 = r0.getType()
                java.lang.Class r1 = r9.getRawType()
                if (r0 != r1) goto L1b
                goto L1d
            L1b:
                r0 = 0
                goto L29
            L1d:
                r0 = 1
                goto L29
            L1f:
                java.lang.Class<?> r0 = r7.hierarchyType
                java.lang.Class r1 = r9.getRawType()
                boolean r0 = r0.isAssignableFrom(r1)
            L29:
                if (r0 == 0) goto L39
                com.google.gson.internal.bind.TreeTypeAdapter r0 = new com.google.gson.internal.bind.TreeTypeAdapter
                com.google.gson.JsonSerializer<?> r2 = r7.serializer
                com.google.gson.JsonDeserializer<?> r3 = r7.deserializer
                r1 = r0
                r4 = r8
                r5 = r9
                r6 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                goto L3a
            L39:
                r0 = 0
            L3a:
                return r0
        }
    }

    public TreeTypeAdapter(com.google.gson.JsonSerializer<T> r3, com.google.gson.JsonDeserializer<T> r4, com.google.gson.Gson r5, com.google.gson.reflect.TypeToken<T> r6, com.google.gson.TypeAdapterFactory r7) {
            r2 = this;
            r2.<init>()
            com.google.gson.internal.bind.TreeTypeAdapter$GsonContextImpl r0 = new com.google.gson.internal.bind.TreeTypeAdapter$GsonContextImpl
            r1 = 0
            r0.<init>(r2, r1)
            r2.context = r0
            r2.serializer = r3
            r2.deserializer = r4
            r2.gson = r5
            r2.typeToken = r6
            r2.skipPast = r7
            return
    }

    private com.google.gson.TypeAdapter<T> delegate() {
            r3 = this;
            com.google.gson.TypeAdapter<T> r0 = r3.delegate
            if (r0 == 0) goto L5
            goto L11
        L5:
            com.google.gson.Gson r0 = r3.gson
            com.google.gson.TypeAdapterFactory r1 = r3.skipPast
            com.google.gson.reflect.TypeToken<T> r2 = r3.typeToken
            com.google.gson.TypeAdapter r0 = r0.getDelegateAdapter(r1, r2)
            r3.delegate = r0
        L11:
            return r0
    }

    public static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.reflect.TypeToken<?> r3, java.lang.Object r4) {
            com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory r0 = new com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory
            r1 = 0
            r2 = 0
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    public static com.google.gson.TypeAdapterFactory newFactoryWithMatchRawType(com.google.gson.reflect.TypeToken<?> r3, java.lang.Object r4) {
            java.lang.reflect.Type r0 = r3.getType()
            java.lang.Class r1 = r3.getRawType()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory r1 = new com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory
            r2 = 0
            r1.<init>(r4, r3, r0, r2)
            return r1
    }

    public static com.google.gson.TypeAdapterFactory newTypeHierarchyFactory(java.lang.Class<?> r3, java.lang.Object r4) {
            com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory r0 = new com.google.gson.internal.bind.TreeTypeAdapter$SingleTypeFactory
            r1 = 0
            r2 = 0
            r0.<init>(r4, r1, r2, r3)
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public T read(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.JsonDeserializer<T> r0 = r3.deserializer
            if (r0 != 0) goto Ld
            com.google.gson.TypeAdapter r0 = r3.delegate()
            java.lang.Object r4 = r0.read(r4)
            return r4
        Ld:
            com.google.gson.JsonElement r4 = com.google.gson.internal.Streams.parse(r4)
            boolean r0 = r4.isJsonNull()
            if (r0 == 0) goto L19
            r4 = 0
            return r4
        L19:
            com.google.gson.JsonDeserializer<T> r0 = r3.deserializer
            com.google.gson.reflect.TypeToken<T> r1 = r3.typeToken
            java.lang.reflect.Type r1 = r1.getType()
            com.google.gson.internal.bind.TreeTypeAdapter<T>$GsonContextImpl r2 = r3.context
            java.lang.Object r4 = r0.deserialize(r4, r1, r2)
            return r4
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r4, T r5) throws java.io.IOException {
            r3 = this;
            com.google.gson.JsonSerializer<T> r0 = r3.serializer
            if (r0 != 0) goto Lc
            com.google.gson.TypeAdapter r0 = r3.delegate()
            r0.write(r4, r5)
            return
        Lc:
            if (r5 != 0) goto L12
            r4.nullValue()
            return
        L12:
            com.google.gson.reflect.TypeToken<T> r1 = r3.typeToken
            java.lang.reflect.Type r1 = r1.getType()
            com.google.gson.internal.bind.TreeTypeAdapter<T>$GsonContextImpl r2 = r3.context
            com.google.gson.JsonElement r5 = r0.serialize(r5, r1, r2)
            com.google.gson.internal.Streams.write(r5, r4)
            return
    }
}
