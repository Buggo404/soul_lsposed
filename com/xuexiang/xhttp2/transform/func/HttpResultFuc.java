package com.xuexiang.xhttp2.transform.func;

/* loaded from: classes.dex */
public class HttpResultFuc<T> implements io.reactivex.functions.Function<com.xuexiang.xhttp2.model.ApiResult<T>, T> {
    public HttpResultFuc() {
            r0 = this;
            r0.<init>()
            return
    }

    public T apply(com.xuexiang.xhttp2.model.ApiResult<T> r3) throws java.lang.Exception {
            r2 = this;
            boolean r0 = com.xuexiang.xhttp2.utils.ApiUtils.isRequestSuccess(r3)
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r3.getData()
            return r3
        Lb:
            com.xuexiang.xhttp2.exception.ServerException r0 = new com.xuexiang.xhttp2.exception.ServerException
            int r1 = r3.getCode()
            java.lang.String r3 = r3.getMsg()
            r0.<init>(r1, r3)
            throw r0
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            com.xuexiang.xhttp2.model.ApiResult r1 = (com.xuexiang.xhttp2.model.ApiResult) r1
            java.lang.Object r1 = r0.apply(r1)
            return r1
    }
}
