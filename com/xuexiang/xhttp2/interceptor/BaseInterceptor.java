package com.xuexiang.xhttp2.interceptor;

/* loaded from: classes.dex */
public abstract class BaseInterceptor implements okhttp3.Interceptor {
    public BaseInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    private okhttp3.MediaType getMediaType(okhttp3.Response r2) {
            r1 = this;
            okhttp3.ResponseBody r0 = r2.body()
            if (r0 == 0) goto Lf
            okhttp3.ResponseBody r2 = r2.body()
            okhttp3.MediaType r2 = r2.contentType()
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r3) throws java.io.IOException {
            r2 = this;
            okhttp3.Request r0 = r3.request()
            okhttp3.Request r0 = r2.onBeforeRequest(r0, r3)
            if (r0 == 0) goto Lb
            goto Lf
        Lb:
            okhttp3.Request r0 = r3.request()
        Lf:
            okhttp3.Response r0 = r3.proceed(r0)
            okhttp3.MediaType r1 = r2.getMediaType(r0)
            boolean r1 = com.xuexiang.xhttp2.utils.HttpUtils.isText(r1)
            if (r1 != 0) goto L1e
            return r0
        L1e:
            java.lang.String r1 = com.xuexiang.xhttp2.utils.HttpUtils.getResponseBodyString(r0)
            okhttp3.Response r3 = r2.onAfterRequest(r0, r3, r1)
            if (r3 == 0) goto L29
            return r3
        L29:
            return r0
    }

    protected abstract okhttp3.Response onAfterRequest(okhttp3.Response r1, okhttp3.Interceptor.Chain r2, java.lang.String r3);

    protected abstract okhttp3.Request onBeforeRequest(okhttp3.Request r1, okhttp3.Interceptor.Chain r2);
}
