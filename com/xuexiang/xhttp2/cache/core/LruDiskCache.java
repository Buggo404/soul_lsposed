package com.xuexiang.xhttp2.cache.core;

/* loaded from: classes.dex */
public class LruDiskCache extends com.xuexiang.xhttp2.cache.core.BaseDiskCache {
    public static final long CACHE_NEVER_EXPIRE = -1;
    private int mAppVersion;
    private com.xuexiang.xhttp2.cache.converter.IDiskConverter mDiskConverter;
    private java.io.File mDiskDir;
    private com.jakewharton.disklrucache.DiskLruCache mDiskLruCache;
    private long mDiskMaxSize;

    public LruDiskCache(com.xuexiang.xhttp2.cache.converter.IDiskConverter r2, java.io.File r3, int r4, long r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "mDiskConverter ==null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r0)
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r2 = (com.xuexiang.xhttp2.cache.converter.IDiskConverter) r2
            r1.mDiskConverter = r2
            java.lang.String r2 = "mDiskDir ==null"
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.Utils.checkNotNull(r3, r2)
            java.io.File r2 = (java.io.File) r2
            r1.mDiskDir = r2
            r1.mAppVersion = r4
            r1.mDiskMaxSize = r5
            r1.openCache()
            return
    }

    private boolean isCacheDataFailure(java.io.File r7, long r8) {
            r6 = this;
            boolean r0 = r7.exists()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r7.lastModified()
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r4
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 <= 0) goto L19
            r1 = 1
        L19:
            return r1
    }

    private void openCache() {
            r5 = this;
            java.io.File r0 = r5.mDiskDir     // Catch: java.io.IOException -> Le
            int r1 = r5.mAppVersion     // Catch: java.io.IOException -> Le
            long r2 = r5.mDiskMaxSize     // Catch: java.io.IOException -> Le
            r4 = 1
            com.jakewharton.disklrucache.DiskLruCache r0 = com.jakewharton.disklrucache.DiskLruCache.open(r0, r1, r4, r2)     // Catch: java.io.IOException -> Le
            r5.mDiskLruCache = r0     // Catch: java.io.IOException -> Le
            goto L15
        Le:
            r0 = move-exception
            r0.printStackTrace()
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r0)
        L15:
            return
    }

    @Override // com.xuexiang.xhttp2.cache.core.BaseDiskCache
    protected boolean doClear() {
            r1 = this;
            com.jakewharton.disklrucache.DiskLruCache r0 = r1.mDiskLruCache     // Catch: java.io.IOException -> La
            r0.delete()     // Catch: java.io.IOException -> La
            r1.openCache()     // Catch: java.io.IOException -> La
            r0 = 1
            goto Lf
        La:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        Lf:
            return r0
    }

    @Override // com.xuexiang.xhttp2.cache.core.BaseDiskCache
    protected boolean doContainsKey(java.lang.String r3) {
            r2 = this;
            com.jakewharton.disklrucache.DiskLruCache r0 = r2.mDiskLruCache
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.jakewharton.disklrucache.DiskLruCache$Snapshot r3 = r0.get(r3)     // Catch: java.io.IOException -> Le
            if (r3 == 0) goto Ld
            r1 = 1
        Ld:
            return r1
        Le:
            r3 = move-exception
            r3.printStackTrace()
            return r1
    }

    @Override // com.xuexiang.xhttp2.cache.core.BaseDiskCache
    protected <T> T doLoad(java.lang.reflect.Type r5, java.lang.String r6) {
            r4 = this;
            com.jakewharton.disklrucache.DiskLruCache r0 = r4.mDiskLruCache
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.jakewharton.disklrucache.DiskLruCache$Editor r6 = r0.edit(r6)     // Catch: java.io.IOException -> L2a
            if (r6 != 0) goto Ld
            return r1
        Ld:
            r0 = 0
            java.io.InputStream r2 = r6.newInputStream(r0)     // Catch: java.io.IOException -> L2a
            if (r2 == 0) goto L26
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r3 = r4.mDiskConverter     // Catch: java.io.IOException -> L2a
            java.lang.Object r5 = r3.load(r2, r5)     // Catch: java.io.IOException -> L2a
            r3 = 1
            java.io.Closeable[] r3 = new java.io.Closeable[r3]     // Catch: java.io.IOException -> L2a
            r3[r0] = r2     // Catch: java.io.IOException -> L2a
            com.xuexiang.xhttp2.utils.Utils.closeIO(r3)     // Catch: java.io.IOException -> L2a
            r6.commit()     // Catch: java.io.IOException -> L2a
            return r5
        L26:
            r6.abort()     // Catch: java.io.IOException -> L2a
            goto L2e
        L2a:
            r5 = move-exception
            r5.printStackTrace()
        L2e:
            return r1
    }

    @Override // com.xuexiang.xhttp2.cache.core.BaseDiskCache
    protected boolean doRemove(java.lang.String r3) {
            r2 = this;
            com.jakewharton.disklrucache.DiskLruCache r0 = r2.mDiskLruCache
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r3 = r0.remove(r3)     // Catch: java.io.IOException -> Lb
            return r3
        Lb:
            r3 = move-exception
            r3.printStackTrace()
            return r1
    }

    @Override // com.xuexiang.xhttp2.cache.core.BaseDiskCache
    protected <T> boolean doSave(java.lang.String r4, T r5) {
            r3 = this;
            com.jakewharton.disklrucache.DiskLruCache r0 = r3.mDiskLruCache
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.jakewharton.disklrucache.DiskLruCache$Editor r4 = r0.edit(r4)     // Catch: java.io.IOException -> L28
            if (r4 != 0) goto Ld
            return r1
        Ld:
            java.io.OutputStream r0 = r4.newOutputStream(r1)     // Catch: java.io.IOException -> L28
            if (r0 == 0) goto L24
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r2 = r3.mDiskConverter     // Catch: java.io.IOException -> L28
            r2.writer(r0, r5)     // Catch: java.io.IOException -> L28
            r5 = 1
            java.io.Closeable[] r2 = new java.io.Closeable[r5]     // Catch: java.io.IOException -> L28
            r2[r1] = r0     // Catch: java.io.IOException -> L28
            com.xuexiang.xhttp2.utils.Utils.closeIO(r2)     // Catch: java.io.IOException -> L28
            r4.commit()     // Catch: java.io.IOException -> L28
            return r5
        L24:
            r4.abort()     // Catch: java.io.IOException -> L28
            goto L2c
        L28:
            r4 = move-exception
            r4.printStackTrace()
        L2c:
            return r1
    }

    @Override // com.xuexiang.xhttp2.cache.core.BaseDiskCache
    protected boolean isExpiry(java.lang.String r5, long r6) {
            r4 = this;
            com.jakewharton.disklrucache.DiskLruCache r0 = r4.mDiskLruCache
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = -1
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2f
            java.io.File r0 = new java.io.File
            com.jakewharton.disklrucache.DiskLruCache r1 = r4.mDiskLruCache
            java.io.File r1 = r1.getDirectory()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = ".0"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r0.<init>(r1, r5)
            boolean r5 = r4.isCacheDataFailure(r0, r6)
            return r5
        L2f:
            return r1
    }
}
