package com.xuexiang.xhttp2.utils;

/* loaded from: classes.dex */
public final class HttpUtils {
    public static final java.nio.charset.Charset UTF8 = null;
    private static com.google.gson.Gson sGson;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            com.xuexiang.xhttp2.utils.HttpUtils.UTF8 = r0
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            com.xuexiang.xhttp2.utils.HttpUtils.sGson = r0
            return
    }

    private HttpUtils() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String createUrlFromParams(java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L70
            r0.<init>()     // Catch: java.io.UnsupportedEncodingException -> L70
            r0.append(r5)     // Catch: java.io.UnsupportedEncodingException -> L70
            r1 = 38
            int r1 = r5.indexOf(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r2 = "&"
            if (r1 > 0) goto L21
            r1 = 63
            int r1 = r5.indexOf(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            if (r1 <= 0) goto L1b
            goto L21
        L1b:
            java.lang.String r1 = "?"
            r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            goto L24
        L21:
            r0.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L70
        L24:
            java.util.Set r6 = r6.entrySet()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.util.Iterator r6 = r6.iterator()     // Catch: java.io.UnsupportedEncodingException -> L70
        L2c:
            boolean r1 = r6.hasNext()     // Catch: java.io.UnsupportedEncodingException -> L70
            if (r1 == 0) goto L62
            java.lang.Object r1 = r6.next()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.Object r3 = r1.getValue()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.nio.charset.Charset r4 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r4 = r4.name()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.Object r1 = r1.getKey()     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.StringBuilder r1 = r0.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r4 = "="
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.io.UnsupportedEncodingException -> L70
            r1.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L70
            goto L2c
        L62:
            int r6 = r0.length()     // Catch: java.io.UnsupportedEncodingException -> L70
            int r6 = r6 + (-1)
            r0.deleteCharAt(r6)     // Catch: java.io.UnsupportedEncodingException -> L70
            java.lang.String r5 = r0.toString()     // Catch: java.io.UnsupportedEncodingException -> L70
            return r5
        L70:
            r6 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r6)
            return r5
    }

    public static java.lang.String getAnnotationParamString(com.xuexiang.xhttp2.model.XHttpRequest r6) throws java.lang.IllegalAccessException {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.reflect.Field[] r1 = r1.getDeclaredFields()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3b
            r4 = r1[r3]
            r5 = 1
            r4.setAccessible(r5)
            java.lang.Class<com.xuexiang.xhttp2.annotation.ParamKey> r5 = com.xuexiang.xhttp2.annotation.ParamKey.class
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r5)
            com.xuexiang.xhttp2.annotation.ParamKey r5 = (com.xuexiang.xhttp2.annotation.ParamKey) r5
            if (r5 == 0) goto L2d
            java.lang.String r5 = r5.key()
            java.lang.Object r4 = r4.get(r6)
            r0.put(r5, r4)
            goto L38
        L2d:
            java.lang.String r5 = r4.getName()
            java.lang.Object r4 = r4.get(r6)
            r0.put(r5, r4)
        L38:
            int r3 = r3 + 1
            goto Lf
        L3b:
            java.lang.String r6 = toJson(r0)
            return r6
    }

    public static okhttp3.Response getErrorResponse(okhttp3.Response r1, int r2, java.lang.String r3) {
            com.xuexiang.xhttp2.model.ApiResult r0 = new com.xuexiang.xhttp2.model.ApiResult
            r0.<init>()
            com.xuexiang.xhttp2.model.ApiResult r2 = r0.setCode(r2)
            com.xuexiang.xhttp2.model.ApiResult r2 = r2.setMsg(r3)
            okhttp3.Response$Builder r1 = r1.newBuilder()
            java.lang.String r2 = toJson(r2)
            okhttp3.ResponseBody r2 = getJsonResponseBody(r2)
            okhttp3.Response$Builder r1 = r1.body(r2)
            okhttp3.Response r1 = r1.build()
            return r1
    }

    public static okhttp3.RequestBody getJsonRequestBody(java.lang.Object r1) {
            java.lang.String r0 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            java.lang.String r1 = toJson(r1)
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create(r0, r1)
            return r1
    }

    public static okhttp3.RequestBody getJsonRequestBody(java.lang.String r1) {
            java.lang.String r0 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create(r0, r1)
            return r1
    }

    public static okhttp3.ResponseBody getJsonResponseBody(java.lang.String r1) {
            java.lang.String r0 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            okhttp3.ResponseBody r1 = okhttp3.ResponseBody.create(r0, r1)
            return r1
    }

    public static java.lang.String getRequestBodyString(okhttp3.Request r3) {
            java.lang.String r0 = ""
            okhttp3.Request$Builder r3 = r3.newBuilder()     // Catch: java.lang.Exception -> L32
            okhttp3.Request r3 = r3.build()     // Catch: java.lang.Exception -> L32
            okio.Buffer r1 = new okio.Buffer     // Catch: java.lang.Exception -> L32
            r1.<init>()     // Catch: java.lang.Exception -> L32
            okhttp3.RequestBody r2 = r3.body()     // Catch: java.lang.Exception -> L32
            if (r2 != 0) goto L16
            return r0
        L16:
            okhttp3.RequestBody r2 = r3.body()     // Catch: java.lang.Exception -> L32
            r2.writeTo(r1)     // Catch: java.lang.Exception -> L32
            java.nio.charset.Charset r2 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8     // Catch: java.lang.Exception -> L32
            okhttp3.RequestBody r3 = r3.body()     // Catch: java.lang.Exception -> L32
            okhttp3.MediaType r3 = r3.contentType()     // Catch: java.lang.Exception -> L32
            if (r3 == 0) goto L2d
            java.nio.charset.Charset r2 = r3.charset(r2)     // Catch: java.lang.Exception -> L32
        L2d:
            java.lang.String r3 = r1.readString(r2)     // Catch: java.lang.Exception -> L32
            return r3
        L32:
            r3 = move-exception
            r3.printStackTrace()
            return r0
    }

    public static byte[] getResponseBody(okhttp3.Response r1) {
            okhttp3.ResponseBody r1 = r1.body()
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            byte[] r0 = r1.bytes()     // Catch: java.io.IOException -> Ld
            goto L11
        Ld:
            r1 = move-exception
            r1.printStackTrace()
        L11:
            return r0
    }

    public static java.lang.String getResponseBodyString(okhttp3.Response r3) throws java.io.IOException {
            okhttp3.ResponseBody r3 = r3.body()
            if (r3 != 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            okio.BufferedSource r0 = r3.source()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.request(r1)
            okio.Buffer r0 = r0.buffer()
            java.nio.charset.Charset r1 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 == 0) goto L25
            java.nio.charset.Charset r1 = r3.charset(r1)
        L25:
            okio.Buffer r3 = r0.m357clone()
            java.lang.String r3 = r3.readString(r1)
            return r3
    }

    public static java.util.Map<java.lang.String, java.lang.String> getUrlParams(java.lang.String r10) {
            r0 = 0
            java.lang.String r1 = "\\?"
            java.lang.String[] r10 = r10.split(r1)     // Catch: java.io.UnsupportedEncodingException -> L4b
            int r1 = r10.length     // Catch: java.io.UnsupportedEncodingException -> L4b
            r2 = 1
            if (r1 <= r2) goto L4f
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.io.UnsupportedEncodingException -> L4b
            r1.<init>()     // Catch: java.io.UnsupportedEncodingException -> L4b
            r10 = r10[r2]     // Catch: java.io.UnsupportedEncodingException -> L48
            java.lang.String r0 = "&"
            java.lang.String[] r10 = r10.split(r0)     // Catch: java.io.UnsupportedEncodingException -> L48
            int r0 = r10.length     // Catch: java.io.UnsupportedEncodingException -> L48
            r3 = 0
            r4 = r3
        L1b:
            if (r4 >= r0) goto L46
            r5 = r10[r4]     // Catch: java.io.UnsupportedEncodingException -> L48
            java.lang.String r6 = "="
            java.lang.String[] r5 = r5.split(r6)     // Catch: java.io.UnsupportedEncodingException -> L48
            r6 = r5[r3]     // Catch: java.io.UnsupportedEncodingException -> L48
            java.nio.charset.Charset r7 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8     // Catch: java.io.UnsupportedEncodingException -> L48
            java.lang.String r8 = r7.name()     // Catch: java.io.UnsupportedEncodingException -> L48
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r8)     // Catch: java.io.UnsupportedEncodingException -> L48
            java.lang.String r8 = ""
            int r9 = r5.length     // Catch: java.io.UnsupportedEncodingException -> L48
            if (r9 <= r2) goto L40
            r5 = r5[r2]     // Catch: java.io.UnsupportedEncodingException -> L48
            java.lang.String r7 = r7.name()     // Catch: java.io.UnsupportedEncodingException -> L48
            java.lang.String r8 = java.net.URLDecoder.decode(r5, r7)     // Catch: java.io.UnsupportedEncodingException -> L48
        L40:
            r1.put(r6, r8)     // Catch: java.io.UnsupportedEncodingException -> L48
            int r4 = r4 + 1
            goto L1b
        L46:
            r0 = r1
            goto L4f
        L48:
            r10 = move-exception
            r0 = r1
            goto L4c
        L4b:
            r10 = move-exception
        L4c:
            r10.printStackTrace()
        L4f:
            return r0
    }

    public static boolean isPlaintext(okhttp3.MediaType r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.type()
            r2 = 1
            if (r1 == 0) goto L18
            java.lang.String r1 = "text"
            java.lang.String r3 = r4.type()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L18
            return r2
        L18:
            java.lang.String r4 = r4.subtype()
            if (r4 == 0) goto L43
            java.lang.String r4 = r4.toLowerCase()
            java.lang.String r1 = "x-www-form-urlencoded"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L42
            java.lang.String r1 = "json"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L42
            java.lang.String r1 = "xml"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L42
            java.lang.String r1 = "html"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L43
        L42:
            r0 = r2
        L43:
            return r0
    }

    public static boolean isText(okhttp3.MediaType r2) {
            if (r2 == 0) goto L28
            java.lang.String r0 = r2.type()
            if (r0 == 0) goto L14
            java.lang.String r0 = "text"
            java.lang.String r1 = r2.type()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
        L14:
            java.lang.String r0 = r2.subtype()
            if (r0 == 0) goto L28
            java.lang.String r0 = "json"
            java.lang.String r2 = r2.subtype()
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L28
        L26:
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }

    public static java.lang.String parseUrl(java.lang.String r2) {
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1b
            java.lang.String r0 = "?"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1b
            r0 = 63
            int r0 = r2.indexOf(r0)
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
        L1b:
            return r2
    }

    public static okhttp3.Request resetUrlParams(okhttp3.Request r1, java.lang.String r2, java.lang.Object r3) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r0.put(r2, r3)
            okhttp3.Request r1 = resetUrlParams(r1, r0)
            return r1
    }

    public static okhttp3.Request resetUrlParams(okhttp3.Request r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            okhttp3.HttpUrl r0 = r1.url()
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = parseUrl(r0)
            java.lang.String r2 = createUrlFromParams(r0, r2)
            okhttp3.Request$Builder r1 = r1.newBuilder()
            okhttp3.Request$Builder r1 = r1.url(r2)
            okhttp3.Request r1 = r1.build()
            return r1
    }

    public static java.lang.String toJson(java.lang.Object r1) {
            com.google.gson.Gson r0 = com.xuexiang.xhttp2.utils.HttpUtils.sGson
            java.lang.String r1 = r0.toJson(r1)
            return r1
    }

    public static okhttp3.Request updateRequestBody(okhttp3.Request r3, java.util.HashMap<java.lang.String, java.lang.Object> r4) {
            java.lang.String r0 = getRequestBodyString(r3)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L40
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L40
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L40
        L11:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> L40
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L40
            java.lang.Object r2 = r0.getKey()     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L40
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L40
            goto L11
        L2b:
            okhttp3.Request$Builder r4 = r3.newBuilder()     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L40
            okhttp3.RequestBody r0 = getJsonRequestBody(r0)     // Catch: java.lang.Throwable -> L40
            okhttp3.Request$Builder r4 = r4.post(r0)     // Catch: java.lang.Throwable -> L40
            okhttp3.Request r3 = r4.build()     // Catch: java.lang.Throwable -> L40
            return r3
        L40:
            r4 = move-exception
            r4.printStackTrace()
            return r3
    }

    public static java.lang.String updateUrlParams(java.lang.String r1, java.lang.String r2, java.lang.Object r3) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r0.put(r2, r3)
            java.lang.String r1 = updateUrlParams(r1, r0)
            return r1
    }

    public static java.lang.String updateUrlParams(java.lang.String r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Map r1 = getUrlParams(r4)
            if (r1 == 0) goto Le
            r0.putAll(r1)
        Le:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.put(r2, r1)
            goto L16
        L32:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = parseUrl(r4)
            java.lang.StringBuilder r1 = r5.append(r1)
            java.lang.String r2 = "?"
            r1.append(r2)
            java.util.Set r0 = r0.entrySet()     // Catch: java.io.UnsupportedEncodingException -> L90
            java.util.Iterator r0 = r0.iterator()     // Catch: java.io.UnsupportedEncodingException -> L90
        L4c:
            boolean r1 = r0.hasNext()     // Catch: java.io.UnsupportedEncodingException -> L90
            if (r1 == 0) goto L82
            java.lang.Object r1 = r0.next()     // Catch: java.io.UnsupportedEncodingException -> L90
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.Object r2 = r1.getValue()     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.io.UnsupportedEncodingException -> L90
            java.nio.charset.Charset r3 = com.xuexiang.xhttp2.utils.HttpUtils.UTF8     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.String r3 = r3.name()     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.Object r1 = r1.getKey()     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.StringBuilder r1 = r5.append(r1)     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.String r3 = "="
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.String r2 = "&"
            r1.append(r2)     // Catch: java.io.UnsupportedEncodingException -> L90
            goto L4c
        L82:
            int r0 = r5.length()     // Catch: java.io.UnsupportedEncodingException -> L90
            int r0 = r0 + (-1)
            r5.deleteCharAt(r0)     // Catch: java.io.UnsupportedEncodingException -> L90
            java.lang.String r4 = r5.toString()     // Catch: java.io.UnsupportedEncodingException -> L90
            return r4
        L90:
            r5 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r5)
            return r4
    }

    public static okhttp3.Request updateUrlParams(okhttp3.Request r1, java.lang.String r2, java.lang.Object r3) {
            okhttp3.Request$Builder r0 = r1.newBuilder()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = updateUrlParams(r1, r2, r3)
            okhttp3.Request$Builder r1 = r0.url(r1)
            okhttp3.Request r1 = r1.build()
            return r1
    }

    public static okhttp3.Request updateUrlParams(okhttp3.Request r1, java.util.Map<java.lang.String, java.lang.Object> r2) {
            okhttp3.Request$Builder r0 = r1.newBuilder()
            okhttp3.HttpUrl r1 = r1.url()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = updateUrlParams(r1, r2)
            okhttp3.Request$Builder r1 = r0.url(r1)
            okhttp3.Request r1 = r1.build()
            return r1
    }
}
