package com.xuexiang.xhttp2.cache.core;

/* loaded from: classes.dex */
public class LruMemoryCache implements com.xuexiang.xhttp2.cache.core.ICache {
    private android.util.LruCache<java.lang.String, java.lang.Object> mMemoryCache;

    public LruMemoryCache(int r2) {
            r1 = this;
            r1.<init>()
            android.util.LruCache r0 = new android.util.LruCache
            r0.<init>(r2)
            r1.mMemoryCache = r0
            return
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public boolean clear() {
            r1 = this;
            android.util.LruCache<java.lang.String, java.lang.Object> r0 = r1.mMemoryCache
            if (r0 == 0) goto L9
            r0.evictAll()
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public boolean containsKey(java.lang.String r2) {
            r1 = this;
            android.util.LruCache<java.lang.String, java.lang.Object> r0 = r1.mMemoryCache
            if (r0 == 0) goto Lc
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public <T> T load(java.lang.reflect.Type r1, java.lang.String r2, long r3) {
            r0 = this;
            android.util.LruCache<java.lang.String, java.lang.Object> r1 = r0.mMemoryCache
            if (r1 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.Object r1 = r1.get(r2)
            return r1
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public boolean remove(java.lang.String r2) {
            r1 = this;
            android.util.LruCache<java.lang.String, java.lang.Object> r0 = r1.mMemoryCache
            if (r0 == 0) goto Lc
            java.lang.Object r2 = r0.remove(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public <T> boolean save(java.lang.String r2, T r3) {
            r1 = this;
            android.util.LruCache<java.lang.String, java.lang.Object> r0 = r1.mMemoryCache
            if (r0 == 0) goto Lc
            java.lang.Object r2 = r0.put(r2, r3)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }
}
