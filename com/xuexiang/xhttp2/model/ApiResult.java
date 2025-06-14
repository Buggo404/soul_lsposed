package com.xuexiang.xhttp2.model;

/* loaded from: classes.dex */
public class ApiResult<T> {
    public static final java.lang.String CODE = "Code";
    public static final java.lang.String DATA = "Data";
    public static final java.lang.String MSG = "Msg";

    @com.google.gson.annotations.SerializedName(alternate = {"code"}, value = "Code")
    private int Code;

    @com.google.gson.annotations.SerializedName(alternate = {"data"}, value = "Data")
    private T Data;

    @com.google.gson.annotations.SerializedName(alternate = {"msg"}, value = "Msg")
    private java.lang.String Msg;

    public ApiResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.Code
            return r0
    }

    public T getData() {
            r1 = this;
            T r0 = r1.Data
            return r0
    }

    public java.lang.String getMsg() {
            r1 = this;
            java.lang.String r0 = r1.Msg
            return r0
    }

    public boolean isSuccess() {
            r2 = this;
            int r0 = r2.getCode()
            int r1 = com.xuexiang.xhttp2.utils.ApiUtils.getSuccessCode()
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public com.xuexiang.xhttp2.model.ApiResult setCode(int r1) {
            r0 = this;
            r0.Code = r1
            return r0
    }

    public com.xuexiang.xhttp2.model.ApiResult setData(T r1) {
            r0 = this;
            r0.Data = r1
            return r0
    }

    public com.xuexiang.xhttp2.model.ApiResult setMsg(java.lang.String r1) {
            r0 = this;
            r0.Msg = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ApiResult{Code='"
            r0.<init>(r1)
            int r1 = r2.Code
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "', Msg='"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.Msg
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "', Data="
            java.lang.StringBuilder r0 = r0.append(r1)
            T r1 = r2.Data
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
