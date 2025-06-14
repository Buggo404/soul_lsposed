package com.xuexiang.xhttp2.interceptor;

/* loaded from: classes.dex */
public class CacheInterceptorOffline extends com.xuexiang.xhttp2.interceptor.CacheInterceptor {
    public CacheInterceptorOffline(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public CacheInterceptorOffline(android.content.Context r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public CacheInterceptorOffline(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.xuexiang.xhttp2.interceptor.CacheInterceptor, okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r4) throws java.io.IOException {
            r3 = this;
            okhttp3.Request r0 = r4.request()
            android.content.Context r1 = r3.context
            boolean r1 = com.xuexiang.xhttp2.utils.Utils.isNetworkAvailable(r1)
            if (r1 != 0) goto L62
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " no network load cache:"
            r1.<init>(r2)
            okhttp3.CacheControl r2 = r0.cacheControl()
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r1)
            okhttp3.Request$Builder r0 = r0.newBuilder()
            okhttp3.CacheControl r1 = okhttp3.CacheControl.FORCE_CACHE
            okhttp3.Request$Builder r0 = r0.cacheControl(r1)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r4 = r4.proceed(r0)
            okhttp3.Response$Builder r4 = r4.newBuilder()
            java.lang.String r0 = "Pragma"
            okhttp3.Response$Builder r4 = r4.removeHeader(r0)
            java.lang.String r0 = "Cache-Control"
            okhttp3.Response$Builder r4 = r4.removeHeader(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "public, only-if-cached, "
            r1.<init>(r2)
            java.lang.String r2 = r3.cacheControlValue_Offline
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            okhttp3.Response$Builder r4 = r4.header(r0, r1)
            okhttp3.Response r4 = r4.build()
            return r4
        L62:
            okhttp3.Response r4 = r4.proceed(r0)
            return r4
    }
}
