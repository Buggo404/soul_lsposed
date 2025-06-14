package com.xuexiang.xhttp2.interceptor;

/* loaded from: classes.dex */
public class NoCacheInterceptor implements okhttp3.Interceptor {
    public NoCacheInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r4) throws java.io.IOException {
            r3 = this;
            okhttp3.Request r0 = r4.request()
            okhttp3.Request$Builder r0 = r0.newBuilder()
            java.lang.String r1 = "Cache-Control"
            java.lang.String r2 = "no-cache"
            okhttp3.Request$Builder r0 = r0.header(r1, r2)
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r4 = r4.proceed(r0)
            okhttp3.Response$Builder r4 = r4.newBuilder()
            okhttp3.Response$Builder r4 = r4.header(r1, r2)
            okhttp3.Response r4 = r4.build()
            return r4
    }
}
