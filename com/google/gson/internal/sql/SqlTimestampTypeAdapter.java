package com.google.gson.internal.sql;

/* loaded from: classes.dex */
class SqlTimestampTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Timestamp> {
    static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final com.google.gson.TypeAdapter<java.util.Date> dateTypeAdapter;


    static {
            com.google.gson.internal.sql.SqlTimestampTypeAdapter$1 r0 = new com.google.gson.internal.sql.SqlTimestampTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.sql.SqlTimestampTypeAdapter.FACTORY = r0
            return
    }

    private SqlTimestampTypeAdapter(com.google.gson.TypeAdapter<java.util.Date> r1) {
            r0 = this;
            r0.<init>()
            r0.dateTypeAdapter = r1
            return
    }

    /* synthetic */ SqlTimestampTypeAdapter(com.google.gson.TypeAdapter r1, com.google.gson.internal.sql.SqlTimestampTypeAdapter.C08571 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Timestamp read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Timestamp r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public java.sql.Timestamp read2(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
            r3 = this;
            com.google.gson.TypeAdapter<java.util.Date> r0 = r3.dateTypeAdapter
            java.lang.Object r4 = r0.read(r4)
            java.util.Date r4 = (java.util.Date) r4
            if (r4 == 0) goto L14
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Timestamp r2) throws java.io.IOException {
            r0 = this;
            java.sql.Timestamp r2 = (java.sql.Timestamp) r2
            r0.write2(r1, r2)
            return
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r2, java.sql.Timestamp r3) throws java.io.IOException {
            r1 = this;
            com.google.gson.TypeAdapter<java.util.Date> r0 = r1.dateTypeAdapter
            r0.write(r2, r3)
            return
    }
}
