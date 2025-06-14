package com.google.gson.internal.sql;

/* loaded from: classes.dex */
public final class SqlTypesSupport {
    public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<? extends java.util.Date> DATE_DATE_TYPE = null;
    public static final com.google.gson.TypeAdapterFactory DATE_FACTORY = null;
    public static final boolean SUPPORTS_SQL_TYPES = false;
    public static final com.google.gson.internal.bind.DefaultDateTypeAdapter.DateType<? extends java.util.Date> TIMESTAMP_DATE_TYPE = null;
    public static final com.google.gson.TypeAdapterFactory TIMESTAMP_FACTORY = null;
    public static final com.google.gson.TypeAdapterFactory TIME_FACTORY = null;



    static {
            java.lang.String r0 = "java.sql.Date"
            java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.gson.internal.sql.SqlTypesSupport.SUPPORTS_SQL_TYPES = r0
            if (r0 == 0) goto L2b
            com.google.gson.internal.sql.SqlTypesSupport$1 r0 = new com.google.gson.internal.sql.SqlTypesSupport$1
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            r0.<init>(r1)
            com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE = r0
            com.google.gson.internal.sql.SqlTypesSupport$2 r0 = new com.google.gson.internal.sql.SqlTypesSupport$2
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            r0.<init>(r1)
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE = r0
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.sql.SqlDateTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY = r0
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.sql.SqlTimeTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY = r0
            com.google.gson.TypeAdapterFactory r0 = com.google.gson.internal.sql.SqlTimestampTypeAdapter.FACTORY
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY = r0
            goto L36
        L2b:
            r0 = 0
            com.google.gson.internal.sql.SqlTypesSupport.DATE_DATE_TYPE = r0
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_DATE_TYPE = r0
            com.google.gson.internal.sql.SqlTypesSupport.DATE_FACTORY = r0
            com.google.gson.internal.sql.SqlTypesSupport.TIME_FACTORY = r0
            com.google.gson.internal.sql.SqlTypesSupport.TIMESTAMP_FACTORY = r0
        L36:
            return
    }

    private SqlTypesSupport() {
            r0 = this;
            r0.<init>()
            return
    }
}
