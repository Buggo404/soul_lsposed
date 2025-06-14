package com.google.gson.internal.sql;

/* loaded from: classes.dex */
final class SqlTimeTypeAdapter extends com.google.gson.TypeAdapter<java.sql.Time> {
    static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.text.DateFormat format;


    static {
            com.google.gson.internal.sql.SqlTimeTypeAdapter$1 r0 = new com.google.gson.internal.sql.SqlTimeTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.sql.SqlTimeTypeAdapter.FACTORY = r0
            return
    }

    private SqlTimeTypeAdapter() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "hh:mm:ss a"
            r0.<init>(r1)
            r2.format = r0
            return
    }

    /* synthetic */ SqlTimeTypeAdapter(com.google.gson.internal.sql.SqlTimeTypeAdapter.C08561 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.sql.Time read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.sql.Time r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public java.sql.Time read2(com.google.gson.stream.JsonReader r6) throws java.io.IOException {
            r5 = this;
            com.google.gson.stream.JsonToken r0 = r6.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r6.nextNull()
            r6 = 0
            return r6
        Ld:
            java.lang.String r0 = r6.nextString()
            monitor-enter(r5)     // Catch: java.text.ParseException -> L26
            java.text.DateFormat r1 = r5.format     // Catch: java.lang.Throwable -> L23
            java.util.Date r1 = r1.parse(r0)     // Catch: java.lang.Throwable -> L23
            java.sql.Time r2 = new java.sql.Time     // Catch: java.lang.Throwable -> L23
            long r3 = r1.getTime()     // Catch: java.lang.Throwable -> L23
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r1 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L23
            throw r1     // Catch: java.text.ParseException -> L26
        L26:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed parsing '"
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "' as SQL Time; at path "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r6 = r6.getPreviousPath()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6, r1)
            throw r2
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.sql.Time r2) throws java.io.IOException {
            r0 = this;
            java.sql.Time r2 = (java.sql.Time) r2
            r0.write2(r1, r2)
            return
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r2, java.sql.Time r3) throws java.io.IOException {
            r1 = this;
            if (r3 != 0) goto L6
            r2.nullValue()
            return
        L6:
            monitor-enter(r1)
            java.text.DateFormat r0 = r1.format     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            r2.value(r3)
            return
        L12:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L12
            throw r2
    }
}
