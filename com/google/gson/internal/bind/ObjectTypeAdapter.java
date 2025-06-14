package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class ObjectTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Object> {
    private static final com.google.gson.TypeAdapterFactory DOUBLE_FACTORY = null;
    private final com.google.gson.Gson gson;
    private final com.google.gson.ToNumberStrategy toNumberStrategy;


    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$2 */
    static /* synthetic */ class C08162 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_ARRAY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BEGIN_OBJECT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L33
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L3e
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.BOOLEAN     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L49
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                return
        }
    }

    static {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            com.google.gson.TypeAdapterFactory r0 = newFactory(r0)
            com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY = r0
            return
    }

    private ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2) {
            r0 = this;
            r0.<init>()
            r0.gson = r1
            r0.toNumberStrategy = r2
            return
    }

    /* synthetic */ ObjectTypeAdapter(com.google.gson.Gson r1, com.google.gson.ToNumberStrategy r2, com.google.gson.internal.bind.ObjectTypeAdapter.C08151 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.DOUBLE
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.ObjectTypeAdapter.DOUBLE_FACTORY
            return r1
        L7:
            com.google.gson.TypeAdapterFactory r1 = newFactory(r1)
            return r1
    }

    private static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.internal.bind.ObjectTypeAdapter$1 r0 = new com.google.gson.internal.bind.ObjectTypeAdapter$1
            r0.<init>(r1)
            return r0
    }

    private java.lang.Object readTerminal(com.google.gson.stream.JsonReader r3, com.google.gson.stream.JsonToken r4) throws java.io.IOException {
            r2 = this;
            int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 3
            if (r0 == r1) goto L3e
            r1 = 4
            if (r0 == r1) goto L37
            r1 = 5
            if (r0 == r1) goto L2e
            r1 = 6
            if (r0 != r1) goto L19
            r3.nextNull()
            r3 = 0
            return r3
        L19:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected token: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2e:
            boolean r3 = r3.nextBoolean()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L37:
            com.google.gson.ToNumberStrategy r4 = r2.toNumberStrategy
            java.lang.Number r3 = r4.readNumber(r3)
            return r3
        L3e:
            java.lang.String r3 = r3.nextString()
            return r3
    }

    private java.lang.Object tryBeginNesting(com.google.gson.stream.JsonReader r2, com.google.gson.stream.JsonToken r3) throws java.io.IOException {
            r1 = this;
            int[] r0 = com.google.gson.internal.bind.ObjectTypeAdapter.C08162.$SwitchMap$com$google$gson$stream$JsonToken
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L19
            r0 = 2
            if (r3 == r0) goto L10
            r2 = 0
            return r2
        L10:
            r2.beginObject()
            com.google.gson.internal.LinkedTreeMap r2 = new com.google.gson.internal.LinkedTreeMap
            r2.<init>()
            return r2
        L19:
            r2.beginArray()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            return r2
    }

    @Override // com.google.gson.TypeAdapter
    public java.lang.Object read(com.google.gson.stream.JsonReader r7) throws java.io.IOException {
            r6 = this;
            com.google.gson.stream.JsonToken r0 = r7.peek()
            java.lang.Object r1 = r6.tryBeginNesting(r7, r0)
            if (r1 != 0) goto Lf
            java.lang.Object r7 = r6.readTerminal(r7, r0)
            return r7
        Lf:
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
        L14:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L4f
            boolean r2 = r1 instanceof java.util.Map
            if (r2 == 0) goto L23
            java.lang.String r2 = r7.nextName()
            goto L24
        L23:
            r2 = 0
        L24:
            com.google.gson.stream.JsonToken r3 = r7.peek()
            java.lang.Object r4 = r6.tryBeginNesting(r7, r3)
            if (r4 == 0) goto L30
            r5 = 1
            goto L31
        L30:
            r5 = 0
        L31:
            if (r4 != 0) goto L37
            java.lang.Object r4 = r6.readTerminal(r7, r3)
        L37:
            boolean r3 = r1 instanceof java.util.List
            if (r3 == 0) goto L42
            r2 = r1
            java.util.List r2 = (java.util.List) r2
            r2.add(r4)
            goto L48
        L42:
            r3 = r1
            java.util.Map r3 = (java.util.Map) r3
            r3.put(r2, r4)
        L48:
            if (r5 == 0) goto L14
            r0.addLast(r1)
            r1 = r4
            goto L14
        L4f:
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L57
            r7.endArray()
            goto L5a
        L57:
            r7.endObject()
        L5a:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L61
            return r1
        L61:
            java.lang.Object r1 = r0.removeLast()
            goto L14
    }

    @Override // com.google.gson.TypeAdapter
    public void write(com.google.gson.stream.JsonWriter r3, java.lang.Object r4) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L6
            r3.nullValue()
            return
        L6:
            com.google.gson.Gson r0 = r2.gson
            java.lang.Class r1 = r4.getClass()
            com.google.gson.TypeAdapter r0 = r0.getAdapter(r1)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ObjectTypeAdapter
            if (r1 == 0) goto L1b
            r3.beginObject()
            r3.endObject()
            return
        L1b:
            r0.write(r3, r4)
            return
    }
}
