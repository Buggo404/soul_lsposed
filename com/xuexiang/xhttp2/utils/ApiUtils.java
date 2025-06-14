package com.xuexiang.xhttp2.utils;

/* loaded from: classes.dex */
public final class ApiUtils {
    private static int SUCCESS_CODE;
    private static com.xuexiang.xhttp2.utils.ApiUtils.IRequestHandler sRequestHandler;


    public interface IRequestHandler {
        boolean isRequestSuccess(com.xuexiang.xhttp2.model.ApiResult r1);
    }

    static {
            com.xuexiang.xhttp2.utils.ApiUtils$IRequestHandler r0 = getDefaultRequestHandler()
            com.xuexiang.xhttp2.utils.ApiUtils.sRequestHandler = r0
            r0 = 0
            com.xuexiang.xhttp2.utils.ApiUtils.SUCCESS_CODE = r0
            return
    }

    private ApiUtils() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "u can't instantiate me..."
            r0.<init>(r1)
            throw r0
    }

    private static com.xuexiang.xhttp2.utils.ApiUtils.IRequestHandler getDefaultRequestHandler() {
            com.xuexiang.xhttp2.utils.ApiUtils$1 r0 = new com.xuexiang.xhttp2.utils.ApiUtils$1
            r0.<init>()
            return r0
    }

    public static int getSuccessCode() {
            int r0 = com.xuexiang.xhttp2.utils.ApiUtils.SUCCESS_CODE
            return r0
    }

    public static boolean isRequestSuccess(com.xuexiang.xhttp2.model.ApiResult r1) {
            com.xuexiang.xhttp2.utils.ApiUtils$IRequestHandler r0 = com.xuexiang.xhttp2.utils.ApiUtils.sRequestHandler
            if (r0 == 0) goto Lc
            boolean r1 = r0.isRequestSuccess(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public static void setIRequestHandler(com.xuexiang.xhttp2.utils.ApiUtils.IRequestHandler r0) {
            com.xuexiang.xhttp2.utils.ApiUtils.sRequestHandler = r0
            return
    }

    public static void setSuccessCode(int r0) {
            com.xuexiang.xhttp2.utils.ApiUtils.SUCCESS_CODE = r0
            return
    }
}
