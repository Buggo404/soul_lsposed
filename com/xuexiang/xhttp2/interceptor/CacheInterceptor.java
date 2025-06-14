package com.xuexiang.xhttp2.interceptor;

/* loaded from: classes.dex */
public class CacheInterceptor implements okhttp3.Interceptor {
    protected static final int maxStale = 259200;
    protected static final int maxStaleOnline = 60;
    protected java.lang.String cacheControlValue_Offline;
    protected java.lang.String cacheControlValue_Online;
    protected android.content.Context context;

    public CacheInterceptor(android.content.Context r4) {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 60
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "max-age=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r4, r0)
            return
    }

    public CacheInterceptor(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 259200(0x3f480, float:3.63217E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "max-age=%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r3.<init>(r4, r5, r0)
            return
    }

    public CacheInterceptor(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.cacheControlValue_Offline = r2
            r0.cacheControlValue_Online = r3
            return
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r5) throws java.io.IOException {
            r4 = this;
            okhttp3.Request r0 = r5.request()
            okhttp3.Response r5 = r5.proceed(r0)
            java.lang.String r0 = "Cache-Control"
            java.lang.String r1 = r5.header(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "60s load cache:"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m34e(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L50
            java.lang.String r2 = "no-store"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L50
            java.lang.String r2 = "no-cache"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L50
            java.lang.String r2 = "must-revalidate"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L50
            java.lang.String r2 = "max-age"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L50
            java.lang.String r2 = "max-stale"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L4f
            goto L50
        L4f:
            return r5
        L50:
            okhttp3.Response$Builder r5 = r5.newBuilder()
            java.lang.String r1 = "Pragma"
            okhttp3.Response$Builder r5 = r5.removeHeader(r1)
            okhttp3.Response$Builder r5 = r5.removeHeader(r0)
            java.lang.String r1 = "public, max-age=259200"
            okhttp3.Response$Builder r5 = r5.header(r0, r1)
            okhttp3.Response r5 = r5.build()
            return r5
    }
}
