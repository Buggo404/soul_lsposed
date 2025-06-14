package com.xuexiang.xhttp2.reflect;

/* loaded from: classes.dex */
public abstract class TypeToken<T> {
    private final java.lang.reflect.Type type;

    public TypeToken() {
            r2 = this;
            r2.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L1b
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            r2.type = r0
            return
        L1b:
            com.xuexiang.xhttp2.reflect.TypeException r0 = new com.xuexiang.xhttp2.reflect.TypeException
            java.lang.String r1 = "No generics found!"
            r0.<init>(r1)
            throw r0
    }

    public java.lang.reflect.Type getType() {
            r1 = this;
            java.lang.reflect.Type r0 = r1.type
            return r0
    }
}
