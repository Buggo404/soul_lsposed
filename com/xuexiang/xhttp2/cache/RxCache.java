package com.xuexiang.xhttp2.cache;

/* loaded from: classes.dex */
public final class RxCache {
    public static final long CACHE_NEVER_EXPIRE = -1;
    private static com.xuexiang.xhttp2.cache.key.ICacheKeyCreator sICacheKeyCreator;
    private final int appVersion;
    private final com.xuexiang.xhttp2.cache.core.CacheCore cacheCore;
    private final java.lang.String cacheKey;
    private final long cacheTime;
    private final android.content.Context context;
    private final com.xuexiang.xhttp2.cache.converter.IDiskConverter diskConverter;
    private final java.io.File diskDir;
    private final long diskMaxSize;
    private boolean isDiskCache;
    private int memoryMaxSize;







    public static final class Builder {
        private static final int MAX_DISK_CACHE_SIZE = 52428800;
        private static final int MIN_DISK_CACHE_SIZE = 5242880;
        private int appVersion;
        private java.lang.String cacheKey;
        private long cacheTime;
        private android.content.Context context;
        private com.xuexiang.xhttp2.cache.converter.IDiskConverter diskConverter;
        private java.io.File diskDir;
        private long diskMaxSize;
        private boolean isDiskCache;
        private int memoryMaxSize;

        public Builder() {
                r3 = this;
                r3.<init>()
                r0 = 1
                r3.isDiskCache = r0
                com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter r1 = new com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter
                r1.<init>()
                r3.diskConverter = r1
                r1 = -1
                r3.cacheTime = r1
                r3.appVersion = r0
                return
        }

        public Builder(com.xuexiang.xhttp2.cache.RxCache r3) {
                r2 = this;
                r2.<init>()
                android.content.Context r0 = com.xuexiang.xhttp2.cache.RxCache.access$1400(r3)
                r2.context = r0
                boolean r0 = com.xuexiang.xhttp2.cache.RxCache.access$1500(r3)
                r2.isDiskCache = r0
                int r0 = com.xuexiang.xhttp2.cache.RxCache.access$1600(r3)
                r2.memoryMaxSize = r0
                int r0 = com.xuexiang.xhttp2.cache.RxCache.access$1700(r3)
                r2.appVersion = r0
                long r0 = com.xuexiang.xhttp2.cache.RxCache.access$1800(r3)
                r2.diskMaxSize = r0
                java.io.File r0 = com.xuexiang.xhttp2.cache.RxCache.access$1900(r3)
                r2.diskDir = r0
                com.xuexiang.xhttp2.cache.converter.IDiskConverter r0 = com.xuexiang.xhttp2.cache.RxCache.access$2000(r3)
                r2.diskConverter = r0
                java.lang.String r0 = com.xuexiang.xhttp2.cache.RxCache.access$1000(r3)
                r2.cacheKey = r0
                long r0 = com.xuexiang.xhttp2.cache.RxCache.access$1100(r3)
                r2.cacheTime = r0
                return
        }

        static /* synthetic */ android.content.Context access$000(com.xuexiang.xhttp2.cache.RxCache.Builder r0) {
                android.content.Context r0 = r0.context
                return r0
        }

        static /* synthetic */ boolean access$100(com.xuexiang.xhttp2.cache.RxCache.Builder r0) {
                boolean r0 = r0.isDiskCache
                return r0
        }

        static /* synthetic */ int access$200(com.xuexiang.xhttp2.cache.RxCache.Builder r0) {
                int r0 = r0.memoryMaxSize
                return r0
        }

        static /* synthetic */ java.lang.String access$300(com.xuexiang.xhttp2.cache.RxCache.Builder r0) {
                java.lang.String r0 = r0.cacheKey
                return r0
        }

        static /* synthetic */ long access$400(com.xuexiang.xhttp2.cache.RxCache.Builder r2) {
                long r0 = r2.cacheTime
                return r0
        }

        static /* synthetic */ java.io.File access$500(com.xuexiang.xhttp2.cache.RxCache.Builder r0) {
                java.io.File r0 = r0.diskDir
                return r0
        }

