package com.xuexiang.xhttp2.cache.core;

/* loaded from: classes.dex */
public class CacheCore implements com.xuexiang.xhttp2.cache.core.ICache {
    private com.xuexiang.xhttp2.cache.core.ICache mCache;

    public CacheCore(com.xuexiang.xhttp2.cache.core.ICache r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "ICache == null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            com.xuexiang.xhttp2.cache.core.ICache r2 = (com.xuexiang.xhttp2.cache.core.ICache) r2
            r1.mCache = r2
            return
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public boolean clear() {
            r1 = this;
            com.xuexiang.xhttp2.cache.core.ICache r0 = r1.mCache
            if (r0 == 0) goto Lc
            boolean r0 = r0.clear()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public boolean containsKey(java.lang.String r3) {
            r2 = this;
            com.xuexiang.xhttp2.cache.core.ICache r0 = r2.mCache
            if (r0 == 0) goto L2d
            byte[] r3 = r3.getBytes()
            okio.ByteString r3 = okio.ByteString.m96of(r3)
            okio.ByteString r3 = r3.md5()
            java.lang.String r3 = r3.hex()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "containsCache  key="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            com.xuexiang.xhttp2.cache.core.ICache r0 = r2.mCache
            boolean r3 = r0.containsKey(r3)
            return r3
        L2d:
            r3 = 0
            return r3
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public <T> T load(java.lang.reflect.Type r3, java.lang.String r4, long r5) {
            r2 = this;
            com.xuexiang.xhttp2.cache.core.ICache r0 = r2.mCache
            if (r0 == 0) goto L2d
            byte[] r4 = r4.getBytes()
            okio.ByteString r4 = okio.ByteString.m96of(r4)
            okio.ByteString r4 = r4.md5()
            java.lang.String r4 = r4.hex()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "loadCache  key="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            com.xuexiang.xhttp2.cache.core.ICache r0 = r2.mCache
            java.lang.Object r3 = r0.load(r3, r4, r5)
            return r3
        L2d:
            r3 = 0
            return r3
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public boolean remove(java.lang.String r3) {
            r2 = this;
            byte[] r3 = r3.getBytes()
            okio.ByteString r3 = okio.ByteString.m96of(r3)
            okio.ByteString r3 = r3.md5()
            java.lang.String r3 = r3.hex()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "removeCache  key="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            com.xuexiang.xhttp2.cache.core.ICache r0 = r2.mCache
            if (r0 == 0) goto L2f
            boolean r3 = r0.remove(r3)
            if (r3 == 0) goto L2d
            goto L2f
        L2d:
            r3 = 0
            goto L30
        L2f:
            r3 = 1
        L30:
            return r3
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public <T> boolean save(java.lang.String r3, T r4) {
            r2 = this;
            com.xuexiang.xhttp2.cache.core.ICache r0 = r2.mCache
            if (r0 == 0) goto L2d
            byte[] r3 = r3.getBytes()
            okio.ByteString r3 = okio.ByteString.m96of(r3)
            okio.ByteString r3 = r3.md5()
            java.lang.String r3 = r3.hex()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "saveCache  key="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            com.xuexiang.xhttp2.cache.core.ICache r0 = r2.mCache
            boolean r3 = r0.save(r3, r4)
            return r3
        L2d:
            r3 = 0
            return r3
    }

    public com.xuexiang.xhttp2.cache.core.CacheCore setICache(com.xuexiang.xhttp2.cache.core.ICache r1) {
            r0 = this;
            r0.mCache = r1
            return r0
    }
}
