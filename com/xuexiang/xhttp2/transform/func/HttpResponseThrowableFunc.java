package com.xuexiang.xhttp2.transform.func;

/* loaded from: classes.dex */
public class HttpResponseThrowableFunc<T> implements io.reactivex.functions.Function<java.lang.Throwable, io.reactivex.Observable<T>> {
    public HttpResponseThrowableFunc() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public io.reactivex.Observable<T> apply2(java.lang.Throwable r1) throws java.lang.Exception {
            r0 = this;
            com.xuexiang.xhttp2.exception.ApiException r1 = com.xuexiang.xhttp2.exception.ApiExceptionHandler.handleException(r1)
            io.reactivex.Observable r1 = io.reactivex.Observable.error(r1)
            return r1
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Throwable r1) throws java.lang.Exception {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            io.reactivex.Observable r1 = r0.apply2(r1)
            return r1
    }
}
