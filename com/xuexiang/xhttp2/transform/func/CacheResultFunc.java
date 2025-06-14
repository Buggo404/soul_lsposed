package com.xuexiang.xhttp2.transform.func;

/* loaded from: classes.dex */
public class CacheResultFunc<T> implements io.reactivex.functions.Function<com.xuexiang.xhttp2.cache.model.CacheResult<T>, T> {
    public CacheResultFunc() {
            r0 = this;
            r0.<init>()
            return
    }

    public T apply(com.xuexiang.xhttp2.cache.model.CacheResult<T> r1) throws java.lang.Exception {
            r0 = this;
            T r1 = r1.data
            return r1
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ java.lang.Object apply(java.lang.Object r1) throws java.lang.Exception {
            r0 = this;
            com.xuexiang.xhttp2.cache.model.CacheResult r1 = (com.xuexiang.xhttp2.cache.model.CacheResult) r1
            java.lang.Object r1 = r0.apply(r1)
            return r1
    }
}
