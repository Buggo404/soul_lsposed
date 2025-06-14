package com.xuexiang.xhttp2.utils;

/* loaded from: classes.dex */
public final class RequestBodyUtils {


    private RequestBodyUtils() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    public static okhttp3.RequestBody create(okhttp3.MediaType r1, java.io.InputStream r2) {
            com.xuexiang.xhttp2.utils.RequestBodyUtils$1 r0 = new com.xuexiang.xhttp2.utils.RequestBodyUtils$1
            r0.<init>(r1, r2)
            return r0
    }
}
