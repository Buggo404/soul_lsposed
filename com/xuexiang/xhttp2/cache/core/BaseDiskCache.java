package com.xuexiang.xhttp2.cache.core;

/* loaded from: classes.dex */
public abstract class BaseDiskCache implements com.xuexiang.xhttp2.cache.core.ICache {
    private final java.util.concurrent.locks.ReadWriteLock mLock;

    public BaseDiskCache() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r1.mLock = r0
            return
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public final boolean clear() {
            r2 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r2.mLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            boolean r0 = r2.doClear()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.locks.ReadWriteLock r1 = r2.mLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            return r0
        L17:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r2.mLock
            java.util.concurrent.locks.Lock r1 = r1.writeLock()
            r1.unlock()
            throw r0
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public final boolean containsKey(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r1.mLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.lock()
            boolean r2 = r1.doContainsKey(r2)     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.locks.ReadWriteLock r0 = r1.mLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.unlock()
            return r2
        L17:
            r2 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r1.mLock
            java.util.concurrent.locks.Lock r0 = r0.readLock()
            r0.unlock()
            throw r2
    }

    protected abstract boolean doClear();

    protected abstract boolean doContainsKey(java.lang.String r1);

    protected abstract <T> T doLoad(java.lang.reflect.Type r1, java.lang.String r2);

    protected abstract boolean doRemove(java.lang.String r1);

    protected abstract <T> boolean doSave(java.lang.String r1, T r2);

    protected abstract boolean isExpiry(java.lang.String r1, long r2);

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public final <T> T load(java.lang.reflect.Type r3, java.lang.String r4, long r5) {
            r2 = this;
            java.lang.String r0 = "key == null"
            com.xuexiang.xhttp2.utils.Utils.checkNotNull(r4, r0)
            boolean r0 = r2.containsKey(r4)
            r1 = 0
            if (r0 != 0) goto Ld
            return r1
        Ld:
            boolean r5 = r2.isExpiry(r4, r5)
            if (r5 == 0) goto L17
            r2.remove(r4)
            return r1
        L17:
            java.util.concurrent.locks.ReadWriteLock r5 = r2.mLock
            java.util.concurrent.locks.Lock r5 = r5.readLock()
            r5.lock()
            java.lang.Object r3 = r2.doLoad(r3, r4)     // Catch: java.lang.Throwable -> L2e
            java.util.concurrent.locks.ReadWriteLock r4 = r2.mLock
            java.util.concurrent.locks.Lock r4 = r4.readLock()
            r4.unlock()
            return r3
        L2e:
            r3 = move-exception
            java.util.concurrent.locks.ReadWriteLock r4 = r2.mLock
            java.util.concurrent.locks.Lock r4 = r4.readLock()
            r4.unlock()
            throw r3
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public final boolean remove(java.lang.String r2) {
            r1 = this;
            java.util.concurrent.locks.ReadWriteLock r0 = r1.mLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            boolean r2 = r1.doRemove(r2)     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.locks.ReadWriteLock r0 = r1.mLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            return r2
        L17:
            r2 = move-exception
            java.util.concurrent.locks.ReadWriteLock r0 = r1.mLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.unlock()
            throw r2
    }

    @Override // com.xuexiang.xhttp2.cache.core.ICache
    public <T> boolean save(java.lang.String r2, T r3) {
            r1 = this;
            java.lang.String r0 = "key == null"
            com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            if (r3 != 0) goto Lc
            boolean r2 = r1.remove(r2)
            return r2
        Lc:
            java.util.concurrent.locks.ReadWriteLock r0 = r1.mLock
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r0.lock()
            boolean r2 = r1.doSave(r2, r3)     // Catch: java.lang.Throwable -> L23
            java.util.concurrent.locks.ReadWriteLock r3 = r1.mLock
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            return r2
        L23:
            r2 = move-exception
            java.util.concurrent.locks.ReadWriteLock r3 = r1.mLock
            java.util.concurrent.locks.Lock r3 = r3.writeLock()
            r3.unlock()
            throw r2
    }
}
