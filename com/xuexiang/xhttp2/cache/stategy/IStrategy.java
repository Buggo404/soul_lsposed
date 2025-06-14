package com.xuexiang.xhttp2.cache.stategy;

/* loaded from: classes.dex */
public interface IStrategy {
    <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> execute(com.xuexiang.xhttp2.cache.RxCache r1, java.lang.String r2, long r3, io.reactivex.Observable<T> r5, java.lang.reflect.Type r6);
}
