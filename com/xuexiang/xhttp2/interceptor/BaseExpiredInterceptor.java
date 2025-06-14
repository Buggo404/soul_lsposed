package com.xuexiang.xhttp2.interceptor;

/* loaded from: classes.dex */
public abstract class BaseExpiredInterceptor extends com.xuexiang.xhttp2.interceptor.BaseResponseInterceptor {
    public BaseExpiredInterceptor() {
            r0 = this;
            r0.<init>()
            return
    }

    protected abstract com.xuexiang.xhttp2.model.ExpiredInfo isResponseExpired(okhttp3.Response r1, java.lang.String r2);

    @Override // com.xuexiang.xhttp2.interceptor.BaseInterceptor
    protected okhttp3.Response onAfterRequest(okhttp3.Response r2, okhttp3.Interceptor.Chain r3, java.lang.String r4) {
            r1 = this;
            com.xuexiang.xhttp2.model.ExpiredInfo r4 = r1.isResponseExpired(r2, r4)
            boolean r0 = r4.isExpired()
            if (r0 == 0) goto L11
            okhttp3.Response r3 = r1.responseExpired(r2, r3, r4)
            if (r3 == 0) goto L11
            return r3
        L11:
            return r2
    }

    protected abstract okhttp3.Response responseExpired(okhttp3.Response r1, okhttp3.Interceptor.Chain r2, com.xuexiang.xhttp2.model.ExpiredInfo r3);
}
