package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    public JsonAdapterAnnotationTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            return
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r3, com.google.gson.reflect.TypeToken<T> r4) {
            r2 = this;
            java.lang.Class r0 = r4.getRawType()
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r1 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r0 = r0.getAnnotation(r1)
            com.google.gson.annotations.JsonAdapter r0 = (com.google.gson.annotations.JsonAdapter) r0
            if (r0 != 0) goto L10
            r3 = 0
            return r3
        L10:
            com.google.gson.internal.ConstructorConstructor r1 = r2.constructorConstructor
            com.google.gson.TypeAdapter r3 = r2.getTypeAdapter(r1, r3, r4, r0)
            return r3
    }

    com.google.gson.TypeAdapter<?> getTypeAdapter(com.google.gson.internal.ConstructorConstructor r9, com.google.gson.Gson r10, com.google.gson.reflect.TypeToken<?> r11, com.google.gson.annotations.JsonAdapter r12) {
            r8 = this;
            java.lang.Class r0 = r12.value()
            com.google.gson.reflect.TypeToken r0 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.internal.ObjectConstructor r9 = r9.get(r0)
            java.lang.Object r9 = r9.construct()
            boolean r0 = r9 instanceof com.google.gson.TypeAdapter
            if (r0 == 0) goto L17
            com.google.gson.TypeAdapter r9 = (com.google.gson.TypeAdapter) r9
            goto L76
        L17:
            boolean r0 = r9 instanceof com.google.gson.TypeAdapterFactory
            if (r0 == 0) goto L22
            com.google.gson.TypeAdapterFactory r9 = (com.google.gson.TypeAdapterFactory) r9
            com.google.gson.TypeAdapter r9 = r9.create(r10, r11)
            goto L76
        L22:
            boolean r0 = r9 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto L5c
            boolean r1 = r9 instanceof com.google.gson.JsonDeserializer
            if (r1 == 0) goto L2b
            goto L5c
        L2b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.<init>(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.StringBuilder r9 = r12.append(r9)
            java.lang.String r12 = " as a @JsonAdapter for "
            java.lang.StringBuilder r9 = r9.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L5c:
            r1 = 0
            if (r0 == 0) goto L64
            r0 = r9
            com.google.gson.JsonSerializer r0 = (com.google.gson.JsonSerializer) r0
            r3 = r0
            goto L65
        L64:
            r3 = r1
        L65:
            boolean r0 = r9 instanceof com.google.gson.JsonDeserializer
            if (r0 == 0) goto L6c
            r1 = r9
            com.google.gson.JsonDeserializer r1 = (com.google.gson.JsonDeserializer) r1
        L6c:
            r4 = r1
            com.google.gson.internal.bind.TreeTypeAdapter r9 = new com.google.gson.internal.bind.TreeTypeAdapter
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L76:
            if (r9 == 0) goto L82
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L82
            com.google.gson.TypeAdapter r9 = r9.nullSafe()
        L82:
            return r9
    }
}
