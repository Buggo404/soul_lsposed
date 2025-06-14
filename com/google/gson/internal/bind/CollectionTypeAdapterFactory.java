package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements com.google.gson.TypeAdapterFactory {
    private final com.google.gson.internal.ConstructorConstructor constructorConstructor;

    private static final class Adapter<E> extends com.google.gson.TypeAdapter<java.util.Collection<E>> {
        private final com.google.gson.internal.ObjectConstructor<? extends java.util.Collection<E>> constructor;
        private final com.google.gson.TypeAdapter<E> elementTypeAdapter;

        public Adapter(com.google.gson.Gson r2, java.lang.reflect.Type r3, com.google.gson.TypeAdapter<E> r4, com.google.gson.internal.ObjectConstructor<? extends java.util.Collection<E>> r5) {
                r1 = this;
                r1.<init>()
                com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper r0 = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper
                r0.<init>(r2, r4, r3)
                r1.elementTypeAdapter = r0
                r1.constructor = r5
                return
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ java.lang.Object read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
                r0 = this;
                java.util.Collection r1 = r0.read(r1)
                return r1
        }

        @Override // com.google.gson.TypeAdapter
        public java.util.Collection<E> read(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
                r2 = this;
                com.google.gson.stream.JsonToken r0 = r3.peek()
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
                if (r0 != r1) goto Ld
                r3.nextNull()
                r3 = 0
                return r3
            Ld:
                com.google.gson.internal.ObjectConstructor<? extends java.util.Collection<E>> r0 = r2.constructor
                java.lang.Object r0 = r0.construct()
                java.util.Collection r0 = (java.util.Collection) r0
                r3.beginArray()
            L18:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L28
                com.google.gson.TypeAdapter<E> r1 = r2.elementTypeAdapter
                java.lang.Object r1 = r1.read(r3)
                r0.add(r1)
                goto L18
            L28:
                r3.endArray()
                return r0
        }

        @Override // com.google.gson.TypeAdapter
        public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Object r2) throws java.io.IOException {
                r0 = this;
                java.util.Collection r2 = (java.util.Collection) r2
                r0.write(r1, r2)
                return
        }

        public void write(com.google.gson.stream.JsonWriter r3, java.util.Collection<E> r4) throws java.io.IOException {
                r2 = this;
                if (r4 != 0) goto L6
                r3.nullValue()
                return
            L6:
                r3.beginArray()
                java.util.Iterator r4 = r4.iterator()
            Ld:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L1d
                java.lang.Object r0 = r4.next()
                com.google.gson.TypeAdapter<E> r1 = r2.elementTypeAdapter
                r1.write(r3, r0)
                goto Ld
            L1d:
                r3.endArray()
                return
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.ConstructorConstructor r1) {
            r0 = this;
            r0.<init>()
            r0.constructorConstructor = r1
            return
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <T> com.google.gson.TypeAdapter<T> create(com.google.gson.Gson r4, com.google.gson.reflect.TypeToken<T> r5) {
            r3 = this;
            java.lang.reflect.Type r0 = r5.getType()
            java.lang.Class r1 = r5.getRawType()
            java.lang.Class<java.util.Collection> r2 = java.util.Collection.class
            boolean r2 = r2.isAssignableFrom(r1)
            if (r2 != 0) goto L12
            r4 = 0
            return r4
        L12:
            java.lang.reflect.Type r0 = com.google.gson.internal.C$Gson$Types.getCollectionElementType(r0, r1)
            com.google.gson.reflect.TypeToken r1 = com.google.gson.reflect.TypeToken.get(r0)
            com.google.gson.TypeAdapter r1 = r4.getAdapter(r1)
            com.google.gson.internal.ConstructorConstructor r2 = r3.constructorConstructor
            com.google.gson.internal.ObjectConstructor r5 = r2.get(r5)
            com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter r2 = new com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter
            r2.<init>(r4, r0, r1, r5)
            return r2
    }
}
