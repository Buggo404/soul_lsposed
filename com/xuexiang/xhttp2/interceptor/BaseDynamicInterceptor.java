package com.xuexiang.xhttp2.interceptor;

import com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor;

/* loaded from: classes.dex */
public abstract class BaseDynamicInterceptor<R extends com.xuexiang.xhttp2.interceptor.BaseDynamicInterceptor> implements okhttp3.Interceptor {
    private static final java.lang.String ACTION_GET = "GET";
    private static final java.lang.String ACTION_POST = "POST";
    private boolean mAccessToken;
    private okhttp3.HttpUrl mHttpUrl;
    private boolean mIsSign;
    private boolean mTimeStamp;

    public BaseDynamicInterceptor() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mIsSign = r0
            r1.mTimeStamp = r0
            r1.mAccessToken = r0
            return
    }

    private okhttp3.Request addGetParamsSign(okhttp3.Request r9) throws java.io.UnsupportedEncodingException {
            r8 = this;
            okhttp3.HttpUrl r0 = r9.url()
            okhttp3.HttpUrl$Builder r1 = r0.newBuilder()
            java.util.Set r2 = r0.queryParameterNames()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r4 = 0
            r5 = r4
        L18:
            int r6 = r3.size()
            if (r5 >= r6) goto L41
            java.lang.Object r6 = r3.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            java.util.List r6 = r0.queryParameterValues(r6)
            int r7 = r6.size()
            if (r7 <= 0) goto L35
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            goto L37
        L35:
            java.lang.String r6 = ""
        L37:
            java.lang.Object r7 = r3.get(r5)
            r2.put(r7, r6)
            int r5 = r5 + 1
            goto L18
        L41:
            java.util.List r0 = java.util.Collections.singletonList(r3)
            java.lang.String r0 = r0.toString()
            java.util.TreeMap r2 = r8.updateDynamicParams(r2)
            java.lang.String r3 = "newParams==null"
            com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r3)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L5a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.nio.charset.Charset r5 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8
            java.lang.String r5 = r5.name()
            java.lang.String r4 = java.net.URLEncoder.encode(r4, r5)
            java.lang.Object r5 = r3.getKey()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = r0.contains(r5)
            if (r5 != 0) goto L5a
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r1.addQueryParameter(r3, r4)
            goto L5a
        L8e:
            okhttp3.HttpUrl r0 = r1.build()
            okhttp3.Request$Builder r9 = r9.newBuilder()
            okhttp3.Request$Builder r9 = r9.url(r0)
            okhttp3.Request r9 = r8.createNewRequest(r9)
            return r9
    }

    private okhttp3.Request addPostParamsSign(okhttp3.Request r7) throws java.io.UnsupportedEncodingException {
            r6 = this;
            okhttp3.RequestBody r0 = r7.body()
            boolean r0 = r0 instanceof okhttp3.FormBody
            if (r0 == 0) goto L8d
            okhttp3.FormBody$Builder r0 = new okhttp3.FormBody$Builder
            r0.<init>()
            okhttp3.RequestBody r1 = r7.body()
            okhttp3.FormBody r1 = (okhttp3.FormBody) r1
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r3 = 0
        L19:
            int r4 = r1.size()
            if (r3 >= r4) goto L2d
            java.lang.String r4 = r1.encodedName(r3)
            java.lang.String r5 = r1.encodedValue(r3)
            r2.put(r4, r5)
            int r3 = r3 + 1
            goto L19
        L2d:
            java.util.TreeMap r1 = r6.updateDynamicParams(r2)
            java.lang.String r2 = "newParams == null"
            com.xuexiang.xhttp2.utils.Utils.checkNotNull(r1, r2)
            java.util.Set r2 = r1.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L3e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L66
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.nio.charset.Charset r5 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8
            java.lang.String r5 = r5.name()
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r5)
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r0.addEncoded(r3, r4)
            goto L3e
        L66:
            okhttp3.HttpUrl r2 = r6.mHttpUrl
            java.net.URL r2 = r2.url()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = com.xuexiang.xhttp2.utils.HttpUtils.parseUrl(r2)
            java.lang.String r1 = com.xuexiang.xhttp2.utils.HttpUtils.createUrlFromParams(r2, r1)
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r1)
            okhttp3.FormBody r0 = r0.build()
            okhttp3.Request$Builder r7 = r7.newBuilder()
            okhttp3.Request$Builder r7 = r7.post(r0)
            okhttp3.Request r7 = r6.createNewRequest(r7)
            goto L136
        L8d:
            okhttp3.RequestBody r0 = r7.body()
            boolean r0 = r0 instanceof okhttp3.MultipartBody
            if (r0 == 0) goto L107
            okhttp3.RequestBody r0 = r7.body()
            okhttp3.MultipartBody r0 = (okhttp3.MultipartBody) r0
            okhttp3.MultipartBody$Builder r1 = new okhttp3.MultipartBody$Builder
            r1.<init>()
            okhttp3.MediaType r2 = okhttp3.MultipartBody.FORM
            okhttp3.MultipartBody$Builder r1 = r1.setType(r2)
            java.util.List r0 = r0.parts()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.TreeMap r0 = r6.updateDynamicParams(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lc0:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto Le2
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            okhttp3.MultipartBody$Part r3 = okhttp3.MultipartBody.Part.createFormData(r4, r3)
            r2.add(r3)
            goto Lc0
        Le2:
            java.util.Iterator r0 = r2.iterator()
        Le6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf6
            java.lang.Object r2 = r0.next()
            okhttp3.MultipartBody$Part r2 = (okhttp3.MultipartBody.Part) r2
            r1.addPart(r2)
            goto Le6
        Lf6:
            okhttp3.MultipartBody r0 = r1.build()
            okhttp3.Request$Builder r7 = r7.newBuilder()
            okhttp3.Request$Builder r7 = r7.post(r0)
            okhttp3.Request r7 = r6.createNewRequest(r7)
            goto L136
        L107:
            okhttp3.RequestBody r0 = r7.body()
            boolean r0 = r0 instanceof okhttp3.RequestBody
            if (r0 == 0) goto L136
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.util.TreeMap r0 = r6.updateDynamicParams(r0)
            okhttp3.HttpUrl r1 = r6.mHttpUrl
            java.net.URL r1 = r1.url()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.xuexiang.xhttp2.utils.HttpUtils.parseUrl(r1)
            java.lang.String r0 = com.xuexiang.xhttp2.utils.HttpUtils.createUrlFromParams(r1, r0)
            okhttp3.Request$Builder r7 = r7.newBuilder()
            okhttp3.Request$Builder r7 = r7.url(r0)
            okhttp3.Request r7 = r6.createNewRequest(r7)
        L136:
            return r7
    }

    private okhttp3.Request createNewRequest(okhttp3.Request.Builder r1) {
            r0 = this;
            okhttp3.Request$Builder r1 = r0.updateHeaders(r1)
            okhttp3.Request r1 = r1.build()
            return r1
    }

    public R accessToken(boolean r1) {
            r0 = this;
            r0.mAccessToken = r1
            return r0
    }

    public okhttp3.HttpUrl getHttpUrl() {
            r1 = this;
            okhttp3.HttpUrl r0 = r1.mHttpUrl
            return r0
    }

    @Override // okhttp3.Interceptor
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r4) throws java.io.IOException {
            r3 = this;
            okhttp3.Request r0 = r4.request()
            java.lang.String r1 = "GET"
            java.lang.String r2 = r0.method()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L27
            okhttp3.HttpUrl r1 = r0.url()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = com.xuexiang.xhttp2.utils.HttpUtils.parseUrl(r1)
            okhttp3.HttpUrl r1 = okhttp3.HttpUrl.parse(r1)
            r3.mHttpUrl = r1
            okhttp3.Request r0 = r3.addGetParamsSign(r0)
            goto L46
        L27:
            java.lang.String r1 = "POST"
            java.lang.String r2 = r0.method()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3e
            okhttp3.HttpUrl r1 = r0.url()
            r3.mHttpUrl = r1
            okhttp3.Request r0 = r3.addPostParamsSign(r0)
            goto L46
        L3e:
            okhttp3.Request$Builder r0 = r0.newBuilder()
            okhttp3.Request r0 = r3.createNewRequest(r0)
        L46:
            okhttp3.Response r4 = r4.proceed(r0)
            return r4
    }

    public boolean isAccessToken() {
            r1 = this;
            boolean r0 = r1.mAccessToken
            return r0
    }

    public boolean isSign() {
            r1 = this;
            boolean r0 = r1.mIsSign
            return r0
    }

    public boolean isTimeStamp() {
            r1 = this;
            boolean r0 = r1.mTimeStamp
            return r0
    }

    public R sign(boolean r1) {
            r0 = this;
            r0.mIsSign = r1
            return r0
    }

    public R timeStamp(boolean r1) {
            r0 = this;
            r0.mTimeStamp = r1
            return r0
    }

    protected abstract java.util.TreeMap<java.lang.String, java.lang.Object> updateDynamicParams(java.util.TreeMap<java.lang.String, java.lang.Object> r1);

    protected okhttp3.Request.Builder updateHeaders(okhttp3.Request.Builder r1) {
            r0 = this;
            return r1
    }
}
