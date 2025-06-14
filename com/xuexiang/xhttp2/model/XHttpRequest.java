package com.xuexiang.xhttp2.model;

@com.xuexiang.xhttp2.annotation.RequestParams
/* loaded from: classes.dex */
public abstract class XHttpRequest {
    public XHttpRequest() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.xuexiang.xhttp2.annotation.RequestParams getHttpRequestParams(java.lang.Class<? extends com.xuexiang.xhttp2.model.XHttpRequest> r1) {
            java.lang.Class<com.xuexiang.xhttp2.annotation.RequestParams> r0 = com.xuexiang.xhttp2.annotation.RequestParams.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            java.lang.String r0 = "requestParams == null"
            java.lang.Object r1 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r1, r0)
            com.xuexiang.xhttp2.annotation.RequestParams r1 = (com.xuexiang.xhttp2.annotation.RequestParams) r1
            return r1
    }

    public static java.lang.String getUrl(java.lang.Class<? extends com.xuexiang.xhttp2.model.XHttpRequest> r0) {
            com.xuexiang.xhttp2.annotation.RequestParams r0 = getHttpRequestParams(r0)
            java.lang.String r0 = r0.url()
            return r0
    }

    public java.lang.String getBaseUrl() {
            r1 = this;
            com.xuexiang.xhttp2.annotation.RequestParams r0 = r1.getRequestParams()
            java.lang.String r0 = r0.baseUrl()
            return r0
    }

    public com.xuexiang.xhttp2.cache.model.CacheMode getCacheMode() {
            r1 = this;
            com.xuexiang.xhttp2.annotation.RequestParams r0 = r1.getRequestParams()
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = r0.cacheMode()
            return r0
    }

    public com.xuexiang.xhttp2.annotation.RequestParams getRequestParams() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            com.xuexiang.xhttp2.annotation.RequestParams r0 = getHttpRequestParams(r0)
            return r0
    }

    protected abstract <T> T getResponseEntityType();

    public long getTimeout() {
            r2 = this;
            com.xuexiang.xhttp2.annotation.RequestParams r0 = r2.getRequestParams()
            long r0 = r0.timeout()
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            com.xuexiang.xhttp2.annotation.RequestParams r0 = r1.getRequestParams()
            java.lang.String r0 = r0.url()
            return r0
    }

    public boolean isAccessToken() {
            r1 = this;
            com.xuexiang.xhttp2.annotation.RequestParams r0 = r1.getRequestParams()
            boolean r0 = r0.accessToken()
            return r0
    }

    public java.lang.reflect.Type parseReturnType() {
            r4 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.SecurityException -> L18 java.lang.NoSuchMethodException -> L1d
            java.lang.String r2 = "getResponseEntityType"
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.SecurityException -> L18 java.lang.NoSuchMethodException -> L1d
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.SecurityException -> L18 java.lang.NoSuchMethodException -> L1d
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.SecurityException -> L18 java.lang.NoSuchMethodException -> L1d
            java.lang.reflect.Type r0 = r1.getGenericReturnType()     // Catch: java.lang.SecurityException -> L18 java.lang.NoSuchMethodException -> L1d
            goto L21
        L18:
            r1 = move-exception
            r1.printStackTrace()
            goto L21
        L1d:
            r1 = move-exception
            r1.printStackTrace()
        L21:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = com.xuexiang.xhttp2.utils.HttpUtils.toJson(r1)
            return r0
    }
}
