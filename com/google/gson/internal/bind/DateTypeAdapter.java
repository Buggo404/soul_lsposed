package com.google.gson.internal.bind;

/* loaded from: classes.dex */
public final class DateTypeAdapter extends com.google.gson.TypeAdapter<java.util.Date> {
    public static final com.google.gson.TypeAdapterFactory FACTORY = null;
    private final java.util.List<java.text.DateFormat> dateFormats;


    static {
            com.google.gson.internal.bind.DateTypeAdapter$1 r0 = new com.google.gson.internal.bind.DateTypeAdapter$1
            r0.<init>()
            com.google.gson.internal.bind.DateTypeAdapter.FACTORY = r0
            return
    }

    public DateTypeAdapter() {
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.dateFormats = r0
            java.util.Locale r1 = java.util.Locale.US
            r2 = 2
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r2, r2, r1)
            r0.add(r1)
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.util.Locale r3 = java.util.Locale.US
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L27
            java.text.DateFormat r1 = java.text.DateFormat.getDateTimeInstance(r2, r2)
            r0.add(r1)
        L27:
            boolean r1 = com.google.gson.internal.JavaVersion.isJava9OrLater()
            if (r1 == 0) goto L34
            java.text.DateFormat r1 = com.google.gson.internal.PreJava9DateFormatProvider.getUSDateTimeFormat(r2, r2)
            r0.add(r1)
        L34:
            return
    }

    private java.util.Date deserializeToDate(com.google.gson.stream.JsonReader r6) throws java.io.IOException {
            r5 = this;
            java.lang.String r0 = r6.nextString()
            java.util.List<java.text.DateFormat> r1 = r5.dateFormats
            monitor-enter(r1)
            java.util.List<java.text.DateFormat> r2 = r5.dateFormats     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4f
        Ld:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L1f
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4f
            java.text.DateFormat r3 = (java.text.DateFormat) r3     // Catch: java.lang.Throwable -> L4f
            java.util.Date r6 = r3.parse(r0)     // Catch: java.text.ParseException -> Ld java.lang.Throwable -> L4f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            return r6
        L1f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L2b
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L2b
            java.util.Date r6 = com.google.gson.internal.bind.util.ISO8601Utils.parse(r0, r1)     // Catch: java.text.ParseException -> L2b
            return r6
        L2b:
            r1 = move-exception
            com.google.gson.JsonSyntaxException r2 = new com.google.gson.JsonSyntaxException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed parsing '"
            r3.<init>(r4)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = "' as Date; at path "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r6 = r6.getPreviousPath()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6, r1)
            throw r2
        L4f:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L4f
            throw r6
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ java.util.Date read(com.google.gson.stream.JsonReader r1) throws java.io.IOException {
            r0 = this;
            java.util.Date r1 = r0.read2(r1)
            return r1
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public java.util.Date read2(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r3.nextNull()
            r3 = 0
            return r3
        Ld:
            java.util.Date r3 = r2.deserializeToDate(r3)
            return r3
    }

    @Override // com.google.gson.TypeAdapter
    public /* bridge */ /* synthetic */ void write(com.google.gson.stream.JsonWriter r1, java.util.Date r2) throws java.io.IOException {
            r0 = this;
            java.util.Date r2 = (java.util.Date) r2
            r0.write2(r1, r2)
            return
    }

    /* renamed from: write, reason: avoid collision after fix types in other method */
    public void write2(com.google.gson.stream.JsonWriter r3, java.util.Date r4) throws java.io.IOException {
            r2 = this;
            if (r4 != 0) goto L6
            r3.nullValue()
            return
        L6:
            java.util.List<java.text.DateFormat> r0 = r2.dateFormats
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.util.List<java.text.DateFormat> r1 = r2.dateFormats
            monitor-enter(r1)
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            r3.value(r4)
            return
        L1b:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1b
            throw r3
    }
}