        static /* synthetic */ int access$600(com.xuexiang.xhttp2.cache.RxCache.Builder r0) {
                int r0 = r0.appVersion
                return r0
        }

        static /* synthetic */ long access$700(com.xuexiang.xhttp2.cache.RxCache.Builder r2) {
                long r0 = r2.diskMaxSize
                return r0
        }

        static /* synthetic */ com.xuexiang.xhttp2.cache.converter.IDiskConverter access$800(com.xuexiang.xhttp2.cache.RxCache.Builder r0) {
                com.xuexiang.xhttp2.cache.converter.IDiskConverter r0 = r0.diskConverter
                return r0
        }

        private static long calculateDiskCacheSize(java.io.File r5) {
                android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.IllegalArgumentException -> L18
                java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.IllegalArgumentException -> L18
                r0.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> L18
                int r5 = r0.getBlockCount()     // Catch: java.lang.IllegalArgumentException -> L18
                long r1 = (long) r5     // Catch: java.lang.IllegalArgumentException -> L18
                int r5 = r0.getBlockSize()     // Catch: java.lang.IllegalArgumentException -> L18
                long r3 = (long) r5     // Catch: java.lang.IllegalArgumentException -> L18
                long r1 = r1 * r3
                r3 = 50
                long r1 = r1 / r3
                goto L1a
            L18:
                r1 = 0
            L1a:
                r3 = 52428800(0x3200000, double:2.5903269E-316)
                long r0 = java.lang.Math.min(r1, r3)
                r2 = 5242880(0x500000, double:2.590327E-317)
                long r0 = java.lang.Math.max(r0, r2)
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder appVersion(int r1) {
                r0 = this;
                r0.appVersion = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache build() {
                r4 = this;
                boolean r0 = r4.isDiskCache
                if (r0 == 0) goto L4d
                java.io.File r0 = r4.diskDir
                if (r0 != 0) goto L14
                android.content.Context r0 = r4.context
                if (r0 == 0) goto L14
                java.lang.String r1 = "data-cache"
                java.io.File r0 = com.xuexiang.xhttp2.utils.Utils.getDiskCacheDir(r0, r1)
                r4.diskDir = r0
            L14:
                java.io.File r0 = r4.diskDir
                java.lang.String r1 = "diskDir == null"
                com.xuexiang.xhttp2.utils.Utils.checkNotNull(r0, r1)
                java.io.File r0 = r4.diskDir
                boolean r0 = r0.exists()
                if (r0 != 0) goto L28
                java.io.File r0 = r4.diskDir
                r0.mkdirs()
            L28:
                com.xuexiang.xhttp2.cache.converter.IDiskConverter r0 = r4.diskConverter
                if (r0 != 0) goto L33
                com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter r0 = new com.xuexiang.xhttp2.cache.converter.SerializableDiskConverter
                r0.<init>()
                r4.diskConverter = r0
            L33:
                long r0 = r4.diskMaxSize
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 > 0) goto L43
                java.io.File r0 = r4.diskDir
                long r0 = calculateDiskCacheSize(r0)
                r4.diskMaxSize = r0
            L43:
                r0 = 1
                int r1 = r4.appVersion
                int r0 = java.lang.Math.max(r0, r1)
                r4.appVersion = r0
                goto L61
            L4d:
                int r0 = r4.memoryMaxSize
                if (r0 > 0) goto L61
                java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
                long r0 = r0.maxMemory()
                r2 = 1024(0x400, double:5.06E-321)
                long r0 = r0 / r2
                int r0 = (int) r0
                int r0 = r0 / 8
                r4.memoryMaxSize = r0
            L61:
                r0 = -1
                long r2 = r4.cacheTime
                long r0 = java.lang.Math.max(r0, r2)
                r4.cacheTime = r0
                com.xuexiang.xhttp2.cache.RxCache r0 = new com.xuexiang.xhttp2.cache.RxCache
                r1 = 0
                r0.<init>(r4, r1)
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder cacheKey(java.lang.String r1) {
                r0 = this;
                r0.cacheKey = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder cacheTime(long r1) {
                r0 = this;
                r0.cacheTime = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder diskConverter(com.xuexiang.xhttp2.cache.converter.IDiskConverter r1) {
                r0 = this;
                r0.diskConverter = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder diskDir(java.io.File r1) {
                r0 = this;
                r0.diskDir = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder diskMax(long r1) {
                r0 = this;
                r0.diskMaxSize = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder init(android.content.Context r1) {
                r0 = this;
                r0.context = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder isDiskCache(boolean r1) {
                r0 = this;
                r0.isDiskCache = r1
                return r0
        }

        public com.xuexiang.xhttp2.cache.RxCache.Builder memoryMaxSize(int r1) {
                r0 = this;
                r0.memoryMaxSize = r1
                return r0
        }
    }

    private static abstract class SimpleSubscribe<T> implements io.reactivex.ObservableOnSubscribe<T> {
        private SimpleSubscribe() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ SimpleSubscribe(com.xuexiang.xhttp2.cache.RxCache.C09131 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        abstract T execute() throws java.lang.Throwable;

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(io.reactivex.ObservableEmitter<T> r3) throws java.lang.Exception {
                r2 = this;
                java.lang.Object r0 = r2.execute()     // Catch: java.lang.Throwable -> L17
                boolean r1 = r3.isDisposed()     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto Ld
                r3.onNext(r0)     // Catch: java.lang.Throwable -> L17
            Ld:
                boolean r0 = r3.isDisposed()
                if (r0 != 0) goto L16
                r3.onComplete()
            L16:
                return
            L17:
                r0 = move-exception
                com.xuexiang.xhttp2.logs.HttpLog.m36e(r0)
                boolean r1 = r3.isDisposed()
                if (r1 != 0) goto L24
                r3.onError(r0)
            L24:
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                return
        }
    }

    public RxCache() {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = new com.xuexiang.xhttp2.cache.RxCache$Builder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    private RxCache(com.xuexiang.xhttp2.cache.RxCache.Builder r9) {
            r8 = this;
            r8.<init>()
            android.content.Context r0 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$000(r9)
            r8.context = r0
            boolean r0 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$100(r9)
            r8.isDiskCache = r0
            int r0 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$200(r9)
            r8.memoryMaxSize = r0
            java.lang.String r0 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$300(r9)
            r8.cacheKey = r0
            long r0 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$400(r9)
            r8.cacheTime = r0
            java.io.File r4 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$500(r9)
            r8.diskDir = r4
            int r5 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$600(r9)
            r8.appVersion = r5
            long r6 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$700(r9)
            r8.diskMaxSize = r6
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r3 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$800(r9)
            r8.diskConverter = r3
            boolean r0 = r8.isDiskCache
            if (r0 == 0) goto L4b
            com.xuexiang.xhttp2.cache.core.CacheCore r9 = new com.xuexiang.xhttp2.cache.core.CacheCore
            com.xuexiang.xhttp2.cache.core.LruDiskCache r0 = new com.xuexiang.xhttp2.cache.core.LruDiskCache
            r2 = r0
            r2.<init>(r3, r4, r5, r6)
            r9.<init>(r0)
            r8.cacheCore = r9
            goto L5b
        L4b:
            com.xuexiang.xhttp2.cache.core.CacheCore r0 = new com.xuexiang.xhttp2.cache.core.CacheCore
            com.xuexiang.xhttp2.cache.core.LruMemoryCache r1 = new com.xuexiang.xhttp2.cache.core.LruMemoryCache
            int r9 = com.xuexiang.xhttp2.cache.RxCache.Builder.access$200(r9)
            r1.<init>(r9)
            r0.<init>(r1)
            r8.cacheCore = r0
        L5b:
            return
    }

    /* synthetic */ RxCache(com.xuexiang.xhttp2.cache.RxCache.Builder r1, com.xuexiang.xhttp2.cache.RxCache.C09131 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ java.lang.String access$1000(com.xuexiang.xhttp2.cache.RxCache r0) {
            java.lang.String r0 = r0.cacheKey
            return r0
    }

    static /* synthetic */ long access$1100(com.xuexiang.xhttp2.cache.RxCache r2) {
            long r0 = r2.cacheTime
            return r0
    }

    static /* synthetic */ com.xuexiang.xhttp2.cache.core.CacheCore access$1300(com.xuexiang.xhttp2.cache.RxCache r0) {
            com.xuexiang.xhttp2.cache.core.CacheCore r0 = r0.cacheCore
            return r0
    }

    static /* synthetic */ android.content.Context access$1400(com.xuexiang.xhttp2.cache.RxCache r0) {
            android.content.Context r0 = r0.context
            return r0
    }

    static /* synthetic */ boolean access$1500(com.xuexiang.xhttp2.cache.RxCache r0) {
            boolean r0 = r0.isDiskCache
            return r0
    }

    static /* synthetic */ int access$1600(com.xuexiang.xhttp2.cache.RxCache r0) {
            int r0 = r0.memoryMaxSize
            return r0
    }

    static /* synthetic */ int access$1700(com.xuexiang.xhttp2.cache.RxCache r0) {
            int r0 = r0.appVersion
            return r0
    }

    static /* synthetic */ long access$1800(com.xuexiang.xhttp2.cache.RxCache r2) {
            long r0 = r2.diskMaxSize
            return r0
    }

    static /* synthetic */ java.io.File access$1900(com.xuexiang.xhttp2.cache.RxCache r0) {
            java.io.File r0 = r0.diskDir
            return r0
    }

    static /* synthetic */ com.xuexiang.xhttp2.cache.converter.IDiskConverter access$2000(com.xuexiang.xhttp2.cache.RxCache r0) {
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r0 = r0.diskConverter
            return r0
    }

    static /* synthetic */ void access$900(com.xuexiang.xhttp2.cache.RxCache r0, com.xuexiang.xhttp2.cache.model.CacheMode r1) {
            r0.logCacheInfo(r1)
            return
    }

    public static com.xuexiang.xhttp2.cache.key.ICacheKeyCreator getICacheKeyCreator() {
            com.xuexiang.xhttp2.cache.key.ICacheKeyCreator r0 = com.xuexiang.xhttp2.cache.RxCache.sICacheKeyCreator
            if (r0 != 0) goto Lb
            com.xuexiang.xhttp2.cache.key.DefaultCacheKeyCreator r0 = new com.xuexiang.xhttp2.cache.key.DefaultCacheKeyCreator
            r0.<init>()
            com.xuexiang.xhttp2.cache.RxCache.sICacheKeyCreator = r0
        Lb:
            com.xuexiang.xhttp2.cache.key.ICacheKeyCreator r0 = com.xuexiang.xhttp2.cache.RxCache.sICacheKeyCreator
            return r0
    }

    private com.xuexiang.xhttp2.cache.stategy.IStrategy loadStrategy(com.xuexiang.xhttp2.cache.model.CacheMode r5) {
            r4 = this;
            java.lang.Class<com.xuexiang.xhttp2.cache.stategy.IStrategy> r0 = com.xuexiang.xhttp2.cache.stategy.IStrategy.class
            java.lang.Package r0 = r0.getPackage()     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L30
            r1.<init>()     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = r5.getClassName()     // Catch: java.lang.Exception -> L30
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L30
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L30
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L30
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L30
            com.xuexiang.xhttp2.cache.stategy.IStrategy r0 = (com.xuexiang.xhttp2.cache.stategy.IStrategy) r0     // Catch: java.lang.Exception -> L30
            return r0
        L30:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "loadStrategy("
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = ") err!!"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    private void logCacheInfo(com.xuexiang.xhttp2.cache.model.CacheMode r3) {
            r2 = this;
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE
            java.lang.String r1 = "cacheMode="
            if (r3 == r0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = ", cacheKey="
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = r2.cacheKey
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = ", cacheTime="
            java.lang.StringBuilder r3 = r3.append(r0)
            long r0 = r2.cacheTime
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = "(s)"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r3)
            goto L45
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            com.xuexiang.xhttp2.logs.HttpLog.m37i(r3)
        L45:
            return
    }

    public static void setICacheKeyCreator(com.xuexiang.xhttp2.cache.key.ICacheKeyCreator r0) {
            com.xuexiang.xhttp2.cache.RxCache.sICacheKeyCreator = r0
            return
    }

    public io.reactivex.Observable<java.lang.Boolean> clear() {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$6 r0 = new com.xuexiang.xhttp2.cache.RxCache$6
            r0.<init>(r1)
            io.reactivex.Observable r0 = io.reactivex.Observable.create(r0)
            return r0
    }

    public io.reactivex.Observable<java.lang.Boolean> containsKey(java.lang.String r2) {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$4 r0 = new com.xuexiang.xhttp2.cache.RxCache$4
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.Observable.create(r0)
            return r2
    }

    public int getAppVersion() {
            r1 = this;
            int r0 = r1.appVersion
            return r0
    }

    public com.xuexiang.xhttp2.cache.core.CacheCore getCacheCore() {
            r1 = this;
            com.xuexiang.xhttp2.cache.core.CacheCore r0 = r1.cacheCore
            return r0
    }

    public java.lang.String getCacheKey() {
            r1 = this;
            java.lang.String r0 = r1.cacheKey
            return r0
    }

    public long getCacheTime() {
            r2 = this;
            long r0 = r2.cacheTime
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public com.xuexiang.xhttp2.cache.converter.IDiskConverter getDiskConverter() {
            r1 = this;
            com.xuexiang.xhttp2.cache.converter.IDiskConverter r0 = r1.diskConverter
            return r0
    }

    public java.io.File getDiskDir() {
            r1 = this;
            java.io.File r0 = r1.diskDir
            return r0
    }

    public long getDiskMaxSize() {
            r2 = this;
            long r0 = r2.diskMaxSize
            return r0
    }

    public <T> io.reactivex.Observable<T> load(java.lang.reflect.Type r3, java.lang.String r4) {
            r2 = this;
            r0 = -1
            io.reactivex.Observable r3 = r2.load(r3, r4, r0)
            return r3
    }

    public <T> io.reactivex.Observable<T> load(java.lang.reflect.Type r8, java.lang.String r9, long r10) {
            r7 = this;
            com.xuexiang.xhttp2.cache.RxCache$2 r6 = new com.xuexiang.xhttp2.cache.RxCache$2
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r8 = io.reactivex.Observable.create(r6)
            return r8
    }

    public com.xuexiang.xhttp2.cache.RxCache.Builder newBuilder() {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$Builder r0 = new com.xuexiang.xhttp2.cache.RxCache$Builder
            r0.<init>(r1)
            return r0
    }

    public io.reactivex.Observable<java.lang.Boolean> remove(java.lang.String r2) {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$5 r0 = new com.xuexiang.xhttp2.cache.RxCache$5
            r0.<init>(r1, r2)
            io.reactivex.Observable r2 = io.reactivex.Observable.create(r0)
            return r2
    }

    public <T> io.reactivex.Observable<java.lang.Boolean> save(java.lang.String r2, T r3) {
            r1 = this;
            com.xuexiang.xhttp2.cache.RxCache$3 r0 = new com.xuexiang.xhttp2.cache.RxCache$3
            r0.<init>(r1, r2, r3)
            io.reactivex.Observable r2 = io.reactivex.Observable.create(r0)
            return r2
    }

    public <T> io.reactivex.ObservableTransformer<T, com.xuexiang.xhttp2.cache.model.CacheResult<T>> transformer(com.xuexiang.xhttp2.cache.model.CacheMode r3, java.lang.reflect.Type r4) {
            r2 = this;
            com.xuexiang.xhttp2.cache.stategy.IStrategy r0 = r2.loadStrategy(r3)
            com.xuexiang.xhttp2.cache.RxCache$1 r1 = new com.xuexiang.xhttp2.cache.RxCache$1
            r1.<init>(r2, r3, r4, r0)
            return r1
    }
}
