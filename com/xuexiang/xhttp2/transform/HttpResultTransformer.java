package com.xuexiang.xhttp2.transform;

/* loaded from: classes.dex */
public class HttpResultTransformer<T> implements io.reactivex.ObservableTransformer<com.xuexiang.xhttp2.model.ApiResult<T>, T> {
    public HttpResultTransformer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.ObservableTransformer
    public io.reactivex.ObservableSource<T> apply(io.reactivex.Observable<com.xuexiang.xhttp2.model.ApiResult<T>> r2) {
            r1 = this;
            com.xuexiang.xhttp2.transform.func.HttpResultFuc r0 = new com.xuexiang.xhttp2.transform.func.HttpResultFuc
            r0.<init>()
            io.reactivex.Observable r2 = r2.map(r0)
            com.xuexiang.xhttp2.transform.func.HttpResponseThrowableFunc r0 = new com.xuexiang.xhttp2.transform.func.HttpResponseThrowableFunc
            r0.<init>()
            io.reactivex.Observable r2 = r2.onErrorResumeNext(r0)
            return r2
    }
}
