package com.xuexiang.xhttp2.callback;

import com.xuexiang.xhttp2.model.ApiResult;

/* loaded from: classes.dex */
public class CallClazzProxy<T extends com.xuexiang.xhttp2.model.ApiResult<R>, R> implements com.xuexiang.xhttp2.callback.impl.IType<T> {
    private java.lang.reflect.Type type;

    public CallClazzProxy(java.lang.reflect.Type r1) {
            r0 = this;
            r0.<init>()
            r0.type = r1
            return
    }

    public java.lang.reflect.Type getCallType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }

    @Override // com.xuexiang.xhttp2.callback.impl.IType
    public java.lang.reflect.Type getRawType() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.xuexiang.xhttp2.callback.impl.IType
    public java.lang.reflect.Type getType() {
            r4 = this;
            java.lang.Class<okhttp3.ResponseBody> r0 = okhttp3.ResponseBody.class
            java.lang.reflect.Type r1 = r4.type
            if (r1 == 0) goto L7
            r0 = r1
        L7:
            java.lang.Class r1 = r4.getClass()
            java.lang.reflect.Type r1 = com.xuexiang.xhttp2.utils.TypeUtils.findNeedType(r1)
            boolean r2 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L19
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r1 = r1.getRawType()
        L19:
            r2 = 1
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 0
            java.lang.reflect.ParameterizedType r0 = com.google.gson.internal.C$Gson$Types.newParameterizedTypeWithOwner(r0, r1, r2)
            return r0
    }
}
