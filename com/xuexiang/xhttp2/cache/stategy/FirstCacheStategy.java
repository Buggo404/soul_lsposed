package com.xuexiang.xhttp2.cache.stategy;

/* loaded from: classes.dex */
public final class FirstCacheStategy extends com.xuexiang.xhttp2.cache.stategy.BaseStrategy {
    public FirstCacheStategy() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.xuexiang.xhttp2.cache.stategy.IStrategy
    public <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> execute(com.xuexiang.xhttp2.cache.RxCache r8, java.lang.String r9, long r10, io.reactivex.Observable<T> r12, java.lang.reflect.Type r13) {
            r7 = this;
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r13
            r3 = r9
            r4 = r10
            io.reactivex.Observable r10 = r0.loadCache(r1, r2, r3, r4, r6)
            r11 = 0
            io.reactivex.Observable r8 = r7.loadRemote(r8, r9, r12, r11)
            io.reactivex.Observable r8 = r10.switchIfEmpty(r8)
            return r8
    }
}
