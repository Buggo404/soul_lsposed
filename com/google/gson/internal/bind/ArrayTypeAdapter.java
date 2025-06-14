package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends com.google.gson.TypeAdapter<java.lang.Object> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.lang.Class<E> componentType;
    private final com.google.gson.TypeAdapter<E> componentTypeAdapter;


    static {
            com.google.gson.internal.bind.ArrayTypeAdapter$1 r0 = new com.google.gson.internal.bind.ArrayTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.ArrayTypeAdapter.FACTORY = r0
            return
    }

    public ArrayTypeAdapter(com.google.gson.Gson r2, com.google.gson.TypeAdapter<E> r3, java.lang.Class<E> r4) {
            r1 = this;
            r1.<init>()
            com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r0 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper
            r0.<init>(r2, r3, r4)
            r1.componentTypeAdapter = r0
            r1.componentType = r4
            return
    }

    @Override // com.google.gson.TypeAdapter
    public java.lang.Object read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r5.nextNull()
            r5 = 0
            return r5
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.beginArray()
        L15:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L25
            com.google.gson.TypeAdapter<E> r1 = r4.componentTypeAdapter
            java.lang.Object r1 = r1.read(r5)
            r0.add(r1)
            goto L15
        L25:
            r5.endArray()
            int r5 = r0.size()
            java.lang.Class<E> r1 = r4.componentType
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r5)
            r2 = 0
        L33:
            if (r2 >= r5) goto L3f
            java.lang.Object r3 = r0.get(r2)
            java.lang.reflect.Array.set(r1, r2, r3)
            int r2 = r2 + 1
            goto L33
        L3f:
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r5, java.lang.Object r6) throws java.io.IOException {
            r4 = this;
            if (r6 != 0) goto L6
            r5.nullValue()
            return
        L6:
            r5.beginArray()
            int r0 = java.lang.reflect.Array.getLength(r6)
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = java.lang.reflect.Array.get(r6, r1)
            com.google.gson.TypeAdapter<E> r3 = r4.componentTypeAdapter
            r3.write(r5, r2)
            int r1 = r1 + 1
            goto Le
        L1c:
            r5.endArray()
            return
    }
}
