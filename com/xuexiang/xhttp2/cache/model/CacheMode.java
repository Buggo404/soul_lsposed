package com.xuexiang.xhttp2.cache.model;

/* loaded from: classes.dex */
public enum CacheMode extends java.lang.Enum<com.xuexiang.xhttp2.cache.model.CacheMode> {
    private static final /* synthetic */ com.xuexiang.xhttp2.cache.model.CacheMode[] $VALUES = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode CACHE_REMOTE = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode CACHE_REMOTE_DISTINCT = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode DEFAULT = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode FIRST_CACHE = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode FIRST_REMOTE = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode NO_CACHE = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode ONLY_CACHE = null;
    public static final com.xuexiang.xhttp2.cache.model.CacheMode ONLY_REMOTE = null;
    private final java.lang.String className;

    static {
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r1 = "NO_CACHE"
            r2 = 0
            java.lang.String r3 = "NoStrategy"
            r0.<init>(r1, r2, r3)
            com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE = r0
            com.xuexiang.xhttp2.cache.model.CacheMode r1 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r4 = "DEFAULT"
            r5 = 1
            r1.<init>(r4, r5, r3)
            com.xuexiang.xhttp2.cache.model.CacheMode.DEFAULT = r1
            com.xuexiang.xhttp2.cache.model.CacheMode r3 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r4 = "FirstRemoteStrategy"
            java.lang.String r6 = "FIRST_REMOTE"
            r7 = 2
            r3.<init>(r6, r7, r4)
            com.xuexiang.xhttp2.cache.model.CacheMode.FIRST_REMOTE = r3
            com.xuexiang.xhttp2.cache.model.CacheMode r4 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r6 = "FirstCacheStategy"
            java.lang.String r8 = "FIRST_CACHE"
            r9 = 3
            r4.<init>(r8, r9, r6)
            com.xuexiang.xhttp2.cache.model.CacheMode.FIRST_CACHE = r4
            com.xuexiang.xhttp2.cache.model.CacheMode r6 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r8 = "OnlyRemoteStrategy"
            java.lang.String r10 = "ONLY_REMOTE"
            r11 = 4
            r6.<init>(r10, r11, r8)
            com.xuexiang.xhttp2.cache.model.CacheMode.ONLY_REMOTE = r6
            com.xuexiang.xhttp2.cache.model.CacheMode r8 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r10 = "OnlyCacheStrategy"
            java.lang.String r12 = "ONLY_CACHE"
            r13 = 5
            r8.<init>(r12, r13, r10)
            com.xuexiang.xhttp2.cache.model.CacheMode.ONLY_CACHE = r8
            com.xuexiang.xhttp2.cache.model.CacheMode r10 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r12 = "CacheAndRemoteStrategy"
            java.lang.String r14 = "CACHE_REMOTE"
            r15 = 6
            r10.<init>(r14, r15, r12)
            com.xuexiang.xhttp2.cache.model.CacheMode.CACHE_REMOTE = r10
            com.xuexiang.xhttp2.cache.model.CacheMode r12 = new com.xuexiang.xhttp2.cache.model.CacheMode
            java.lang.String r14 = "CacheAndRemoteDistinctStrategy"
            java.lang.String r15 = "CACHE_REMOTE_DISTINCT"
            r13 = 7
            r12.<init>(r15, r13, r14)
            com.xuexiang.xhttp2.cache.model.CacheMode.CACHE_REMOTE_DISTINCT = r12
            r14 = 8
            com.xuexiang.xhttp2.cache.model.CacheMode[] r14 = new com.xuexiang.xhttp2.cache.model.CacheMode[r14]
            r14[r2] = r0
            r14[r5] = r1
            r14[r7] = r3
            r14[r9] = r4
            r14[r11] = r6
            r0 = 5
            r14[r0] = r8
            r0 = 6
            r14[r0] = r10
            r14[r13] = r12
            com.xuexiang.xhttp2.cache.model.CacheMode.$VALUES = r14
            return
    }

    CacheMode(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.className = r3
            return
    }

    public static com.xuexiang.xhttp2.cache.model.CacheMode valueOf(java.lang.String r1) {
            java.lang.Class<com.xuexiang.xhttp2.cache.model.CacheMode> r0 = com.xuexiang.xhttp2.cache.model.CacheMode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.xuexiang.xhttp2.cache.model.CacheMode r1 = (com.xuexiang.xhttp2.cache.model.CacheMode) r1
            return r1
    }

    public static com.xuexiang.xhttp2.cache.model.CacheMode[] values() {
            com.xuexiang.xhttp2.cache.model.CacheMode[] r0 = com.xuexiang.xhttp2.cache.model.CacheMode.$VALUES
            java.lang.Object r0 = r0.clone()
            com.xuexiang.xhttp2.cache.model.CacheMode[] r0 = (com.xuexiang.xhttp2.cache.model.CacheMode[]) r0
            return r0
    }

    public java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }
}
