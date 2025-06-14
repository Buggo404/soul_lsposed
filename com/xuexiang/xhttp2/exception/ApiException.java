package com.xuexiang.xhttp2.exception;

/* loaded from: classes.dex */
public class ApiException extends java.lang.Exception {
    private int mCode;

    public static class ERROR {
        public static final int CAST_ERROR = 5007;
        public static final int DOWNLOAD_ERROR = 5012;
        public static final int HTTP_ERROR = 5003;
        public static final int INVOKE_ERROR = 5006;
        public static final int NET_METHOD_ANNOTATION_ERROR = 5012;
        public static final int NET_WORD_ERROR = 5002;
        public static final int NULL_POINTER_ERROR = 5010;
        public static final int OUT_OF_MEMORY_ERROR = 5011;
        public static final int PARSE_ERROR = 5001;
        public static final int REQUEST_CANCEL = 5008;
        public static final int SSL_ERROR = 5004;
        public static final int TIMEOUT_ERROR = 5005;
        public static final int UNKNOWN = 5000;
        public static final int UN_KNOWN_HOST_ERROR = 5009;

        public ERROR() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ApiException(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mCode = r2
            return
    }

    public ApiException(java.lang.Throwable r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mCode = r2
            return
    }

    public static com.xuexiang.xhttp2.exception.ApiException handleException(java.lang.Throwable r2) {
            boolean r0 = r2 instanceof retrofit2.HttpException
            if (r0 == 0) goto L2c
            retrofit2.HttpException r2 = (retrofit2.HttpException) r2
            java.lang.String r0 = r2.message()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1e
            com.xuexiang.xhttp2.exception.ApiException r0 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r1 = r2.message()
            int r2 = r2.code()
            r0.<init>(r1, r2)
            goto L2b
        L1e:
            com.xuexiang.xhttp2.exception.ApiException r0 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r1 = r2.getMessage()
            int r2 = r2.code()
            r0.<init>(r1, r2)
        L2b:
            return r0
        L2c:
            boolean r0 = r2 instanceof com.xuexiang.xhttp2.exception.ServerException
            if (r0 == 0) goto L40
            com.xuexiang.xhttp2.exception.ServerException r2 = (com.xuexiang.xhttp2.exception.ServerException) r2
            com.xuexiang.xhttp2.exception.ApiException r0 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r1 = r2.getMessage()
            int r2 = r2.getErrCode()
            r0.<init>(r1, r2)
            return r0
        L40:
            boolean r0 = r2 instanceof com.google.gson.JsonParseException
            if (r0 != 0) goto Lde
            boolean r0 = r2 instanceof org.json.JSONException
            if (r0 != 0) goto Lde
            boolean r0 = r2 instanceof com.google.gson.JsonSyntaxException
            if (r0 != 0) goto Lde
            boolean r0 = r2 instanceof com.google.gson.JsonSerializer
            if (r0 != 0) goto Lde
            boolean r0 = r2 instanceof java.io.NotSerializableException
            if (r0 != 0) goto Lde
            boolean r0 = r2 instanceof android.net.ParseException
            if (r0 == 0) goto L5a
            goto Lde
        L5a:
            boolean r0 = r2 instanceof java.lang.ClassCastException
            if (r0 == 0) goto L68
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "类型转换错误"
            r1 = 5007(0x138f, float:7.016E-42)
            r2.<init>(r0, r1)
            return r2
        L68:
            boolean r0 = r2 instanceof java.net.ConnectException
            if (r0 == 0) goto L76
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "网络连接异常，请稍后再试"
            r1 = 5002(0x138a, float:7.009E-42)
            r2.<init>(r0, r1)
            return r2
        L76:
            boolean r0 = r2 instanceof javax.net.ssl.SSLHandshakeException
            if (r0 == 0) goto L84
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "证书验证失败"
            r1 = 5004(0x138c, float:7.012E-42)
            r2.<init>(r0, r1)
            return r2
        L84:
            boolean r0 = r2 instanceof org.apache.http.conn.ConnectTimeoutException
            r1 = 5005(0x138d, float:7.013E-42)
            if (r0 == 0) goto L92
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "请求服务器超时，请稍后再试"
            r2.<init>(r0, r1)
            return r2
        L92:
            boolean r0 = r2 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L9e
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "网络连接超时，请稍后再试"
            r2.<init>(r0, r1)
            return r2
        L9e:
            boolean r0 = r2 instanceof java.net.UnknownHostException
            if (r0 == 0) goto Lac
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "网络不给力，请检查网络设置"
            r1 = 5009(0x1391, float:7.019E-42)
            r2.<init>(r0, r1)
            return r2
        Lac:
            boolean r0 = r2 instanceof java.lang.NullPointerException
            if (r0 == 0) goto Lba
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "空指针错误"
            r1 = 5010(0x1392, float:7.02E-42)
            r2.<init>(r0, r1)
            return r2
        Lba:
            boolean r0 = r2 instanceof java.lang.OutOfMemoryError
            if (r0 == 0) goto Lc8
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "内存不足，请清理后台应用"
            r1 = 5011(0x1393, float:7.022E-42)
            r2.<init>(r0, r1)
            return r2
        Lc8:
            boolean r0 = r2 instanceof java.io.InterruptedIOException
            if (r0 == 0) goto Ld6
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "请求被取消"
            r1 = 5008(0x1390, float:7.018E-42)
            r2.<init>(r0, r1)
            return r2
        Ld6:
            com.xuexiang.xhttp2.exception.ApiException r0 = new com.xuexiang.xhttp2.exception.ApiException
            r1 = 5000(0x1388, float:7.006E-42)
            r0.<init>(r2, r1)
            return r0
        Lde:
            com.xuexiang.xhttp2.exception.ApiException r2 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.String r0 = "解析错误"
            r1 = 5001(0x1389, float:7.008E-42)
            r2.<init>(r0, r1)
            return r2
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.mCode
            return r0
    }

    public java.lang.String getDetailMessage() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Code:"
            r0.<init>(r1)
            int r1 = r2.mCode
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", Message:"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getMessage()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String getDisplayMessage() {
            r1 = this;
            java.lang.String r0 = r1.getMessage()
            return r0
    }
}
