package com.xuexiang.xhttp2.cache.stategy;

/* loaded from: classes.dex */
public class NoStrategy implements com.xuexiang.xhttp2.cache.stategy.IStrategy {


    public NoStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.xuexiang.xhttp2.cache.stategy.IStrategy
    public <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> execute(com.xuexiang.xhttp2.cache.RxCache r1, java.lang.String r2, long r3, io.reactivex.Observable<T> r5, java.lang.reflect.Type r6) {
            r0 = this;
            com.xuexiang.xhttp2.cache.stategy.NoStrategy$1 r1 = new com.xuexiang.xhttp2.cache.stategy.NoStrategy$1
            r1.<init>(r0)
            io.reactivex.Observable r1 = r5.map(r1)
            return r1
    }
}
