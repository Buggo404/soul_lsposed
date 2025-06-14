package com.xuexiang.xhttp2.interceptor;

/* loaded from: classes.dex */
public class HeadersInterceptor implements okhttp3.Interceptor {
    private com.xuexiang.xhttp2.model.HttpHeaders headers;

    public HeadersInterceptor(com.xuexiang.xhttp2.model.HttpHeaders r1) {
            r0 = this;
            r0.<init>()
            r0.headers = r1
            return
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r5) throws java.io.IOException {
            r4 = this;
            okhttp3.Request r0 = r5.request()
            okhttp3.Request$Builder r0 = r0.newBuilder()
            com.xuexiang.xhttp2.model.HttpHeaders r1 = r4.headers
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r1.headersMap
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1b
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r5 = r5.proceed(r0)
            return r5
        L1b:
            com.xuexiang.xhttp2.model.HttpHeaders r1 = r4.headers     // Catch: java.lang.Exception -> L47
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r1.headersMap     // Catch: java.lang.Exception -> L47
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L47
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L47
        L27:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L47
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Exception -> L47
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Exception -> L47
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L47
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L47
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L47
            okhttp3.Request$Builder r2 = r0.addHeader(r3, r2)     // Catch: java.lang.Exception -> L47
            r2.build()     // Catch: java.lang.Exception -> L47
            goto L27
        L47:
            r1 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r1)
        L4b:
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r5 = r5.proceed(r0)
            return r5
    }
}
