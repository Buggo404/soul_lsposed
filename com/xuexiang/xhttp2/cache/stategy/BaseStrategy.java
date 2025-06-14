package com.xuexiang.xhttp2.cache.stategy;

/* loaded from: classes.dex */
public abstract class BaseStrategy implements com.xuexiang.xhttp2.cache.stategy.IStrategy {





    public BaseStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> loadCache(com.xuexiang.xhttp2.cache.RxCache r1, java.lang.reflect.Type r2, java.lang.String r3, long r4, boolean r6) {
            r0 = this;
            io.reactivex.Observable r1 = r1.load(r2, r3, r4)
            com.xuexiang.xhttp2.cache.stategy.BaseStrategy$1 r2 = new com.xuexiang.xhttp2.cache.stategy.BaseStrategy$1
            r2.<init>(r0)
            io.reactivex.Observable r1 = r1.flatMap(r2)
            if (r6 == 0) goto L18
            com.xuexiang.xhttp2.cache.stategy.BaseStrategy$2 r2 = new com.xuexiang.xhttp2.cache.stategy.BaseStrategy$2
            r2.<init>(r0)
            io.reactivex.Observable r1 = r1.onErrorResumeNext(r2)
        L18:
            return r1
    }

    <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> loadRemote(com.xuexiang.xhttp2.cache.RxCache r2, java.lang.String r3, io.reactivex.Observable<T> r4, boolean r5) {
            r1 = this;
            com.xuexiang.xhttp2.cache.stategy.BaseStrategy$3 r0 = new com.xuexiang.xhttp2.cache.stategy.BaseStrategy$3
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = r4.flatMap(r0)
            if (r5 == 0) goto L14
            com.xuexiang.xhttp2.cache.stategy.BaseStrategy$4 r3 = new com.xuexiang.xhttp2.cache.stategy.BaseStrategy$4
            r3.<init>(r1)
            io.reactivex.Observable r2 = r2.onErrorResumeNext(r3)
        L14:
            return r2
    }
}
