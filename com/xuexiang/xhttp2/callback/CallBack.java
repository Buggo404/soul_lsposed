package com.xuexiang.xhttp2.callback;

/* loaded from: classes.dex */
public abstract class CallBack<T> implements com.xuexiang.xhttp2.callback.impl.IType<T> {
    public CallBack() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.xuexiang.xhttp2.callback.impl.IType
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Type r0 = com.xuexiang.xhttp2.utils.TypeUtils.findRawType(r0)
            return r0
    }

    @Override // com.xuexiang.xhttp2.callback.impl.IType
    public java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Type r0 = com.xuexiang.xhttp2.utils.TypeUtils.findNeedClass(r0)
            return r0
    }

    public abstract void onCompleted();

    public abstract void onError(com.xuexiang.xhttp2.exception.ApiException r1);

    public abstract void onStart();

    public abstract void onSuccess(T r1) throws java.lang.Throwable;
}
