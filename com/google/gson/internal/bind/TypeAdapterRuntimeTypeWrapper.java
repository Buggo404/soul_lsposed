package com.google.gson.internal.bind;

/* loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends com.google.gson.TypeAdapter<T> {
    private final com.google.gson.Gson context;
    private final com.google.gson.TypeAdapter<T> delegate;
    private final java.lang.reflect.Type type;

    TypeAdapterRuntimeTypeWrapper(com.google.gson.Gson r1, com.google.gson.TypeAdapter<T> r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.delegate = r2
            r0.type = r3
            return
    }

    private java.lang.reflect.Type getRuntimeTypeIfMoreSpecific(java.lang.reflect.Type r2, java.lang.Object r3) {
            r1 = this;
            if (r3 == 0) goto L12
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r2 == r0) goto Le
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 != 0) goto Le
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 == 0) goto L12
        Le:
            java.lang.Class r2 = r3.getClass()
        L12:
            return r2
    }

    @Override // com.google.gson.TypeAdapter
    public T read(com.google.gson.stream.JsonReader r2) throws java.io.IOException {
            r1 = this;
            com.google.gson.TypeAdapter<T> r0 = r1.delegate
            java.lang.Object r2 = r0.read(r2)
            return r2
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r4, T r5) throws java.io.IOException {
            r3 = this;
            com.google.gson.TypeAdapter<T> r0 = r3.delegate
            java.lang.reflect.Type r1 = r3.type
            java.lang.reflect.Type r1 = r3.getRuntimeTypeIfMoreSpecific(r1, r5)
            java.lang.reflect.Type r2 = r3.type
            if (r1 == r2) goto L22
            com.google.gson.Gson r0 = r3.context
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r1)
            com.google.gson.TypeAdapter r0 = r0.getAdapter(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L1b
            goto L22
        L1b:
            com.google.gson.TypeAdapter<T> r1 = r3.delegate
            boolean r2 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r2 != 0) goto L22
            r0 = r1
        L22:
            r0.write(r4, r5)
            return
    }
}
