package com.xuexiang.xhttp2.cache.stategy;

/* loaded from: classes.dex */
public final class OnlyRemoteStrategy extends com.xuexiang.xhttp2.cache.stategy.BaseStrategy {
    public OnlyRemoteStrategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.xuexiang.xhttp2.cache.stategy.IStrategy
    public <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> execute(com.xuexiang.xhttp2.cache.RxCache r1, java.lang.String r2, long r3, io.reactivex.Observable<T> r5, java.lang.reflect.Type r6) {
            r0 = this;
            r3 = 0
            io.reactivex.Observable r1 = r0.loadRemote(r1, r2, r5, r3)
            return r1
    }
}
