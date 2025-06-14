package com.xuexiang.xhttp2.exception;

/* loaded from: classes.dex */
public class ServerException extends java.lang.RuntimeException {
    private int errCode;
    private java.lang.String message;

    public ServerException(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.errCode = r1
            r0.message = r2
            return
    }

    public int getErrCode() {
            r1 = this;
            int r0 = r1.errCode
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = r1.message
            return r0
    }
}
