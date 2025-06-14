package com.xuexiang.xhttp2.callback;

import com.xuexiang.xhttp2.model.ApiResult;

/* loaded from: classes.dex */
public class CallBackProxy<T extends com.xuexiang.xhttp2.model.ApiResult<R>, R> implements com.xuexiang.xhttp2.callback.impl.IType<T> {
    com.xuexiang.xhttp2.callback.CallBack<R> mCallBack;

    public CallBackProxy(com.xuexiang.xhttp2.callback.CallBack<R> r1) {
            r0 = this;
            r0.<init>()
            r0.mCallBack = r1
            return
    }

    public com.xuexiang.xhttp2.callback.CallBack getCallBack() {
            r1 = this;
            com.xuexiang.xhttp2.callback.CallBack<R> r0 = r1.mCallBack
            return r0
    }

    @Override // com.xuexiang.xhttp2.callback.impl.IType
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            com.xuexiang.xhttp2.callback.CallBack<R> r0 = r1.mCallBack
            java.lang.reflect.Type r0 = r0.getRawType()
            return r0
    }

    @Override // com.xuexiang.xhttp2.callback.impl.IType
    public java.lang.reflect.Type getType() {
            r4 = this;
            java.lang.Class<okhttp3.ResponseBody> r0 = okhttp3.ResponseBody.class
            com.xuexiang.xhttp2.callback.CallBack<R> r1 = r4.mCallBack
            r2 = 0
            if (r1 == 0) goto L4c
            java.lang.reflect.Type r0 = r1.getRawType()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class r3 = com.xuexiang.xhttp2.utils.TypeUtils.getClass(r0, r2)
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 != 0) goto L46
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.Class r3 = com.xuexiang.xhttp2.utils.TypeUtils.getClass(r0, r2)
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L24
            goto L46
        L24:
            java.lang.Class<com.xuexiang.xhttp2.cache.model.CacheResult> r1 = com.xuexiang.xhttp2.cache.model.CacheResult.class
            java.lang.Class r0 = com.xuexiang.xhttp2.utils.TypeUtils.getClass(r0, r2)
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L3b
            com.xuexiang.xhttp2.callback.CallBack<R> r0 = r4.mCallBack
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.reflect.Type r0 = com.xuexiang.xhttp2.utils.TypeUtils.getParameterizedType(r0, r2)
            goto L4c
        L3b:
            com.xuexiang.xhttp2.callback.CallBack<R> r0 = r4.mCallBack
            java.lang.reflect.Type r0 = r0.getType()
            java.lang.Class r0 = com.xuexiang.xhttp2.utils.TypeUtils.getClass(r0, r2)
            goto L4c
        L46:
            com.xuexiang.xhttp2.callback.CallBack<R> r0 = r4.mCallBack
            java.lang.reflect.Type r0 = r0.getType()
        L4c:
            java.lang.Class r1 = r4.getClass()
            java.lang.reflect.Type r1 = com.xuexiang.xhttp2.utils.TypeUtils.findNeedType(r1)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L5e
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getRawType()
        L5e:
            r3 = 1
            java.lang.reflect.Type[] r3 = new java.lang.reflect.Type[r3]
            r3[r2] = r0
            r0 = 0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r0, r1, r3)
            return r0
    }
}
