package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class NumberTypeAdapter extends com.google.gson.TypeAdapter<java.lang.Number> {
    private static final com.google.gson.TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY = null;
    private final com.google.gson.ToNumberStrategy toNumberStrategy;


    /* renamed from: com.google.gson.internal.bind.NumberTypeAdapter$2 */
    static /* synthetic */ class C08142 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken = null;

        static {
                com.google.gson.stream.JsonToken[] r0 = com.google.gson.stream.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.gson.internal.bind.NumberTypeAdapter.C08142.$SwitchMap$com$google$gson$stream$JsonToken = r0
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.gson.internal.bind.NumberTypeAdapter.C08142.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NUMBER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.google.gson.internal.bind.NumberTypeAdapter.C08142.$SwitchMap$com$google$gson$stream$JsonToken     // Catch: java.lang.NoSuchFieldError -> L28
                com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.STRING     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER
            com.google.gson.TypeAdapterFactory r0 = newFactory(r0)
            com.google.gson.internal.bind.NumberTypeAdapter.LAZILY_PARSED_NUMBER_FACTORY = r0
            return
    }

    private NumberTypeAdapter(com.google.gson.ToNumberStrategy r1) {
            r0 = this;
            r0.<init>()
            r0.toNumberStrategy = r1
            return
    }

    public static com.google.gson.TypeAdapterFactory getFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.ToNumberPolicy r0 = com.google.gson.ToNumberPolicy.LAZILY_PARSED_NUMBER
            if (r1 != r0) goto L7
            com.google.gson.TypeAdapterFactory r1 = com.google.gson.internal.bind.NumberTypeAdapter.LAZILY_PARSED_NUMBER_FACTORY
            return r1
        L7:
            com.google.gson.TypeAdapterFactory r1 = newFactory(r1)
            return r1
    }

    private static com.google.gson.TypeAdapterFactory newFactory(com.google.gson.ToNumberStrategy r1) {
            com.google.gson.internal.bind.NumberTypeAdapter r0 = new com.google.gson.internal.bind.NumberTypeAdapter
            r0.<init>(r1)
            com.google.gson.internal.bind.NumberTypeAdapter$1 r1 = new com.google.gson.internal.bind.NumberTypeAdapter$1
            r1.<init>(r0)
            return r1
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public java.lang.Number read(com.google.gson.stream.JsonReader r5) throws java.io.IOException {
            r4 = this;
            com.google.gson.stream.JsonToken r0 = r5.peek()
            int[] r1 = com.google.gson.internal.bind.NumberTypeAdapter.C08142.$SwitchMap$com$google$gson$stream$JsonToken
            int r2 = r0.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L40
            r2 = 2
            if (r1 == r2) goto L39
            r2 = 3
            if (r1 != r2) goto L16
            goto L39
        L16:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expecting number, got: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "; at path "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r5 = r5.getPath()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L39:
            com.google.gson.ToNumberStrategy r0 = r4.toNumberStrategy
            java.lang.Number r5 = r0.readNumber(r5)
            return r5
        L40:
            r5.nextNull()
            r5 = 0
            return r5
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.lang.Number read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.lang.Number r1 = r0.read(r1)
            return r1
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r1, java.lang.Number r2) throws java.io.IOException {
            r0 = this;
            r1.value(r2)
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.lang.Number r2) throws java.io.IOException {
            r0 = this;
            java.lang.Number r2 = (java.lang.Number) r2
            r0.write2(r1, r2)
            return
    }
}
