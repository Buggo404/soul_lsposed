package com.xuexiang.xhttp2.model;

/* loaded from: classes.dex */
public class HttpHeaders implements java.io.Serializable {
    public static final java.lang.String FORMAT_HTTP_DATA = "EEE, dd MMM y HH:mm:ss 'GMT'";
    public static final java.util.TimeZone GMT_TIME_ZONE = null;
    public static final java.lang.String HEAD_KEY_ACCEPT = "Accept";
    public static final java.lang.String HEAD_KEY_ACCEPT_ENCODING = "Accept-Encoding";
    public static final java.lang.String HEAD_KEY_ACCEPT_LANGUAGE = "Accept-Language";
    public static final java.lang.String HEAD_KEY_CACHE_CONTROL = "Cache-Control";
    public static final java.lang.String HEAD_KEY_CONNECTION = "Connection";
    public static final java.lang.String HEAD_KEY_CONTENT_DISPOSITION = "Content-Disposition";
    public static final java.lang.String HEAD_KEY_CONTENT_ENCODING = "Content-Encoding";
    public static final java.lang.String HEAD_KEY_CONTENT_LENGTH = "Content-Length";
    public static final java.lang.String HEAD_KEY_CONTENT_RANGE = "Content-Range";
    public static final java.lang.String HEAD_KEY_CONTENT_TYPE = "Content-Type";
    public static final java.lang.String HEAD_KEY_COOKIE = "Cookie";
    public static final java.lang.String HEAD_KEY_COOKIE2 = "Cookie2";
    public static final java.lang.String HEAD_KEY_DATE = "Date";
    public static final java.lang.String HEAD_KEY_EXPIRES = "Expires";
    public static final java.lang.String HEAD_KEY_E_TAG = "ETag";
    public static final java.lang.String HEAD_KEY_IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final java.lang.String HEAD_KEY_IF_NONE_MATCH = "If-None-Match";
    public static final java.lang.String HEAD_KEY_LAST_MODIFIED = "Last-Modified";
    public static final java.lang.String HEAD_KEY_LOCATION = "Location";
    public static final java.lang.String HEAD_KEY_PRAGMA = "Pragma";
    public static final java.lang.String HEAD_KEY_RESPONSE_CODE = "ResponseCode";
    public static final java.lang.String HEAD_KEY_RESPONSE_MESSAGE = "ResponseMessage";
    public static final java.lang.String HEAD_KEY_SET_COOKIE = "Set-Cookie";
    public static final java.lang.String HEAD_KEY_SET_COOKIE2 = "Set-Cookie2";
    public static final java.lang.String HEAD_KEY_USER_AGENT = "User-Agent";
    public static final java.lang.String HEAD_VALUE_ACCEPT_ENCODING = "gzip, deflate";
    public static final java.lang.String HEAD_VALUE_CONNECTION_CLOSE = "close";
    public static final java.lang.String HEAD_VALUE_CONNECTION_KEEP_ALIVE = "keep-alive";
    private static java.lang.String acceptLanguage;
    private static java.lang.String userAgent;
    public java.util.LinkedHashMap<java.lang.String, java.lang.String> headersMap;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            com.xuexiang.xhttp2.model.HttpHeaders.GMT_TIME_ZONE = r0
            return
    }

    public HttpHeaders() {
            r0 = this;
            r0.<init>()
            r0.init()
            return
    }

    public HttpHeaders(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.init()
            r0.put(r1, r2)
            return
    }

    private static java.lang.String formatMillisToGMT(long r2) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "EEE, dd MMM y HH:mm:ss 'GMT'"
            java.util.Locale r1 = java.util.Locale.US
            r2.<init>(r3, r1)
            java.util.TimeZone r3 = com.xuexiang.xhttp2.model.HttpHeaders.GMT_TIME_ZONE
            r2.setTimeZone(r3)
            java.lang.String r2 = r2.format(r0)
            return r2
    }

    public static java.lang.String getAcceptLanguage() {
            java.lang.String r0 = com.xuexiang.xhttp2.model.HttpHeaders.acceptLanguage
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L3f
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = r0.getCountry()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L38
            r3 = 45
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.StringBuilder r0 = r3.append(r0)
            r3 = 44
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ";q=0.8"
            r0.append(r1)
        L38:
            java.lang.String r0 = r2.toString()
            com.xuexiang.xhttp2.model.HttpHeaders.acceptLanguage = r0
            return r0
        L3f:
            java.lang.String r0 = com.xuexiang.xhttp2.model.HttpHeaders.acceptLanguage
            return r0
    }

    public static java.lang.String getCacheControl(java.lang.String r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            return r1
    }

    public static long getDate(java.lang.String r2) {
            long r0 = parseGMTToMillis(r2)     // Catch: java.text.ParseException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.lang.String getDate(long r0) {
            java.lang.String r0 = formatMillisToGMT(r0)
            return r0
    }

    public static long getExpiration(java.lang.String r2) {
            long r0 = parseGMTToMillis(r2)     // Catch: java.text.ParseException -> L5
            return r0
        L5:
            r0 = -1
            return r0
    }

    public static long getLastModified(java.lang.String r2) {
            long r0 = parseGMTToMillis(r2)     // Catch: java.text.ParseException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.lang.String getUserAgent() {
            java.lang.String r0 = com.xuexiang.xhttp2.model.HttpHeaders.userAgent
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb1
            r0 = 0
            java.lang.String r1 = "com.android.internal.R$string"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "web_user_agent"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Exception -> L27
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Exception -> L27
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L27
            android.content.Context r2 = com.xuexiang.xhttp2.XHttp.getContext()     // Catch: java.lang.Exception -> L27
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> L27
            java.lang.String r0 = r2.getString(r1)     // Catch: java.lang.Exception -> L27
        L27:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L2f
            java.lang.String r0 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/533.1 (KHTML, like Gecko) Version/5.0 %sSafari/533.1"
        L2f:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            int r4 = r3.length()
            if (r4 <= 0) goto L44
            r2.append(r3)
            goto L49
        L44:
            java.lang.String r3 = "1.0"
            r2.append(r3)
        L49:
            java.lang.String r3 = "; "
            r2.append(r3)
            java.lang.String r4 = r1.getLanguage()
            if (r4 == 0) goto L72
            java.lang.String r4 = r4.toLowerCase(r1)
            r2.append(r4)
            java.lang.String r4 = r1.getCountry()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L77
            java.lang.String r5 = "-"
            r2.append(r5)
            java.lang.String r1 = r4.toLowerCase(r1)
            r2.append(r1)
            goto L77
        L72:
            java.lang.String r1 = "en"
            r2.append(r1)
        L77:
            java.lang.String r1 = "REL"
            java.lang.String r4 = android.os.Build.VERSION.CODENAME
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L8f
            java.lang.String r1 = android.os.Build.MODEL
            int r4 = r1.length()
            if (r4 <= 0) goto L8f
            r2.append(r3)
            r2.append(r1)
        L8f:
            java.lang.String r1 = android.os.Build.ID
            int r3 = r1.length()
            if (r3 <= 0) goto L9f
            java.lang.String r3 = " Build/"
            r2.append(r3)
            r2.append(r1)
        L9f:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r3 = "Mobile "
            r1[r2] = r3
            java.lang.String r0 = java.lang.String.format(r0, r1)
            com.xuexiang.xhttp2.model.HttpHeaders.userAgent = r0
            return r0
        Lb1:
            java.lang.String r0 = com.xuexiang.xhttp2.model.HttpHeaders.userAgent
            return r0
    }

    private void init() {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.headersMap = r0
            return
    }

    private static long parseGMTToMillis(java.lang.String r3) throws java.text.ParseException {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "EEE, dd MMM y HH:mm:ss 'GMT'"
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            java.util.TimeZone r1 = com.xuexiang.xhttp2.model.HttpHeaders.GMT_TIME_ZONE
            r0.setTimeZone(r1)
            java.util.Date r3 = r0.parse(r3)
            long r0 = r3.getTime()
            return r0
    }

    public static void setAcceptLanguage(java.lang.String r0) {
            com.xuexiang.xhttp2.model.HttpHeaders.acceptLanguage = r0
            return
    }

    public static void setUserAgent(java.lang.String r0) {
            com.xuexiang.xhttp2.model.HttpHeaders.userAgent = r0
            return
    }

    public void clear() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.headersMap
            r0.clear()
            return
    }

    public java.lang.String get(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.headersMap
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public java.util.Set<java.lang.String> getNames() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.headersMap
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.headersMap
            boolean r0 = r0.isEmpty()
            return r0
    }

    public void put(com.xuexiang.xhttp2.model.HttpHeaders r4) {
            r3 = this;
            if (r4 == 0) goto L39
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r4.headersMap
            if (r0 == 0) goto L39
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L39
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r4 = r4.headersMap
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L39
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r3.headersMap
            java.lang.Object r2 = r0.getKey()
            r1.remove(r2)
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r3.headersMap
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r1.put(r2, r0)
            goto L16
        L39:
            return
    }

    public void put(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r2 == 0) goto Le
            if (r3 == 0) goto Le
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.headersMap
            r0.remove(r2)
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.headersMap
            r0.put(r2, r3)
        Le:
            return
    }

    public java.lang.String remove(java.lang.String r2) {
            r1 = this;
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r0 = r1.headersMap
            java.lang.Object r2 = r0.remove(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public final java.lang.String toJSONString() {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r4.headersMap     // Catch: org.json.JSONException -> L29
            java.util.Set r1 = r1.entrySet()     // Catch: org.json.JSONException -> L29
            java.util.Iterator r1 = r1.iterator()     // Catch: org.json.JSONException -> L29
        Lf:
            boolean r2 = r1.hasNext()     // Catch: org.json.JSONException -> L29
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()     // Catch: org.json.JSONException -> L29
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: org.json.JSONException -> L29
            java.lang.Object r3 = r2.getKey()     // Catch: org.json.JSONException -> L29
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> L29
            java.lang.Object r2 = r2.getValue()     // Catch: org.json.JSONException -> L29
            r0.put(r3, r2)     // Catch: org.json.JSONException -> L29
            goto Lf
        L29:
            r1 = move-exception
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r1)
        L2d:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HttpHeaders{headersMap="
            r0.<init>(r1)
            java.util.LinkedHashMap<java.lang.String, java.lang.String> r1 = r2.headersMap
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
