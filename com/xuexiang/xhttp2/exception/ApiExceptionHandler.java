package com.xuexiang.xhttp2.exception;

/* loaded from: classes.dex */
public final class ApiExceptionHandler {
    private static com.xuexiang.xhttp2.exception.IExceptionHandler sIExceptionHandler;

    public ApiExceptionHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.xuexiang.xhttp2.exception.ApiException handleException(java.lang.Throwable r1) {
            com.xuexiang.xhttp2.exception.IExceptionHandler r0 = com.xuexiang.xhttp2.exception.ApiExceptionHandler.sIExceptionHandler
            if (r0 == 0) goto L9
            com.xuexiang.xhttp2.exception.ApiException r1 = r0.handleException(r1)
            return r1
        L9:
            com.xuexiang.xhttp2.exception.ApiException r1 = com.xuexiang.xhttp2.exception.ApiException.handleException(r1)
            return r1
    }

    public static void setExceptionHandler(com.xuexiang.xhttp2.exception.IExceptionHandler r0) {
            com.xuexiang.xhttp2.exception.ApiExceptionHandler.sIExceptionHandler = r0
            return
    }
}
